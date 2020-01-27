package springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.EurekaFeignService;

import javax.annotation.Resource;

@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignInfo")
    public String feignInfo() {
        String message = eurekaFeignService.getInfo();
        return "获取到的信息:" + message;
    }

}
