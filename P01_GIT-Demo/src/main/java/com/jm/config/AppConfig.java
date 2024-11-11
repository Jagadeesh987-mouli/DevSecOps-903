package com.jm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.jm")
@PropertySource("com/jm/files/myFile.properties")
public class AppConfig 
{
 	
}
