package Minitest2;

import java.time.LocalDate;
import java.util.Scanner;

public class Meat extends Material{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getWeight() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }
    @Override
    public void edit(){
        super.edit();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new weight: ");
        int newWeight = input.nextInt();

        setWeight(newWeight);

        System.out.println(this);
    }
    @Override
    public double getRealMoney (){
        double amount = weight * getCost();

        LocalDate expiryDate = getExpiryDate();
        LocalDate today = LocalDate.now();

        long daysBetween = today.until(expiryDate).getDays();
        double discountRate = 0.1;

        if (daysBetween <= 5) {
            discountRate = 0.3;
        }

        return amount * (1 - discountRate);
    }
}
