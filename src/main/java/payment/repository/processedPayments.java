package payment.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

@Entity
public class processedPayments {
    @Id
    @Column
    private long contributionID;
    @Column
    private long campaignID;
    @Column
    private long userID;
    @Column
    private float amount;

//    @Column
//    private Data date;

    // *** default constructor for JPA ***

    protected processedPayments(){}
    // *** constructor ***
    public processedPayments(long contributionID,float amount,long campaignID,long userID) {
        this.contributionID = contributionID;
        this.campaignID = campaignID;
        this.userID = userID;
        this.amount = amount;
    }

    // *** Standard Getters ***
    public long getContributionID(){
        return this.contributionID;
    }
    public long getCampaignID(){
        return this.campaignID;
    }
    public long getUserID(){
        return this.userID;
    }
    public float getAmount(){
        return this.amount;
    }

    //Standard Setters
    public void setContributionID(long ID){
        this.contributionID=ID;
    }
    public void setCampaignID(long ID){
        this.campaignID=ID;
    }
    public void setUserID(long ID){
        this.userID=ID;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }

    @Override
    public String toString() {
        return  "Contribution ID: "+this.contributionID+" | | "+
                "Campaign ID: "+this.campaignID+" | | "+
                "User ID: "+this.userID+" | | "+
                "Amount: "+this.amount+".";
    }
}
