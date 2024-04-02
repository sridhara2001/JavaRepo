package com.oops.inheritance;

public class InherMain {
    public static void main(String[] args) {
        InEmployee inEmployee = new InEmployee("Sridhar",18);
        inEmployee.getDetails();

        InManager inManager = new InManager("Likhith",7,3000);
        inManager.getDetails();
        inManager.printBonus(1000);
    }
}
