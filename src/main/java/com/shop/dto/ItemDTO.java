package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDTO {

    private Long id;                    // 상품 코드
    private String itemNm;              // 상품명
    private Integer price;              // 가격
    private String itemDetail;          // 상품 상세 설명
    private String sellStatCd;          // 상품 상태 코드
    private LocalDateTime regTime;      // 등록 시간
    private LocalDateTime updateTime;   // 수정 시간

}
