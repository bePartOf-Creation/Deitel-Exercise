package com.javaChapter3;

import javax.swing.*;

public class InvoiceAppTest {
    public static void main(String[] args) {
        Invoice newInvoice = new Invoice("1107","New Items Purchased",0,0.0);

        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Input your Quantity"));
        newInvoice.setQuantity(quantity);
        double price = Integer.parseInt(JOptionPane.showInputDialog("Input your Price"));
        newInvoice.setPrice(price);
            if(price > 0 && quantity > 0){
                JOptionPane.showMessageDialog(null,"Your Invoice Amount for " + newInvoice.getPartDescription()+
                        "\n with PartNumber  " + newInvoice.getPartNumber()+ " is " + newInvoice.displayInvoiceAmount());
            }else{
                if(price <0){
                    JOptionPane.showMessageDialog(null, newInvoice.getPrice());
                }
                if(quantity <0){
                    JOptionPane.showMessageDialog(null, newInvoice.getQuantity());
                }
            }
    }
}
