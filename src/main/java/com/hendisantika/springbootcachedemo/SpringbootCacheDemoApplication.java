package com.hendisantika.springbootcachedemo;

import com.hendisantika.springbootcachedemo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootCacheDemoApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootCacheDemoApplication.class);

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCacheDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("1234"));
        logger.info("");
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("4567"));
        logger.info("");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("1234"));
        logger.info("");
        logger.info("isbn-4567 -->" + bookRepository.getByIsbn("4567"));
        logger.info("");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("1234"));
        logger.info("");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("1234"));
        logger.info("");
        logger.info("");
        logger.info("");
        logger.info("");

        logger.info(".... Fetching books by author");
        logger.info("author-1234 -->" + bookRepository.getByAuthorId(1234));
        logger.info("");
        logger.info("author-2 -->" + bookRepository.getByAuthorId(2));
        logger.info("");
        logger.info("author-1 -->" + bookRepository.getByAuthorId(1));
        logger.info("");
        logger.info("author-2 -->" + bookRepository.getByAuthorId(2));
        logger.info("");
        logger.info("author-1 -->" + bookRepository.getByAuthorId(1));
        logger.info("");
        logger.info("author-1 -->" + bookRepository.getByAuthorId(1));
        logger.info("");
    }

}
