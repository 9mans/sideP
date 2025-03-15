package com.sample.solo.side.item.entity;

import com.sample.solo.side.item.dto.ItemDTO;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String imgPath;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime created;


    public ItemDTO toDto() {
        return ItemDTO.builder()
                .id(id)
                .name(name)
                .imgPath(imgPath)
                .price(price)
                .build();
    }

}
