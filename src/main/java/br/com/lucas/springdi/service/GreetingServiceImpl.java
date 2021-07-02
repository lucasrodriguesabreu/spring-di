package br.com.lucas.springdi.service;

public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Olá, mundo!";
    }
}
