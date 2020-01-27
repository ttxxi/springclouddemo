package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class EurekaHystrixTurbine9002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixTurbine9002Application.class, args);
    }

}
