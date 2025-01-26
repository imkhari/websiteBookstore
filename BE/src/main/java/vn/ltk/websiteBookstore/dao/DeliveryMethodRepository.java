package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.DeliveryMethod;

@RepositoryRestResource(path = "delivery-method")
public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, Integer> {
}
