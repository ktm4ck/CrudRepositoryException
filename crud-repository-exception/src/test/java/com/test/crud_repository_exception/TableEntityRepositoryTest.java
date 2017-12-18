package com.test.crud_repository_exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.crud_repository_exception.entity.TableEntity;
import com.test.crud_repository_exception.repository.TableEntityRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;



@RunWith(SpringRunner.class)
@DataJpaTest
public class TableEntityRepositoryTest {
	
	@Autowired
	private TableEntityRepository tableEntityRepository;
	
	
	
	@Autowired
    private TestEntityManager entityManager;

	

	@Test
	public void test1() {
		
		//given
		TableEntity tableEntity = new TableEntity();
		tableEntity.setCol1("001");
		tableEntity.setCol2("001:1");
		
		
		
		entityManager.persist(tableEntity);
		entityManager.flush();
		
		
		// when
		TableEntity found = new TableEntity();
		List<TableEntity> foundList = tableEntityRepository.findByCol1("001");
		if (foundList != null && !foundList.isEmpty()) {
			found = foundList.get(0);
		}
			
		// then
		assertThat(found.getCol1()).isEqualTo(tableEntity.getCol1());
		
	}
	

}