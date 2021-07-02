package br.com.lucas.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayGreeting(){
        System.out.println("Olá, mundo!");

        return "Olá pessoal!";
    }
}
