package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.MoneyAppConstants;
import io.nology.quadra.moneyapp.model.Address;
import io.nology.quadra.moneyapp.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2 })
public class AddressController {

    @Autowired
    private AddressRepository repository;

    @GetMapping("/addresses")
    public ResponseEntity<List<Address>> getAddresses() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
    }

    @GetMapping("/user-address/{userId}")
    public ResponseEntity<List<Address>> getAddressByUserId(@PathVariable String userId){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllAddressByUserID(userId));
    }

    @PostMapping("/address")
    public ResponseEntity<String> createUser(@RequestBody Address address) {
        repository.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new address has been added");
    }

}
