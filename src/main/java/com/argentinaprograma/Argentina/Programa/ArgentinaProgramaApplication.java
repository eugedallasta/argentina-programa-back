package com.argentinaprograma.Argentina.Programa;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class ArgentinaProgramaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArgentinaProgramaApplication.class, args);
	}
        
        
	@Bean
		public WebMvcConfigurer corsConfigurer() {
   		 return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("https://portfolio-deploy-b11f2.web.app%22 , "http://localhost:4200")
                    .allowedMethods(
                            "GET",
                            "POST",
                            "PUT",
                            "DELETE");
        }
    };
}


}
