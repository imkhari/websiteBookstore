package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
