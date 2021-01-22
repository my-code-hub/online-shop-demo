package com.sgt.online.shop.front.checkout;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static com.sgt.online.shop.regex.RegexConstants.EMAIL_PATTERN;

public class CheckoutForm {

    @Size(min = 3, max = 20)
    @NotBlank
    private String firstName;

    @Size(min = 4, max = 20)
    @NotBlank
    private String lastName;

    @Size(min = 5, max = 30)
    @NotBlank
    @Pattern(regexp = EMAIL_PATTERN, message = "Incorrect format")
    private String email;

    @NotBlank
    @Size(min = 4, max = 100)
    private String address;

    @NotBlank
    @Size(min = 3, max = 20)
    private String zip;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CheckoutForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", address='" + email + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
