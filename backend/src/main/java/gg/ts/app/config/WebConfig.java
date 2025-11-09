package gg.ts.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ts.gg.app")   // TODO: 디렉터리 구조 회의
public class WebConfig {
}
