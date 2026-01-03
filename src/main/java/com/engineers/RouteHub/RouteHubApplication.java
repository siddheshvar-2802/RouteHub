package com.engineers.RouteHub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RouteHubApplication {

    private static final Logger log = LoggerFactory.getLogger(RouteHubApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RouteHubApplication.class, args);
        log.info("\n" +
                "                                                                 \n" +
                "   ██████╗  ██████╗ ██╗   ██╗████████╗███████╗██╗  ██╗██╗   ██╗██████╗ \n" +
                "   ██╔══██╗██╔═══██╗██║   ██║╚══██╔══╝██╔════╝██║  ██║██║   ██║██╔══██╗\n" +
                "   ██████╔╝██║   ██║██║   ██║   ██║   █████╗  ███████║██║   ██║██████╔╝\n" +
                "   ██╔══██╗██║   ██║██║   ██║   ██║   ██╔══╝  ██╔══██║██║   ██║██╔══██╗\n" +
                "   ██║  ██║╚██████╔╝╚██████╔╝   ██║   ███████╗██║  ██║╚██████╔╝██████╔╝\n" +
                "   ╚═╝  ╚═╝ ╚═════╝  ╚═════╝    ╚═╝   ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═════╝ \n" +
                "                     RouteHub Application                          \n");
    }
}
