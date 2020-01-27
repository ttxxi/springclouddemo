package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 启用 Eureka 服务发现
@EnableFeignClients // 启用 Feign
@EnableHystrix // Feign默认是开启，这个注解可以不加的
public class EurekaFeign81Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeign81Application.class, args);
    }

}
