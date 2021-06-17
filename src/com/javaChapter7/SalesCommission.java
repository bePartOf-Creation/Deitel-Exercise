package com.javaChapter7;

public class SalesCommission {

    private final int basicSalary;
    private final double commissionRate;
    private int range299,range399,range499,range599,range699,range799,range899,range999,range1000;

    public SalesCommission() {
        this.basicSalary = 200;
        this.commissionRate = 0.09;
    }
    public int getBasicSalary() {
        return  basicSalary;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public int calculateTotalSalary(int grossSalesAmount) {
        return (int) (getBasicSalary() + grossSalesAmount * getCommissionRate());
    }
    public void calculateRangeOfSalary(int... grossSales) {
        for (int grossPay= 0; grossPay < grossSales.length; grossPay++) {
            if(calculateTotalSalary(grossSales[grossPay]) > 200 && calculateTotalSalary(grossSales[grossPay]) < 299)
                range299++;
            if(calculateTotalSalary(grossSales[grossPay])> 300 && calculateTotalSalary(grossSales[grossPay]) < 399)
                range399++;
            if(calculateTotalSalary(grossSales[grossPay])> 400 && calculateTotalSalary(grossSales[grossPay]) < 499)
                range499++;
            if(calculateTotalSalary(grossSales[grossPay])> 500 && calculateTotalSalary(grossSales[grossPay]) < 599)
                range599++;
            if(calculateTotalSalary(grossSales[grossPay])> 600 && calculateTotalSalary(grossSales[grossPay]) < 699)
                range699++;
            if(calculateTotalSalary(grossSales[grossPay])> 700 && calculateTotalSalary(grossSales[grossPay]) < 799)
                range799++;
            if(calculateTotalSalary(grossSales[grossPay])> 800 && calculateTotalSalary(grossSales[grossPay]) < 899)
                range899++;
            if(calculateTotalSalary(grossSales[grossPay])> 900 && calculateTotalSalary(grossSales[grossPay]) < 999)
                range999++;
            if(calculateTotalSalary(grossSales[grossPay]) > 1000)
                range1000++;
        }
        System.out.printf("%5s%5d%n","Ranges from 200 - 299",range299);
        System.out.printf("%5s%5d%n","Ranges from 300 - 399",range399);
        System.out.printf("%5s%5d%n","Ranges from 400 - 499",range499);
        System.out.printf("%5s%5d%n","Ranges from 500 - 599",range599);
        System.out.printf("%5s%5d%n","Ranges from 600 - 699",range699);
        System.out.printf("%5s%5d%n","Ranges from 700 - 799",range799);
        System.out.printf("%5s%5d%n","Ranges from 800 - 899",range899);
        System.out.printf("%5s%5d%n","Ranges from 900 - 999",range999);
        System.out.printf("%5s%5d%n","Ranges from 1000",range1000);
    }
}
