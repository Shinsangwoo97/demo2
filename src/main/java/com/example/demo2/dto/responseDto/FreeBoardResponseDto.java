package com.example.demo2.dto.responseDto;

import java.sql.Timestamp;
import lombok.Getter;

@Getter
public class FreeBoardResponseDto {

    private long id;

    private String kategorie;

    private String photo;

    private String title;

    private String name;

    private int count;

    private Timestamp creatTime;

    private Timestamp putTime;
}