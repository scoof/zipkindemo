package dk.nerd.zipkindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Frontend {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/frontend")
    public void test() {
        restTemplate.getForObject("http://localhost:8092/backend", String.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] argv) {
        new SpringApplication().run(Frontend.class, argv);
    }
}
