package com.sid12g.shop.sales;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
    @Query(value = "SELECT s FROM Sales s JOIN FETCH s.member ")
    List<Sales> customFindAll();
}
