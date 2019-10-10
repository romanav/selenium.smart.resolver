package resolver;

import resolver.mongo.Xpath;
import resolver.mongo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Main implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(resolver.Main.class, args);
    }


    @Autowired
    private CustomerRepository repository;


    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Xpath("Alice", "Smith"));
        repository.save(new Xpath("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Xpath customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByXpath("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
//        for (Xpath customer : repository.findByLastName("Smith")) {
//            System.out.println(customer);
//        }

    }
}
