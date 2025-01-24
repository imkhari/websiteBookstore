package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
