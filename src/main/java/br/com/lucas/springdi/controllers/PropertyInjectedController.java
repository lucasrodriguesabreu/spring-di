package br.com.lucas.springdi.controllers;

import br.com.lucas.springdi.service.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
