package io.nology.quadra.moneyapp.rest;

import io.nology.quadra.moneyapp.model.Contact;
import io.nology.quadra.moneyapp.repos.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

import static io.nology.quadra.moneyapp.MoneyAppConstants.*;

@RestController
@RequestMapping(path = SERVICE_PREFIX)
@CrossOrigin(origins = {ORIGIN_LOCALHOST_1, ORIGIN_LOCALHOST_2})
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> getContacts() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    @GetMapping("/contacts/{id}")
    public ResponseEntity<List<Contact>>
    getContactsById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAllContactsByUserID(id));
    }

    @PostMapping("/contact")
    public ResponseEntity<String> createContact(@RequestBody Contact contact) {
        repository.save(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success, a new contact has been added");
    }

    @DeleteMapping("/contact/{id}")
    @Transactional
    public ResponseEntity<String> deleteContact(@PathVariable String id) {
        repository.deleteById(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("Deleted contact.");
    }

}
