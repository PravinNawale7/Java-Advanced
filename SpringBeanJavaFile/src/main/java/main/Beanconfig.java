package main;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import Bean.Bank;
import Bean.Customer;

@Configurable
@ComponentScan(basePackages = "Bean")
public class Beanconfig {

    @Bean
    public Bank bank() {
        return new Bank("State Bank Of India");
    }

    @Bean
    public Customer customer() {
        return new Customer("Pravin", "23", "Jalgaon");
    }
}
