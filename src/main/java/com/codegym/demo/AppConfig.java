package com.codegym.demo;

import com.codegym.demo.service.ProductService;
import com.codegym.demo.service.ProductServiceImp;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //đây là 1 lớp cấu hình
@EnableWebMvc //đây là 1 ứng dụng web mvc
@ComponentScan("com.codegym.demo") //tự động phát hiện controller
public class AppConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
        //quy định các đường dẫn chứa jsp
    }

    @Bean //đánh dấu những class đã tạo íntance
    public ProductService productService(){
        return new ProductServiceImp();
    }
}
