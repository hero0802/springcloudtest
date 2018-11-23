package xh.springcloud.service1;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private static Logger logger= LogManager.getLogger();
    private static Integer id=1;

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/insert")
    @Transactional
    public String user(){
        Map<String,Object> map=new HashMap<>();
        map.put("userId",id++);
        map.put("name","牟巍");
        map.put("sourse","英语");
        map.put("score",150);
        int rs=userMapper.insert(map);
        if(rs==1){
            
        }
        logger.info("执行结果:"+rs);

        return "执行结果："+rs;
    }
    @GetMapping("user/select")
    public List<Map<String,Object>> sellect(){
        return userMapper.select();
    }

}
