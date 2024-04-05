package model;

public class EmailAddress {

    private String label;
    private String address;

    public EmailAddress(){

    }
    public EmailAddress(String label, String address) {
        this.label = label;
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "label='" + label + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
