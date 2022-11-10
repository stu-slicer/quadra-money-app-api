package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.Holding;
import io.nology.quadra.moneyapp.repos.HoldingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin()
public class HoldingController {

    @Autowired
    private HoldingRepository repository;

    @GetMapping("/holdings")
    public ResponseEntity<List<Holding>> getHoldings() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/holding/{id}")
    public ResponseEntity<Holding> getHoldingById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("/user-holding/{userId}")
    public ResponseEntity<List<Holding>> getHoldingByUserId(@PathVariable String userId) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllHoldingByUserID(userId));
    }

    @PostMapping("/holding")
    public ResponseEntity<Holding> createHolding(@RequestBody Holding holding) {
        Holding saved = repository.save(holding);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/holding")
    @Transactional
    public ResponseEntity<Holding> updateUserHolding(@RequestBody Holding holding) {
        String userID = holding.getUserID();
        double amount = holding.getAmount();
        String currencyCode = holding.getCurrencyCode();
        repository.updateUserHolding(amount, userID, currencyCode);
        Holding updated = repository.findById(holding.getId());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body( updated );

    }

}
