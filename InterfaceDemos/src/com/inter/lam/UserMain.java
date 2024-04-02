package com.inter.lam;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        IMenu menu = new IMenu() {
            @Override
            public void showMenus() {
                System.out.println("Indian, Chinese, Italian");
            }
        };
        waiter.availableItems(menu);
    }
}
