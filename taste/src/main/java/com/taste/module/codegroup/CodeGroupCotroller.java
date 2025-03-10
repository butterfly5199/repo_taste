package com.taste.module.codegroup;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupCotroller {

//	@Autowired
//	CodeGroupService codeGroupService;
//	
	@RequestMapping(value="/codegroup/codegroupXdmList")
	public String codegroupXdmList(Model model) {
		model.addAllAttributes("list",codegroupService.selectList());
		return "codegroup/codegroupXdmList";
	}
	
//	@RequestMapping(value = "/codegroup/codegroupXdmView")
//	public String codegroupXdmView(Model model, Group1Dto group1Dto) {
//	
//				
//		model.addAttribute("item", group1Service.selectOne(group1Dto));		
//		return "group1/group1XdmView";
//	}
//		
//	
//	@RequestMapping(value = "/group1/group1XdmForm")
//	public String group1XdmForm() {
//		
//		return "group1/group1XdmForm";
//	}
//	
//	
//	@RequestMapping(value = "/group1/group1XdmInst")
//	public String group1XdmInst(Group1Dto group1Dto) {
//		System.out.println("group1Dto.getSeq(): " + group1Dto.getSeq());
//		System.out.println("group1Dto.getName(): " + group1Dto.getName());
//		
//		group1Service.insert(group1Dto);
//		System.out.println("group1Dto.getSeq(): " + group1Dto.getSeq());
//		
//		return "redirect:/group1/group1XdmList";	
//	}
//	
//	@RequestMapping(value = "/group1/group1XdmMfom")
//	public String group1XdmMfom(Group1Dto group1Dto, Model model) {
//		
//		model.addAttribute("item", group1Service.selectOne(group1Dto));	
//		
//		return "/group1/group1XdmMfom";
//	}	
	
	
	
	
}
