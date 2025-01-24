package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
