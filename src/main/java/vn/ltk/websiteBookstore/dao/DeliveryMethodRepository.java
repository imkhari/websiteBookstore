package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.DeliveryMethod;

@Repository
public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, Integer> {
}
