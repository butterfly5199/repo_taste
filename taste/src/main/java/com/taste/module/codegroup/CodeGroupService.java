package com.taste.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao codeGroupDao; 
	
	public List<CodeGroupDto> selecList() {
		return codeGroupDao.selectList();
	}
	
	public CodeGroupDto selecOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return codeGroupDao.insert(codeGroupDto);
	}
	
//	public int update(CodeGroupDto codeGroupDto) { 
//		return codeGroupDao.update(codeGroupDto); 
//	}
//	
//	public int delete(CodeGroupDto codeGroupDto) { 
//		return codeGroupDao.delete(codeGroupDto); 
//	}
//	
//	public int uelete(CodeGroupDto codeGroupDto) {
//		return codeGroupDao.uelete(codeGroupDto); 
//	}
	
}
