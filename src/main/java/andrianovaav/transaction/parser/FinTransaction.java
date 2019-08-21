package andrianovaav.transaction.parser;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Financial transaction
 */
public class FinTransaction {

    private String profileName;
    private LocalDateTime transactionDate;
    private BigDecimal transactionAmount;
    private String transactionNarrative;
    private String transactionDescription;
    private String transactionId;
    private Integer transactionType;
    private String walletReference;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public String getWalletReference() {
        return walletReference;
    }

    public void setWalletReference(String walletReference) {
        this.walletReference = walletReference;
    }

    @Override
    public String toString() {
        return "FinTransaction{" +
                "profileName='" + profileName + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                ", transactionNarrative='" + transactionNarrative + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", transactionType=" + transactionType +
                ", walletReference='" + walletReference + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinTransaction that = (FinTransaction) o;
        return Objects.equals(profileName, that.profileName) &&
                Objects.equals(transactionDate, that.transactionDate) &&
                Objects.equals(transactionAmount, that.transactionAmount) &&
                Objects.equals(transactionNarrative, that.transactionNarrative) &&
                Objects.equals(transactionDescription, that.transactionDescription) &&
                Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(transactionType, that.transactionType) &&
                Objects.equals(walletReference, that.walletReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileName, transactionDate, transactionAmount, transactionNarrative,
                transactionDescription, transactionId, transactionType, walletReference);
    }
}
