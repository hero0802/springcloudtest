package xh.springcloud.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ServerMember {
   /* @Autowired
    private RestTemplate restTemplate;


    public Map<String,Object>  user(){
        return restTemplate.getForObject("http://192.168.159.1:8080/service1/user",Map.class);
    }*/
}
