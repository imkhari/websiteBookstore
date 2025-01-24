package vn.ltk.websiteBookstore.dao;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}