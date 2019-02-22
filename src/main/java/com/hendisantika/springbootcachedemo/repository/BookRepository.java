package com.hendisantika.springbootcachedemo.repository;

import com.hendisantika.springbootcachedemo.domain.Book;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-cache-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-22
 * Time: 15:12
 */
public interface BookRepository {
    Book getByIsbn(String isbn);

    Book getByAuthorId(int id);
}
