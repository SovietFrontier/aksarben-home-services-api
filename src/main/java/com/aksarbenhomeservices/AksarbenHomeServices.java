package com.aksarbenhomeservices;

import com.aksarbenhomeservices.entities.Customer;
import com.aksarbenhomeservices.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@EnableAutoConfiguration(
    exclude = {
      DataSourceAutoConfiguration.class,
      DataSourceTransactionManagerAutoConfiguration.class,
      HibernateJpaAutoConfiguration.class
    })
@Slf4j
@SpringBootApplication
public class AksarbenHomeServices {

  public static void main(String[] args) {
    SpringApplication.run(AksarbenHomeServices.class, args);
  }

  public CommandLineRunner testing(CustomerRepository repository) {
    return (args -> {
      log.info("TESTING");
      repository.save(new Customer("Tim", "Ivanchuk"));
      Customer customer = repository.findById(1L);
    });
  }
}
