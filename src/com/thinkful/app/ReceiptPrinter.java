package com.thinkful.app; 

public class ReceiptPrinter {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Bill");
        sb.append("---------------");
        sb.append("Pizza     $12.99");
        sb.append("Soda      $1.25");
        sb.append("Cookies   $2.50");
        sb.append("SubTotal  $16.74");
        sb.append("Tax(10%)     $1.67");
        sb.append("Service(15%):$2.51");
        sb.append("---------------");
        sb.append("Total:      $20.92");
        sb.append("---------------");

        System.out.println(sb.toString());
    }
}