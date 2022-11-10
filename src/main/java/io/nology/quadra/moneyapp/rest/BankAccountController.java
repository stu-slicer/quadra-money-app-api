package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.BankAccount;
import io.nology.quadra.moneyapp.repos.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin()
public class BankAccountController {

    @Autowired
    private BankAccountRepository repository;

    @GetMapping("/bank-account/{id}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("/user-bank-accounts/{userID}")
    public ResponseEntity<List<BankAccount>> getBankAccountByUserID(@PathVariable String userID) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllByUserID(userID));
    }

    @PostMapping("/bank-account")
    public ResponseEntity<BankAccount> createBankAccount(@RequestBody BankAccount bankAccount) {
        BankAccount saved = repository.save(bankAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body( saved );
    }

}
