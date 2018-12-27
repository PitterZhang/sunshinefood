package renying;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("")
//买家用户
public class SunshineBuyer {
	public static void main(String[] args) {
		SpringApplication.run(SunshineBuyer.class,args);
	}
}
