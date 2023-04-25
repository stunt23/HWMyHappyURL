package academy.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // увімкнули можливість планування
public class HappyUrlApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyUrlApplication.class, args);
    }

}
