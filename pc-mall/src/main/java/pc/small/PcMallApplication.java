package pc.small;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pc.small.mapper")
public class PcMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcMallApplication.class);
    }
}
