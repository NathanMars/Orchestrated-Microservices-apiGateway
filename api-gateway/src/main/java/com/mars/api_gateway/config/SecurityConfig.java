package com.mars.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final String[] freeResourceUrls = {
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "api-docs/**",
            "/aggregate/**"
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(authorize -> authorize
                                .requestMatchers(freeResourceUrls).permitAll() // Permite o acesso não autenticado aos endpoints de freeResourceUrls
                                .anyRequest().authenticated()) // Exige autenticação para todas as outras requisições
                            .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()))
                            .build();

    }

}
