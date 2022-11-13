package Pregunta3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class InvoiceTest {

    @DisplayName("Dado un recibo")
    @Nested
    class InvoiceTestValue{
        private CustomerType customerType;
        private double value;
        private String country;
        private LocalDate createdAt;
        private String customerName;

        @BeforeEach
        void setUp(){
            customerType = CustomerType.COMPANY;
            value = 2500;
            country = "NL";
            createdAt = LocalDate.now();
            customerName = "Ricardo";
        }

        @Test
        @DisplayName("Obtener el valor de dicho recibo")
        void calculateTheInvoiceValue(){
            double ratio = 0.1;
            double expectedValue = value * ratio;
            Invoice invoice = new Invoice(value, country, customerType, createdAt, customerName);
            double receivedValue =  invoice.calculate();
            assertEquals(expectedValue, receivedValue);
        }

        @Test
        void taxesForCompanyAreTaxRateMultipliedByAmount() {
            double invoiceValue = 2500.0;
            double tax = 0.1;
            Invoice invoice = new InvoiceBuilder()
                    .asCompany()
                    .withCountry("NL")
                    .withAValueOf(invoiceValue)
                    .build();
            double calculatedValue = invoice.calculate();
            assertEquals(invoiceValue * tax, calculatedValue);
        }

    }

}
