package io.nology.quadra.moneyapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;

    @Column(name = "user_id_from")
    private String userIDFrom;
    @Column(name = "user_id_to")
    private String userIDTo;
    private String currencyCodeFrom;
    private String currencyCodeTo;
    private double amountFrom;
    private double amountTo;
    private double rate;
    private double fee;

    public Transaction() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getUserIDFrom() {
        return userIDFrom;
    }

    public String getUserIDTo() {
        return userIDTo;
    }

    public String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }

    public String getCurrencyCodeTo() {
        return currencyCodeTo;
    }

    public double getAmountFrom() {
        return amountFrom;
    }

    public double getAmountTo() {
        return amountTo;
    }

    public double getRate() {
        return rate;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionId == that.transactionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("transactionId=").append(transactionId);
        sb.append(", userFromId='").append(userIDFrom).append('\'');
        sb.append(", userToId='").append(userIDTo).append('\'');
        sb.append(", currencyCodeFrom='").append(currencyCodeFrom).append('\'');
        sb.append(", currencyCodeTo='").append(currencyCodeTo).append('\'');
        sb.append(", amountFrom=").append(amountFrom);
        sb.append(", amountTo=").append(amountTo);
        sb.append(", rate=").append(rate);
        sb.append(", fee=").append(fee);
        sb.append('}');
        return sb.toString();
    }
}
