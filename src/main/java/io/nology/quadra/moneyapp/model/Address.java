package io.nology.quadra.moneyapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String postCode;
    private String address;
    private String city;
    private String country;
    private String userID;
    private int bankAccountID;

    public Address() {
    }

    public int getId() {
        return id;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getUserID() {
        return userID;
    }

    public int getBankAccountID() {
        return bankAccountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("id=").append(id);
        sb.append(", postCode='").append(postCode).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", userID='").append(userID).append('\'');
        sb.append(", bankAccountID=").append(bankAccountID);
        sb.append('}');
        return sb.toString();
    }
}
