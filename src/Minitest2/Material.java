package Minitest2;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Material implements Discount{
    protected String id;
    protected String name;
    protected LocalDate manufacturingDate;
    protected int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void edit (){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter new ID: ");
        String newId = input.nextLine();
        System.out.print("Enter new name: ");
        String newName = input.nextLine();
        System.out.print("Enter new manufacturing date: ");
        LocalDate newManufacturingDate = LocalDate.parse(input.nextLine());
        System.out.print("Enter new cost: ");
        int newCost = input.nextInt();

        setId(newId);
        setName(newName);
        setManufacturingDate(newManufacturingDate);
        setCost(newCost);
    }

    @Override
    public String toString() {
        return "id='" + id +
                ", name='" + name +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost ;
    }
}
