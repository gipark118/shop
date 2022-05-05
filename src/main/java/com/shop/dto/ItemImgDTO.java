package com.shop.dto;

import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class ItemImgDTO {

    private Long id;            // 상품 이미지 코드

    private String imgName;     // 이미지 파일명

    private String oriImgName;  // 원본 이미지 파일명

    private String imgUrl;      // 이미지 조회 경로

    private String repImgYn;    // 대표 이미지 여부

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDTO of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDTO.class);
    }
}