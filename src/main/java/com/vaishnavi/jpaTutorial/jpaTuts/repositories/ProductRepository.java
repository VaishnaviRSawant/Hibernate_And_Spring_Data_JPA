package com.vaishnavi.jpaTutorial.jpaTuts.repositories;

import com.vaishnavi.jpaTutorial.jpaTuts.entities.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findByTitle(String title, Pageable pageable);

    List<ProductEntity> findBy(Sort sort);

    List<ProductEntity> findByQuantityAndPrice(int quantity, BigDecimal price);

    List<ProductEntity> findByQuantityGreaterThanOrPriceLessThan(int quantity, BigDecimal price);

    List<ProductEntity> findByTitleLike(String title);


    List<ProductEntity> findByTitleContaining(String title);

    List<ProductEntity> findByTitleContainingIgnoreCase(String title,Pageable pageable);

    List<ProductEntity> findByOrderByPrice();

    //Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);

    @Query("select e.title from ProductEntity e where e.title=:title and e.price=:price") // jpql query
    Optional<ProductEntity> findByTitleAndPrice(String title , BigDecimal price);


}
