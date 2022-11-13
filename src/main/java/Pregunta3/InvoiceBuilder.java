package Pregunta3;

import java.time.LocalDate;

public class InvoiceBuilder {
    private String country = "NL";
    private CustomerType customerType = CustomerType.PERSON;
    private double value = 500;
    private LocalDate createdAt = LocalDate.now();
    private String customerName = "Ricardo";

    public InvoiceBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public InvoiceBuilder asCompany() {
        this.customerType = CustomerType.COMPANY;
        return this;
    }

    public InvoiceBuilder withAValueOf(double value) {
        this.value = value;
        return this;
    }

    public InvoiceBuilder withCreationDate(LocalDate createdAt){
        this.createdAt = createdAt;
        return this;
    }

    public InvoiceBuilder withCustomerName(String customerName){
        this.customerName = customerName;
        return this;
    }

    public Invoice anyCompany(){
        return new Invoice(value, country, CustomerType.COMPANY, LocalDate.now(), "Any Company");
    }

    public Invoice fromTheUS(){
        return new Invoice(value, "US", customerType, createdAt, customerName);
    }

    public Invoice build() {
        return new Invoice(value, country, customerType, createdAt, customerName);
    }

    public static void main(String[] args) {
        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
        Invoice invoice = new InvoiceBuilder()
                .asCompany()
                .withCustomerName("FACEBOOK")
                .withCreationDate(LocalDate.now())
                .withAValueOf(45348)
                .withCountry("UK")
                .build();

        invoice.showInformation();

        System.out.println("Create company from the US---------");
        invoice = invoiceBuilder.fromTheUS();

        invoice.showInformation();

        System.out.println("Create any company---------");
        invoice = invoiceBuilder.anyCompany();

        invoice.showInformation();


    }
}
