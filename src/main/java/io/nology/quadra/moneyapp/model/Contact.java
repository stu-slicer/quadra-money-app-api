package io.nology.quadra.moneyapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String contactName;
    private String bankName;
    private String accountNumber;
    private String sortCode;

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getContactName() {
        return contactName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contacts = (Contact) o;
        return id == contacts.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contacts{");
        sb.append("id=").append(id);
        sb.append(", userID='").append(userID).append('\'');
        sb.append(", contactName='").append(contactName).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", sortCode='").append(sortCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
