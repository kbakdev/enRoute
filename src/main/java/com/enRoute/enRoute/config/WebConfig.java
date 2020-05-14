package com.enRoute.enRoute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * @author Kacper Bąk
 * Another class that allows the program to download data from specific directories.
 * It downloads controls to be able to redirect to individual subpages.
 * In general, it changes registres.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.enRoute.enRoute.controllers" })
public class WebConfig implements WebMvcConfigurer {


    /**
     * @author Kacper Bąk
     * Here the path is specified where all project resources are located.
     * @param registry
     */

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    /**
     * @author Kacper Bąk
     * With this method, we specify the language that will be used in the Web API, but at the moment this feature is not covered.
     * @param registry
     * @param lang
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        registry.addInterceptor(localeChangeInterceptor);
    }

    /**
     * @author Kacper Bąk
     * This method remembers cookies on the site, so we have a specific language in which Web API will work.
     * @return cookieLocaleResolver
     */

    @Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setDefaultLocale(StringUtils.parseLocaleString("en"));
        return cookieLocaleResolver;
    }

}