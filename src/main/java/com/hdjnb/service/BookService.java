package com.hdjnb.service;

import com.hdjnb.dao.BookDao;
import com.hdjnb.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book getBookById(long id) {
        return bookDao.queryById(id);
    }

    public List<Book> listBook() {
        return bookDao.queryAll(0, 12);
    }
}
