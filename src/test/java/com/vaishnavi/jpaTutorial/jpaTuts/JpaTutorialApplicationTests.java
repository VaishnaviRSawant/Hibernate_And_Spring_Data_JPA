package com.vaishnavi.jpaTutorial.jpaTuts;

import com.vaishnavi.jpaTutorial.jpaTuts.entities.ProductEntity;
import com.vaishnavi.jpaTutorial.jpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutorialApplicationTests {
	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
	}

	@Test
	@Rollback(value = false)
	void testRepository() {
		ProductEntity productEntity = ProductEntity.builder()
				.sku("nestle234")
				.title("nestle Chocolate")
				.price(BigDecimal.valueOf(23.45))
				.quantity(4)
				.build();
		ProductEntity saveProductEntity = productRepository.save(productEntity);
		System.out.println(saveProductEntity);
	}

	@Test
	void getRepository() {
//		List<ProductEntity> entities = productRepository.findByCreatedAtAfter(
//				LocalDateTime.of(224,1,1,0,0,0));
//		List<ProductEntity> entities = productRepository.findByQuantityGreaterThanOrPriceLessThan(4,BigDecimal.valueOf(23.45));

		List<ProductEntity> entities = productRepository.findByTitleContainingIgnoreCase("choco",null);

		System.out.println(entities);

	}

	@Test
	void getSingleFromRepository(){
		Optional<ProductEntity> productEntity =  productRepository.findByTitleAndPrice("nestle Chocolate",BigDecimal.valueOf(23.45));
		productEntity.ifPresent(System.out::println);
	}



}