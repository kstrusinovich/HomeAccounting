package repository;

import model.Accrual;
import org.springframework.data.repository.CrudRepository;

public interface AccrualRepository extends CrudRepository<Accrual, Long> {
}
