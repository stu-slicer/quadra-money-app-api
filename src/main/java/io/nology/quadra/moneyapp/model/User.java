package io.nology.quadra.moneyapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    private String userID;
    private String firstName;
    private String lastName;
    private String middleNames;

    public User() {
    }

    public User(String userID, String firstName, String lastName, String middleNames) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleNames = middleNames;

    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleNames() {
        return middleNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userID='").append(userID).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleNames='").append(middleNames).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
