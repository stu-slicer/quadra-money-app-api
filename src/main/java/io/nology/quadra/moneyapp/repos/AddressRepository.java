package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    @Query(value = "SELECT * FROM addresses WHERE userID = ?1", nativeQuery = true)
    List<Address> findAllAddressByUserID(@Param("id") String id);

    Address findById(int id);

}

