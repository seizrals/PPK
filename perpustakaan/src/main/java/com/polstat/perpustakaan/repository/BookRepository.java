package com.polstat.perpustakaan.repository;

import com.polstat.perpustakaan.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author seizr
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findByTitleContainingIgnoreCase(String keyword);
    List<Book> findByAuthorContainingIgnoreCase (String keyword);
    List<Book> findByAuthorContainingOrTitleContaining(String author, String title);
}
