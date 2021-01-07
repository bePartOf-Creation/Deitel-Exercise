package com.javaChapter3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatItemsPurchased_CanHavePartNumber(){
        //given
        Invoice newInvoice;
        //when
        newInvoice = new Invoice("1106", "All Appliances", 6, 2500.0);
        String InvoiceNumber = newInvoice.getPartNumber();
        //assert
        assertEquals("1106",InvoiceNumber);
    }
    @Test
    void testThatItemsPurchased_PartNumberCanBeUpdated() {
        //given
        Invoice newInvoice = new Invoice("1106", "All Appliances", 6, 2500.0);
        //when
        newInvoice.setPartNumber("1107");
        //assert
        assertEquals("1107", newInvoice.getPartNumber());
    }
    @Test
    void testThatItemPurchased_CanHavePartDescription(){
        Invoice newInvoice = new Invoice("1107","All Appliances", 6, 2500.0);
        String partDescription = newInvoice.getPartDescription();
        assertEquals("All Appliances",partDescription);
    }
    @Test
    void testThatItemsPurchased_PartDescriptionCanBeUpdated(){
        Invoice newInvoice = new Invoice("1107","All Appliances", 6, 2500.0);
        newInvoice.setPartDescription("NewItems Purchased");
        assertEquals("NewItems Purchased",newInvoice.getPartDescription());
    }
    @Test
    void testThatItemsPurchased_CanBeCountedAsQuantity(){
        Invoice newInvoice = new Invoice("1107","All Appliances",6, 2500.0);
        int quantity = newInvoice.getQuantity();
        assertEquals(6,quantity);
    }
    @Test
    void testThatItemsPurchased_CountedAsQuantityCanBeUpdated(){
        Invoice newInvoice = new Invoice("1107","All Appliances",6, 2500.0);
        newInvoice.setQuantity(100);
        assertEquals(100,newInvoice.getQuantity());
    }
    @Test
    void testThatUser_CannotInPutNegativeValuesAsQuantity(){
        Invoice newInvoice = new Invoice("1107","All Appliances",100, 2500.0);
        newInvoice.setQuantity(-100);
        assertEquals(0,newInvoice.getQuantity());
    }
    @Test
    void testThatItemsPurchased_CanHaveAPrice(){
        Invoice newInvoice = new Invoice("1107","All Appliances",100,2500.0);
        double price = newInvoice.getPrice();
        assertEquals(2500.00,price);
    }
    @Test
    void testThatItemsPurchased_CanHaveTheirPriceUpdated(){
        Invoice newInvoice = new Invoice("1107","All Appliances",100,2500.0);
        newInvoice.setPrice(3400.0);
        assertEquals(3400.0,newInvoice.getPrice());
    }
    @Test
    void testThatItemsPurchased_CannotHaveNegativeValueAsPrice(){
        Invoice newInvoice = new Invoice("1107","All Appliances",100,2500.0);
        newInvoice.setPrice(-8400.0);
        assertEquals(0.0,newInvoice.getPrice());
    }

    @Test
    void testThatInvoiceAmount_CanBeGeneratedForThem(){
        Invoice newInvoice = new Invoice("1107","All Appliances",100,2500.0);
        newInvoice.setPrice(2400.0);
        newInvoice.setQuantity(10);
        double invoiceAmount = newInvoice.displayInvoiceAmount();
        assertEquals(24000.0,invoiceAmount);

        newInvoice.setPrice(3400.0);
        newInvoice.setQuantity(10);
        invoiceAmount = newInvoice.displayInvoiceAmount();
        assertEquals(34000.0,invoiceAmount);
    }

}