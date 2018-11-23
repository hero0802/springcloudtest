package xh.springcloud.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("service1")
public interface FeignTest {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    Map<String,Object> user(@RequestParam(value = "name") String name);

}
