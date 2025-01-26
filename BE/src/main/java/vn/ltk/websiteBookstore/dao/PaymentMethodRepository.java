package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.PaymentMethod;

@RepositoryRestResource(path = "payment-method")
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
}
