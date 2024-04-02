package com.inter.lam;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu = ()-> {
            System.out.println("Indian Foods Available are :");
            System.out.println("Masala Dosa, Puri, Rice Bath");
        };
        menu.showMenus();

        menu = ()-> {
            System.out.println("Chinese Foods Available are :");
            System.out.println("Noodles, Gobi, Chow");
        };
        menu.showMenus();

        menu = ()->{
            System.out.println("Italian Foods Available are :");
            System.out.println("Pizza, White Pasta, Manchurian");
        };
        menu.showMenus();
    }
}
