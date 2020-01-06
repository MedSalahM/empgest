package com.mms.empgest.demo;

import com.mms.empgest.demo.repositories.UserRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserRepositories.class)
@SpringBootApplication
public class EmployeemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }

}
