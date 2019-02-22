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
 * Time: 15:10
 */
@Data
@Builder
public class Author {

    private int id;

    private String name;
}