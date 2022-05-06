package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDTO {

    private String searchDateType;                  // 상품 등록일

    private ItemSellStatus searchSellStatus;        // 상품 판매 상태

    private String searchBy;                        // 상품 조회 유형(상품명 or 상품 등록자 아이디)

    private String searchQuery = "";                // 상품 조회를 위한 검색어 변수
}
