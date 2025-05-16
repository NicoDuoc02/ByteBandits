package config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import io.basc.framework.context.annotation.Bean;
import io.basc.framework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurituConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authRequest ->
                authRequest
                    .requestMatchers("/auth/**").permitAll()
                    .anyRequest().authenticated()
            )
        .formLogin(withDefaults())
        .build();
    }



}
