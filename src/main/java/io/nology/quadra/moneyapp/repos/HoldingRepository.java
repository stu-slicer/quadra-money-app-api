package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.Holding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoldingRepository extends JpaRepository<Holding, String> {

    @Query(value = "FROM Holding WHERE userID = ?1")
    List<Holding> findAllHoldingByUserID(@Param("id") String id);

    Holding findById(int id);

    @Modifying
    @Query(value = "UPDATE holdings SET amount = :amount WHERE userID = :userID AND currency_code = :currencyCode", nativeQuery = true)
    void updateUserHolding(double amount, String userID, String currencyCode);

}
