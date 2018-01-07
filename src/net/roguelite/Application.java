package net.roguelite;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner clr(ApplicationContext ctx) {
        return args -> {
            System.out.println("Inspection.");

            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String name : beans) {
                System.out.println(name);
            }
        };
    }
}