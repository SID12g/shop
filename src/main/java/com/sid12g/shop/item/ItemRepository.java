package com.sid12g.shop.item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findPageBy(Pageable page); // Page 대신 Slice 쓰면 Page 개수 못 세는 대신 부담 덜 줌
}
