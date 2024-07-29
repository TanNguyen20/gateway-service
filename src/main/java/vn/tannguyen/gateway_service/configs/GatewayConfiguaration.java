package vn.tannguyen.gateway_service.configs;

import org.springframework.cloud.gateway.server.mvc.config.GatewayMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.List;

@Configuration
public class GatewayConfiguaration {
    @Bean
    public GatewayMvcProperties gatewayMvcProperties(Environment env) {
        GatewayMvcProperties properties = new GatewayMvcProperties();
        properties.setRoutes(env.getProperty("spring.cloud.gateway.routes", List.class));
        return properties;
    }
}
