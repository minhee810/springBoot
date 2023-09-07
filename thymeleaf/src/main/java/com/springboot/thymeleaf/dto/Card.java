package com.springboot.thymeleaf.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.YearMonth;

@Getter
@Setter
@NoArgsConstructor
public class Card {
    private String no;
    private YearMonth validMonth;
    // 주석 정리 추가
    // 주석 두번째 수정
}
