package io.nology.quadra.moneyapp.repos;

import io.nology.quadra.moneyapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserID(String userID);

}