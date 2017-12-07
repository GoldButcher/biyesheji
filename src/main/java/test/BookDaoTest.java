package test;

import com.hdjnb.dao.BookDao;
import com.hdjnb.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;


    @Test
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }

}
