package com.averkin.resolver;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }





    public void run(String... args) throws Exception {

        String url = "https://web.demo.reportportal.io/ui";
        Browser browser = new Browser();
        browser.start(url);


        String html = browser.getHtml();
        Document parsed = Jsoup.parse(html);
        parsed.getAllElements();


//        repository.deleteAll();
//
//        // save a couple of customers
////        repository.save(new Xpath("//body" , browser.getHtml()));
//
//        // fetch all customers
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Xpath customer : repository.findAll()) {
//            System.out.println(customer);
//        }
//        System.out.println();
//
//        // fetch an individual customer
//        System.out.println("Customer found with findByFirstName('Alice'):");
//        System.out.println("--------------------------------");
//        System.out.println(repository.findByXpath("Alice"));
//
//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
////        for (Xpath customer : repository.findByLastName("Smith")) {
////            System.out.println(customer);
////        }

    }
}
