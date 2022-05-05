package com.shop.dto;

import com.shop.constant.ItemSellStatus;
import com.shop.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemFormDTO {

    private Long id;                                                // 상품 코드

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String itemNm;                                          // 상품명

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private Integer price;                                          // 가격

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String itemDetail;                                      // 상품 상세 설명

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer StockNumber;                                    // 상품 수량

    private ItemSellStatus itemSellStatus;                          // 상품 판매 상태

    private List<ItemImgDTO> itemImgDTOList = new ArrayList<>();    // 상품 이미지 DTO 배열

    private List<Long> itemImgIds = new ArrayList<>();              // 상품 이미지 코드 배열

    private static ModelMapper modelMapper = new ModelMapper();     // ModelMapper 객체 추가

    public Item createItem() {
        return modelMapper.map(this, Item.class);
    }

    public static ItemFormDTO of(Item item) {
        return modelMapper.map(item, ItemFormDTO.class);
    }
}