package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.CatalogBook;

@Repository
public interface CatalogBookRepository extends JpaRepository<CatalogBook, Integer> {
}
