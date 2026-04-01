package com.example.chapter20.gamecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.chapter20.CommonResponse;
import com.example.chapter20.gamecrud.GameService;
import com.example.chapter20.gamecrud.GameDto;
import com.example.chapter20.gamecrud.SearchDto;


import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchDto {
    private String searchName;
    private String searchGrade;
    private String searchGenre;
}

