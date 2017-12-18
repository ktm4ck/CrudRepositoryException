package com.test.crud_repository_exception.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.test.crud_repository_exception.model.TableEntity;

public interface TableEntityRepository extends CrudRepository<TableEntity, String>{

	@Query(value= " select * from table_entity "
	        +   " where lower(col1) = lower(?1) "
	        +   " and lower(col2) = lower(?2) "
	        +   " and state_ind = 1 "
	        +   " and end_date is null "
	        , nativeQuery = true)
	  public List<TableEntity> findbyCol1AndCol2 (String col1, String col2);
}
