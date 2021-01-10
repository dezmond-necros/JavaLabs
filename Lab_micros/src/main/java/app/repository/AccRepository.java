package app.repository;

import app.service.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccRepository extends JpaRepository<Account,Integer>
{

}
