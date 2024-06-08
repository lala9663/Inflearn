package com.example.hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloJpaApplication.class, args);

        Member member = new Member();

        member.setId(1L);
        member.setName("HelloA");

    }
}
