package com.Harsha.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement 
@ComponentScans(value = {
		@ComponentScan("com.harsha.spring.dao"),
		@ComponentScan("com.harsha.spring.dao")
})
public class AppConfig {

}
