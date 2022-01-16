package server.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("server.mall.mapper")
public class ServerMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerMallApplication.class);
    }
}
