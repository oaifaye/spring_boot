package spring_boot.boot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot �Ѿ�������Ƕ����tomcat Ĭ�ϵĶ˿���8080
 * 
 * 
 * @author yangcb
 *
 */
//@SpringBootApplication�൱��@Configuration��@EnableAutoConfiguration��  @ComponentScan
@SpringBootApplication
public class Application  
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}