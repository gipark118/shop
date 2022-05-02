package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;                    // 상품 코드

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;                  // 상품 엔티티

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;                // 주문 엔티티

    private int orderPrice;             // 주문가격

    private int count;                  // 수량

    private LocalDateTime regTime;      // 등록시간

    private LocalDateTime updateTime;   // 수정시간
}
