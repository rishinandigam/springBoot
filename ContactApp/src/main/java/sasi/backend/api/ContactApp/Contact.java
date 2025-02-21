package sasi.backend.api.ContactApp;

public class Contact {

    private String name;
    private long mobileNumber;
    private String type;

    public Contact(String name, long mobileNumber, String type) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.type = type;


    }

    public Contact() {
    }


    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
