package sagar.phnpay.phnpay;

public class PhonePay {

    private String name;
    private  long mobileNumber;
    private String upiId;

    @Override
    public String toString() {
        return "PhonePay{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", upiId='" + upiId + '\'' +
                '}';
    }

    public PhonePay(String name, long mobileNumber, String upiId) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
