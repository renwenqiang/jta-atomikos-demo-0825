package com.boot.jtaatomikos;

import com.boot.jtaatomikos.config.DBConfig1;
import com.boot.jtaatomikos.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class JtaAtomikosApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtaAtomikosApplication.class, args);
    }

}
