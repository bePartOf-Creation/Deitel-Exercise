package com.javaChapter3;

import javax.swing.*;

public class DateAppTest {
    public static void main(String[] args) {
        Date date = new Date(0,0,0);

        int month = Integer.parseInt(JOptionPane.showInputDialog("Input Month"));
        date.setMonth(month);
        int day = Integer.parseInt(JOptionPane.showInputDialog("Input Day"));
        date.setDay(day);
        int year = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
        date.setYear(year);

        if(day > 0 && month > 0 && year > 1800){
            if(day < 32 && month < 13 && year < 2029){
                JOptionPane.showMessageDialog(null,"Your Input Date is : " + date.displayDate());
            }
        }else{
                JOptionPane.showMessageDialog(null,"Hello! You Invalid Inputs. Correct Yourself ");
            }
        }
    }

