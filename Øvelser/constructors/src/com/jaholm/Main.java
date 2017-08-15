package com.jaholm;

public class Main {

    public static void main(String[] args) {
        Account hest = new Account(
                1234568,
                2542,
                "Hest Vantmiki",
                "email@gmail.com",
                "93932929");
        Account defaults = new Account();

        hest.deposit(1000);
        hest.withdrawal(400);
        hest.withdrawal(3011);
        hest.withdrawal(3011);
        System.out.println("######################");
        defaults.deposit(1000);
        defaults.withdrawal(400);
        defaults.withdrawal(511);
        defaults.withdrawal(91.5);
        System.out.println("###########pepp###########");

        VipCostumer horseEmpty = new VipCostumer();
        VipCostumer horseName = new VipCostumer("horse", 200, "pekk");
        VipCostumer horseFull = new VipCostumer("mong", 9999, "håkk");

        System.out.println(horseEmpty.getName() + " (" + horseEmpty.getEmailAddress() +
                ") har " + horseEmpty.getCreditLimit() +" kroner i kreditt.");
        System.out.println(horseName.getName() + " (" + horseName.getEmailAddress() +
                ") har " + horseName.getCreditLimit() +" kroner i kreditt.");
        System.out.println(horseFull.getName() + " (" + horseFull.getEmailAddress() +
                ") har " + horseFull.getCreditLimit() +" kroner i kreditt.");

    }
}
