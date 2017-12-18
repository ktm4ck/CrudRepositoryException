package com.test.crud_repository_exception.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.test.crud_repository_exception.entity.TableEntity;

public interface TableEntityRepository extends CrudRepository<TableEntity, String>{

		@Query(value= " select * from table_entity "
	        +   " where lower(col1) = lower(?1) "
	        +   " and lower(col2) = lower('001:1') "
	        , nativeQuery = true)
	  public List<TableEntity> findByCol1 (String col1);
	
	
	
	
}
