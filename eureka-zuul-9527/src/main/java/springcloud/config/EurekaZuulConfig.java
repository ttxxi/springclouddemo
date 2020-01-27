package springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcloud.filter.AuthFilter;

@Configuration
public class EurekaZuulConfig {

    @Bean
    public AuthFilter authFilter(){
        return new AuthFilter();
    }

}
