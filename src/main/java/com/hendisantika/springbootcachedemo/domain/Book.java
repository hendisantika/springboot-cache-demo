package com.hendisantika.springbootcachedemo.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-cache-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-02-22
 * Time: 15:12
 */
@Data
@Builder
public class Book {

    private String isbn;

    private String title;

    private Author author;
}
