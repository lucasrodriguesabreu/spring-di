package br.com.lucas.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Olá mundo - Property!";
    }
}
