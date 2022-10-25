package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.Transaction;
import io.nology.quadra.moneyapp.repos.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2})
public class TransactionController {

    @Autowired
    private TransactionsRepository repository;

    @GetMapping("/transactions")
    public ResponseEntity<List<Transaction>> getTransactions() {
        return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAll());
    }

    @PostMapping("/transaction")
    public ResponseEntity<Transaction> makeTransaction(@RequestBody Transaction transaction) {
        Transaction saved = repository.save(transaction);
        return ResponseEntity.status(HttpStatus.OK).body(saved);
    }
}
