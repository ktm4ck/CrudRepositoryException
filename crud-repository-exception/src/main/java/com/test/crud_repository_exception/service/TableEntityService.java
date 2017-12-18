package com.test.crud_repository_exception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crud_repository_exception.model.TableEntity;
import com.test.crud_repository_exception.repository.TableEntityRepository;

@Service
public class TableEntityService {
	
	@Autowired
	private TableEntityRepository tableEntityRepository;
	
	public List<TableEntity> findbyCol1AndCol2(String col1Val, String col2Val) {
		return tableEntityRepository.findbyCol1AndCol2(col1Val, col2Val);
		
	}
}
