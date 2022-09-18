package xyz.txk.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xyz.txk.hellospring.pojo.Myself;

//@Configuration
//@ComponentScan("xyz.txk.hellospring.pojo")
public class MyConfig {
    @Bean
    public Myself getmyself(){
        return new Myself();
    }
}
