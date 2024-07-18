package vn.tannguyen.gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.filter.LoadBalancerFilterFunctions.lb;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import static org.springframework.cloud.gateway.server.mvc.predicate.GatewayRequestPredicates.path;

@SpringBootApplication
public class GatewayServiceApplication {

    @Bean
    public RouterFunction<ServerResponse> gatewayRouterFunctionsLoadBalancer() {
        return route("data-service")
                .route(path("/**"), http())
                .filter(lb("data-service"))
                .build();
    }


    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
