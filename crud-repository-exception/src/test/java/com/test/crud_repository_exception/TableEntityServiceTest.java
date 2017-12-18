package com.test.crud_repository_exception;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.crud_repository_exception.model.TableEntity;
import com.test.crud_repository_exception.repository.TableEntityRepository;
import com.test.crud_repository_exception.service.TableEntityService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TableEntityServiceTest {

	@Autowired
	private TableEntityService tableEntityService;
	
	@MockBean
	private TableEntityRepository tableEntityRepository;
	
	@Before
	public void setUp() {
		TableEntity tableEntity = new TableEntity();
		tableEntity.setCol1("001");
		tableEntity.setCol2("002");
		List<TableEntity> tableEntityList = new ArrayList<TableEntity>();
		tableEntityList.add(tableEntity);
		
		Mockito.when(tableEntityRepository.findbyCol1AndCol2(tableEntity.getCol1(), tableEntity.getCol2()))
			.thenReturn(tableEntityList);
		
		//Mockito.when(tableEntityRepository.save(tableEntity)).thenReturn(tableEntity);
		
	}
	
	@Test
	public void test() {
	
		//assertThat(mockRepository.save(tableEntity)).isEqualTo(tableEntity);
		
		String col1 = "001";
		String col2 = "002";
		
		TableEntity found = (tableEntityService.findbyCol1AndCol2(col1, col2)).get(0);
		
		assertThat(found.getCol1()).isEqualTo(col1);
		
	}
}
