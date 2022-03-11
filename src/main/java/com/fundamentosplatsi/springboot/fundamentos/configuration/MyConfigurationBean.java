package com.fundamentosplatsi.springboot.fundamentos.configuration;

import com.fundamentosplatsi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatsi.springboot.fundamentos.bean.MyBean2Implement;
import com.fundamentosplatsi.springboot.fundamentos.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return  new MyBean2Implement();
    }
}
