package com.yasong.yin.playinggo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yasong.yin.playinggo.mapper")
public class PlayingGoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayingGoApplication.class, args);
    }
}
