package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekaZuul9527Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuul9527Application.class, args);
    }

}
