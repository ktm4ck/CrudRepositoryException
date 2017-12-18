package com.test.crud_repository_exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
//import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.test.crud_repository_exception.model.TableEntity;
import com.test.crud_repository_exception.repository.TableEntityRepository;

import static org.assertj.core.api.Assertions.assertThat;



@RunWith(SpringRunner.class)
@DataJpaTest
public class TableRepositoryTest {
	
	//@MockBean(value=MyRepository.class)
	//@Autowired
	//@Mock
	@Autowired
	private TableEntityRepository tableEntityRepository;
	
	
	@Autowired
    private TestEntityManager entityManager;

	

	@Test
	public void test() {
		
		//given
		TableEntity tableEntity = new TableEntity();
		tableEntity.setCol1("001");
		tableEntity.setCol2("002");
		tableEntity.setStateInd(1L);
		entityManager.persist(tableEntity);
		entityManager.flush();
		
		// when
		TableEntity found = (tableEntityRepository.findbyCol1AndCol2("001", "002")).get(0);
			
		// then
		assertThat(found.getCol1()).isEqualTo(tableEntity.getCol1());
		
	}

}