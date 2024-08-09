package com.sid12g.shop.item;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findPageBy(Pageable page); // Page 대신 Slice 쓰면 Page 개수 못 세는 대신 부담 덜 줌

    List<Item> findAllByTitleContains(String title);

    @Query(value = "SELECT * FROM item WHERE to_tsvector('english', title) @@ plainto_tsquery('english', ?1)", nativeQuery = true)
    List<Item> rawQuery1(String text);

}
