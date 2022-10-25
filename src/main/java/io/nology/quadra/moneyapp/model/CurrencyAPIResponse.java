package io.nology.quadra.moneyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "currency_api_responses")
public class CurrencyAPIResponse {

    @Id
    private String currencyCode;

    private LocalDateTime loaded;
    @Column(length = 10000)
    private String response;


    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public LocalDateTime getLoaded() {
        return loaded;
    }

    public void setLoaded(LocalDateTime loaded) {
        this.loaded = loaded;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyAPIResponse that = (CurrencyAPIResponse) o;
        return Objects.equals(currencyCode, that.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CurrencyAPIResponse{");
        sb.append("currencyCode='").append(currencyCode).append('\'');
        sb.append(", loaded=").append(loaded);
        sb.append(", response='").append(response.substring(0, 100)).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
