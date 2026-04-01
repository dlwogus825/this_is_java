package com.example.chapter20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.chapter20.CommonResponse;
import com.example.chapter20.gamecrud.GameService;
import com.example.chapter20.gamecrud.GameDto;
import com.example.chapter20.gamecrud.SearchDto;

@SpringBootApplication
public class Chapter20Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter20Application.class, args);
    }

}
