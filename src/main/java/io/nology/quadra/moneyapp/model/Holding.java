package io.nology.quadra.moneyapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "holdings")
public class Holding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String currencyName;
    private double amount;
    private String currencyCode;
    private String currencySymbol;

    public Holding() {
    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holding holding = (Holding) o;
        return id == holding.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Holding{");
        sb.append("id=").append(id);
        sb.append(", userID='").append(userID).append('\'');
        sb.append(", currencyName='").append(currencyName).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", currencyCode='").append(currencyCode).append('\'');
        sb.append(", currencySymbol='").append(currencySymbol).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
