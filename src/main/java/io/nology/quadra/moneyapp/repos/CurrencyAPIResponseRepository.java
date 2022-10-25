package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.CurrencyAPIResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyAPIResponseRepository extends JpaRepository<CurrencyAPIResponse, String> {

}
