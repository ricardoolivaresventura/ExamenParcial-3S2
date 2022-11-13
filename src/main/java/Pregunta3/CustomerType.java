package Pregunta3;

public class CustomerType {

    String type;
    static final CustomerType PERSON = new CustomerType("PERSON");
    static final CustomerType COMPANY = new CustomerType("COMPANY");

    public CustomerType(String type){
        this.type = type;
    }



}
