package io.github.erickFernandesfps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de vendas";
    }

    @Bean(name = "outraConfiduracao")
    public String outraConfiguracao(){
        return "Sistema de vendas";
    }
}
