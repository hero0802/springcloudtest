package xh.springcloud.service1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableDiscoveryClient

public class Service1Application {
    private static Logger logger= LogManager.getLogger();
    @Value("${username}")
    String username;

  /*  @GetMapping("/")
    public String show(){
    logger.debug("日志打印测试");
    logger.info("info日志打印测试");

        return "username="+username;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
}
