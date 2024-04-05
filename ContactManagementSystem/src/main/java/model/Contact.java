package model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private long contactId;
    private String firstName;
    private String lastName;
    private String companyName;
    private String jobTitle;

    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact(){

    }

//    public Contact(String firstName, String lastName, String companyName,
//                   String jobTitle, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.companyName = companyName;
//        this.jobTitle = jobTitle;
//        this.phoneNumbers = new ArrayList<>();
//        this.emailAddresses = new ArrayList<>();
//    }

    public Contact(String firstName, String lastName, String companyName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void addPhoneNumber(String number, String label) {
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(new PhoneNumber(number, label));
    }


    public void addEmailAddress(String label, String address) {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<>();
        }
        emailAddresses.add(new EmailAddress(address, label));
    }

    public void removeEmailAddress(String address) {
        emailAddresses.removeIf(emailAddress -> emailAddress.getAddress().equals(address));
    }


    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", emailAddresses=" + emailAddresses +
                '}';
    }
}
