package app.repository;

import app.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepo extends JpaRepository<Operator,Integer> {


}
