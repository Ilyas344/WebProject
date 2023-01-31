package com.example.webproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping()
public String student(){
    return "Приложение запущено";
}
    @GetMapping("/info")
public String info(){
        return "Имя ученика: Кучукбаев Ильяс, Название проекта: Изучение Spring Java, дата:1.02.2023 00:02 \n"+
                "Название проекта: Введение в Maven и сборку проектов "+
                "Функция: Web разработка "+
                "Технологии: Spring "+
                "Язык: java";
};
}

