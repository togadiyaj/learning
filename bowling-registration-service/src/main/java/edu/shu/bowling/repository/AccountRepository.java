package edu.shu.bowling.repository;

import edu.shu.bowling.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {


}
