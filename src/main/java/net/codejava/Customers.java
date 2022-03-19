package net.codejava;

public class Customers {
    private String customerID;
    private String fName;
    private String lName;
    private String email;
    private long mobile;
    private String street;
    private long zip;
    private String referCode;
    private String username;


    public Customers() {
    }


    public Customers(String customerID, String fName, String lName, String email, long mobile, String street, long zip, String referCode, String username) {
        this.customerID = customerID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.mobile = mobile;
        this.street = street;
        this.zip = zip;
        this.referCode = referCode;
        this.username = username;
    }

    public String getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return this.mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getZip() {
        return this.zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String getReferCode() {
        return this.referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

    @Override
    public String toString() {
        return "{" +
            " customerID='" + getCustomerID() + "'" +
            ", fName='" + getFName() + "'" +
            ", lName='" + getLName() + "'" +
            ", email='" + getEmail() + "'" +
            ", mobile='" + getMobile() + "'" +
            ", street='" + getStreet() + "'" +
            ", zip='" + getZip() + "'" +
            ", referCode='" + getReferCode() + "'" +
            ", username='" + getUsername() + "'" +
            "}";
    }

    
}
