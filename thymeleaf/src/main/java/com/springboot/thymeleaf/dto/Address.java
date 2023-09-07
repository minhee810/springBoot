package com.springboot.thymeleaf.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {
    // 주석 추가
    private String postCode;
    private String location;
    private String address;
    private String attribute;
    // git 어렵네
}
