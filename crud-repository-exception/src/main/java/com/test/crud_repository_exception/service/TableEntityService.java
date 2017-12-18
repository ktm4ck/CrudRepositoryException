package com.test.crud_repository_exception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crud_repository_exception.entity.TableEntity;
import com.test.crud_repository_exception.repository.TableEntityRepository;

@Service
public class TableEntityService {
	
	@Autowired
	private TableEntityRepository tableEntityRepository;
	
	public List<TableEntity> findByCol1(String col1Val) {
		return tableEntityRepository.findByCol1(col1Val);
		
	}
}
