package vn.ltk.websiteBookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ltk.websiteBookstore.entity.Evaluation;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
}
