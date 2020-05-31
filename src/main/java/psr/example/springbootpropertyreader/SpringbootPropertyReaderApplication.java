package psr.example.springbootpropertyreader;

import psr.example.springbootpropertyreader.datasources.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootPropertyReaderApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringbootPropertyReaderApplication.class, args);

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());
    }

}
