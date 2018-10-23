package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//    @Autowired
//    private ElasticsearchOperations es;
//
//    @Autowired
//    private BookService bookService;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }


}