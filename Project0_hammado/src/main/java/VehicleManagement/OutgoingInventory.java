package VehicleManagement;

import java.time.LocalDate;

public class OutgoingInventory{
    private int outgoingId;
    private String VIN;
    private String issueDescription;
    private ShopType shoptype;
    private LocalDate dateSent;
    private LocalDate expectedReturn;


    public enum ShopType {
        BODYSHOP("Bodyshop"),
        MECHANIC_SHOP("Mechanic Shop"),
        PDR("PDR");

        private final String displayName;

        ShopType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
    //constructor
    public OutgoingInventory(int outgoingId, String VIN, String issueDescription, ShopType shopType){
        this.outgoingId = outgoingId;
        this.VIN = VIN;
        this.issueDescription = issueDescription;
        this.dateSent = LocalDate.now();
        this.shoptype = shopType;
        this.expectedReturn = LocalDate.now().plusDays(12);// the expected time of return for a vehicle at any shop doing any work is around 10-12 days so we usually go for the longer term and say 12, however a vehicle may return earlier than expected
    }

    public int getOutgoingId(){
        return outgoingId;
    }

    public void setOutgoingId(int outgoingId){
        this.outgoingId = outgoingId;
    }
    public String getVIN(){
        return VIN;
    }

    public void setVIN(String VIN){
        this.VIN = VIN;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public ShopType getShoptype() {
        return shoptype;
    }

    public void setShoptype(ShopType shoptype) {
        this.shoptype = shoptype;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    public LocalDate getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(LocalDate expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    @Override
    public String toString(){
        return String.format("Outgoing #%d | VIN: %s | Shop: %s\nSent: %s | Expected: %s\nIssue: %s",
                outgoingId, VIN, shoptype.getDisplayName(), dateSent, expectedReturn, issueDescription);
    }
}
