package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Wish;

@Repository
public interface WishRepository extends JpaRepository<Wish, Integer> {
}
