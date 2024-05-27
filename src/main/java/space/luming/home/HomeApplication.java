package space.luming.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import space.luming.home.Config.JacksonConfig;

@SpringBootApplication
@MapperScan("space.luming.home.Mapper")
@Import(JacksonConfig.class)
public class HomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeApplication.class, args);
    }

}
