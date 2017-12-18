package com.test.crud_repository_exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@SpringBootApplication
public class MyApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MyApp.class, args);
        //System.out.println( "Hello World!" );
    }
}
