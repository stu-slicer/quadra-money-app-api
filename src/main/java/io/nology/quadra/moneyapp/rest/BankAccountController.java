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
@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2 })
public class BankAccountController {

    @Autowired
    private BankAccountRepository repository;

    @GetMapping("/bank-account/{id}")
    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("user-bank-account/{userID}")
    public ResponseEntity<List<BankAccount>> getBankAccountByUserID(@PathVariable String userID) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllByUserID(userID));
    }

    @PostMapping("/create-bank-account")
    public ResponseEntity<String> createBankAccount(@RequestBody BankAccount bankAccount) {
        repository.save(bankAccount);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new Bank Account has been added");
    }

}
