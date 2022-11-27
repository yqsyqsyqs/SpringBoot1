package com.itheima.springboot1.mapper;

import com.itheima.springboot1.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*

 */
@Mapper
@Repository
public interface BookMapper {

    @Select("select * from tbl_book")
    List<Book> list();
}
