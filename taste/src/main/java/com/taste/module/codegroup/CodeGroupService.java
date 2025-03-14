package com.taste.module.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

	@Autowired
	CodeGroupDao codeGroupDao; 
	
	public List<CodeGroupDto> selectList() {
		return codeGroupDao.selectList();
	}
	
	public int selectOneCount() {
		return codeGroupDao.selectOneCount();
	}
	
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}
	
	public int insert(CodeGroupDto codeGroupDto) {
		return codeGroupDao.insert(codeGroupDto);
	}
	
	public int update(CodeGroupDto codeGroupDto) { 
		return codeGroupDao.update(codeGroupDto); 
	}
	
	public int delete(CodeGroupDto codeGroupDto) { 
		return codeGroupDao.delete(codeGroupDto); 
	}
	
	public int uelete(CodeGroupDto codeGroupDto) {
		return codeGroupDao.uelete(codeGroupDto); 
	}
	
}
