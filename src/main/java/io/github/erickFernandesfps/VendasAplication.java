package io.github.erickFernandesfps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasAplication {
    /**
     *
     * @param args
     * fornece uma maneira conveniente de inicializar um aplicativo Spring que é iniciado a partir de
     * um método main (). Em muitas situações,você pode delegar ao método estático SpringApplication.run
     * , conforme mostrado no exemplo a seguir
     */
    public static void main(String[] args) {
        SpringApplication.run(VendasAplication.class, args);

    }
    /*
    @Autowired
    @Qualifier("Gato")
    private Animal animal;
*/
    @Gato
    private Animal animal;

    @Bean(name = "executarAnimal")
    public CommandLineRunner executar() {
        return args -> {
            this.animal.fazerBarulho();

        };
    }

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName;
    }

}
