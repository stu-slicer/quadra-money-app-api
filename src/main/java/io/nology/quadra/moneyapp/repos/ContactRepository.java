package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {

    Contact findById(int id);

    @Query(value = "SELECT * FROM contacts WHERE userID = ?1", nativeQuery = true)
    List<Contact> findAllContactsByUserID(String id);

    void deleteById(int id);

}
