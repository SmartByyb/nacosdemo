package org.rubit.nacosdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Properties;

@SpringBootApplication
public class NacosdemoApplication {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.setProperty("spring.cloud.nacos.config.prefix", "nacos-config1");
        props.setProperty("spring.cloud.nacos.config.file-extension", "properties");
        props.setProperty("spring.cloud.nacos.config.server-addr", "127.0.0.1:8848");
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosdemoApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        String userAge = applicationContext.getEnvironment().getProperty("user.age");
        System.out.println("user name :"+userName+"; age: "+userAge);
    }

}
