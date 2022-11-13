package Pregunta3;

import java.time.LocalDate;

public class Invoice {

    private final double value;
    private final String country;
    private final CustomerType customerType;
    private final LocalDate createdAt;
    private final String customerName;
    public Invoice(double value, String country, CustomerType customerType, LocalDate createdAt,
                   String customerName){
        this.value = value;
        this.country = country;
        this.customerType = customerType;
        this.createdAt = createdAt;
        this.customerName = customerName;
    }
    public void showInformation(){
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Value: " + this.value);
        System.out.println("Country: "+this.country);
        System.out.println("Customer type: "+this.customerType.type);
        System.out.println("Created At: "+this.createdAt);
    }
    public double calculate(){
        double ratio = 0.1;
        return value * ratio;
    }

    public double getValue() {
        return value;
    }

    public String getCountry() {
        return country;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public String getCustomerName() {
        return customerName;
    }
}
