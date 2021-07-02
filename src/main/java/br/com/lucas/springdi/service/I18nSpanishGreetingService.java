package br.com.lucas.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Holá mundo - Spanish!";
    }
}
