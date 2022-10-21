package io.nology.quadra.moneyapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bankAccounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String bankName;
    private String bankAccountNo;
    private String sortCode;
    private String nameOnAccount;

    public BankAccount() {
    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getNameOnAccount() {
        return nameOnAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("id=").append(id);
        sb.append(", userID='").append(userID).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append(", bankAccountNo='").append(bankAccountNo).append('\'');
        sb.append(", sortCode='").append(sortCode).append('\'');
        sb.append(", nameOnAccount='").append(nameOnAccount).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
