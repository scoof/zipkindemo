package dk.nerd.zipkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class Backend {
    @RequestMapping("/backend")
    public void test() throws InterruptedException {
        Thread.sleep(new Random().nextInt(1000));
    }

    public static void main(String[] argv) {
        new SpringApplication().run(Backend.class, argv);
    }
}
