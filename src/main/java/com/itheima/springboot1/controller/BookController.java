package com.itheima.springboot1.controller;

import com.itheima.springboot1.mapper.BookMapper;
import com.itheima.springboot1.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class BookController {
    @Autowired
    public BookMapper bookMapper;
    @RequestMapping("/books")
    public List<Book> dsfa(){
        List<Book> bookList = bookMapper.list();
        return bookList;
    }
}
