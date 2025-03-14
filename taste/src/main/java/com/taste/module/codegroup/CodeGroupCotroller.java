package com.taste.module.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupCotroller {

	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value="/codegroup/codegroupXdmList")
	public String codegroupXdmList(CodeGroupVo vo, Model model) {
		
		vo.setParamsPaging(codeGroupService.selectOneCount());
		
//		int a = codeGroupService.selectOneCount();
		
//		if(vo.getTotalRows()>0) {
		model.addAttribute("list", codeGroupService.selectList());		
		model.addAttribute("vo", vo);
//		}		
		
		return "/xdm/codegroup/codegroupXdmList";
	}
	
	@RequestMapping(value = "/codegroup/codegroupXdmView")
	public String codegroupXdmView(Model model, CodeGroupDto codeGroupDto) {
					
		model.addAttribute("item", codeGroupService.selectOne(codeGroupDto));		
	
		return "/xdm/codegroup/codegroupXdmView";
	}
		
	
	@RequestMapping(value = "/codegroup/codegroupXdmForm")
	public String codegroupXdmForm() {
		
		return "xdm/codegroup/codegroupXdmForm";
	}
		
	@RequestMapping(value = "/codegroup/codegroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codeGroupDto) {
//		System.out.println("codegroupDto.getifcgseq(): " + codegroupDto.getifcgseq());

		
		codeGroupService.insert(codeGroupDto);
//		System.out.println("codegroupDto.getifcgseq(): " + codegroupDto.getifcgseq());
		
		return "redirect:/xdm/codegroup/codegroupXdmList";	
	}
	
	@RequestMapping(value = "/codegroup/codegroupXdmMfom")
	public String codegroupXdmMfom(CodeGroupDto codeGroupDto, Model model) {
		
		model.addAttribute("item", codeGroupService.selectOne(codeGroupDto));	
		
		return "/xdm/codegroup/codegroupXdmMfom";
	}	
	
}
