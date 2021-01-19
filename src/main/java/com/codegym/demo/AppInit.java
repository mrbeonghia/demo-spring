package com.codegym.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
        // .class là để appConfig sang bytecode
        //quy định các lớp cấu hình ứng dụng
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0]; //độ dài chuỗi = 0
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
        // cấu hình đường dẫn mặc định, mặc định là index
    }
}
