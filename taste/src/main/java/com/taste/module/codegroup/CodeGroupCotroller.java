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
	public String codegroupXdmList(Model model) {
		model.addAttribute("list", codeGroupService.selectList());
		return "/xdm/codegroup/codegroupXdmList";
	}
	
//	@RequestMapping(value = "/codegroup/codegroupXdmView")
//	public String codegroupXdmView(Model model, CodeGroupDto codegroupDto) {
//	
//				
//		model.addAttribute("item", codeGroupService.selectOne(codegroupDto));		
//		return "/xdm/codegroup/codegroupXdmView";
//	}
		
	
	@RequestMapping(value = "/codegroup/codegroupXdmForm")
	public String codegroupXdmForm() {
		
		return "/xdm/codegroup/codegroupXdmForm";
	}
		
	@RequestMapping(value = "/codegroup/codegroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codegroupDto) {
//		System.out.println("codegroupDto.getifcgseq(): " + codegroupDto.getifcgseq());
		System.out.println("codegroupDto.getifcgName(): " + codegroupDto.getIfcgName());
		
		codeGroupService.insert(codegroupDto);
//		System.out.println("codegroupDto.getifcgseq(): " + codegroupDto.getifcgseq());
		
		return "redirect:/xdm/codegroup/codegroupXdmList";	
	}
	
//	@RequestMapping(value = "/codegroup/codegroupXdmMfom")
//	public String codegroupXdmMfom(CodeGroupDto codegroupDto, Model model) {
//		
//		model.addAttribute("item", codeGroupService.selectOne(codegroupDto));	
//		
//		return "/xdm/codegroup/codegroupXdmMfom";
//	}	
//	
}
