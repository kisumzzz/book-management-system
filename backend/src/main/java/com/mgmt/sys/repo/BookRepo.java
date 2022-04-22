package com.mgmt.sys.repo;

import com.mgmt.sys.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Long> {
    void deleteBookById(Long id);

    Optional<Book> findBookById(Long id);
}
