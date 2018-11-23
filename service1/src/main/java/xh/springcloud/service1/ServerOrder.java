package xh.springcloud.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ServerOrder {

    @GetMapping("/user")
    public Map<String,Object> user(@RequestParam String name){
        Map<String,Object> map=new HashMap<String ,Object>();
        map.put("name",name);
        map.put("age",18);
        return map;

    }

}
