package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository <BankAccount, String> {

    BankAccount findById(int id);

    @Query(value = "FROM BankAccount where userID = :userID")
    List<BankAccount> findAllByUserID(String userID);
}
