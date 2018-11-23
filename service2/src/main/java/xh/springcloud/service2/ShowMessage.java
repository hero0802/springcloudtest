package xh.springcloud.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ShowMessage {
    @Autowired
    FeignTest feignTest;

    @GetMapping("/user/{name}")
    public Map<String,Object> user(@PathVariable("name") String name){
        return feignTest.user(name);
    }
}
