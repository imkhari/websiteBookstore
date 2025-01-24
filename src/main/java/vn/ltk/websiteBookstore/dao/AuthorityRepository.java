package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
