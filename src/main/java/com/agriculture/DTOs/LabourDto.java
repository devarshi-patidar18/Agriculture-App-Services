package com.agriculture.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LabourDto {


    private Long labourId;
    private String labourName;
    private Float dailyRates;
    private String address;
    private String gender;

    private Long userId;


}
