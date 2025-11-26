package org.example.splabvladutpetrea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.example.splabvladutpetrea.Library.*;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpLabVladutPetreaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabVladutPetreaApplication.class, args);
//        Book book = new Book("Titlu");
//        book.addAuthor(new Author("Julian von Populi"));
//        //System.out.print(book.getNrOfAuthors());
//        book.print();
//        Section cap1 = new Section("Capitolul 1");
//        Paragraph p1 = new Paragraph("Paragraph 1");
//        cap1.add(p1);
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        cap1.add(p2);
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        cap1.add(p3);
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        cap1.add(p4);
//        book.print();

        //
// Run the main function and inspect the output in console
// to learn about the lifecycle of objects within the
// Spring Dependency Injection Context
//
// Gets a handle of dependency injection context
        ApplicationContext context = SpringApplication.run(SpLabVladutPetreaApplication.class, args);
// Gets an instance of TransientComponent from the DI context
        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
// Note that every time an instance is required,
// the DI context creates a new one
       // transientBean = context.getBean(TransientComponent.class);
        //transientBean.operation();
// Gets an instance of SingletonComponent from the DI context
// Note that the unique instance was created while
// application was loaded, before creating
// the transient instances
        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Note that every time an instance is required,
// the DI returns the same unique one
        //singletonBean = context.getBean(SingletonComponent.class);
        //singletonBean.operation();
// Gets an instance of another class that
// requires singleton/transient components
// Note where this instance was created and what beans
// were used to initialize it
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

// One can also request an instance from DI context by name
        //c = (ClientComponent)context.getBean("clientComponent");
        //c.operation();
    }
}
