package com.example.chapter20.gamecrud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class GameDto {
    private Integer id;
    private String name;
    private String genre;
    private String grade;
    private Integer price;
    private String imgUrl;

}
