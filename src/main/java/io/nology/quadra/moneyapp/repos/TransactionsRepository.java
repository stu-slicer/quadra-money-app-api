package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transaction, String> {

}
