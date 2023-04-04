package Minitest2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CrispyFlour extends Material{
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }
    @Override
    public void edit (){
        super.edit();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new quantity: ");
        int newQuantity = input.nextInt();

        setQuantity(newQuantity);

        System.out.println("Edited: \n" + this);
    }

  @Override
    public double getRealMoney(){
      double amount = quantity * getCost();
      LocalDate expiryDate = getExpiryDate();
      LocalDate today = LocalDate.now();

      long daysBetween = ChronoUnit.DAYS.between(today, expiryDate);


      double discountRate = 0.05;

      if (daysBetween <= 60) {
          discountRate = 0.4;
      } else if (daysBetween <= 120) {
          discountRate = 0.2;
      }

      return amount * (1 - discountRate);
    }
}
