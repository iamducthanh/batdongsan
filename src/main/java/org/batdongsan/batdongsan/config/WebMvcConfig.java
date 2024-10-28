package org.batdongsan.batdongsan.config;

import lombok.RequiredArgsConstructor;
import org.batdongsan.batdongsan.intercepter.DataIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RequiredArgsConstructor
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final DataIntercepter dataIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(dataIntercepter);

    }
}
