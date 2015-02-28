package net.afnf.forward_test_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SampleTomcatApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleTomcatApplication.class, args);
    }
}
