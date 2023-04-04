package Minitest2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManager managers = new MaterialManager();

        CrispyFlour crispyFlour1 = new CrispyFlour("A1", "Bột chiên 1", LocalDate.of(2023, 2, 17), 15, 5);
        CrispyFlour crispyFlour2 = new CrispyFlour("A2", "Bột chiên 2", LocalDate.of(2023, 2, 20), 30, 2);
        CrispyFlour crispyFlour3 = new CrispyFlour("A3", "Bột chiên 3", LocalDate.of(2023, 3, 15), 25, 5);
        CrispyFlour crispyFlour4 = new CrispyFlour("A4", "Bột chiên 4", LocalDate.of(2023, 3, 20), 30, 3);
        CrispyFlour crispyFlour5 = new CrispyFlour("A5", "Bột chiên 5", LocalDate.of(2023, 4, 20), 30, 4);

        Meat meat1 = new Meat("A1", "Thịt gà", LocalDate.of(2023, 4, 23), 15, 2);
        Meat meat2 = new Meat("A2", "Thịt lợn", LocalDate.of(2023, 4, 30), 20, 3);
        Meat meat3 = new Meat("A3", "Thịt bò", LocalDate.of(2023, 5, 10), 30, 4);
        Meat meat4 = new Meat("A4", "Thịt thỏ", LocalDate.of(2023, 5, 20), 17, 3);
        Meat meat5 = new Meat("A5", "Thịt dê", LocalDate.of(2023, 6, 7), 30, 5);

        managers.getMaterials().add(crispyFlour1);
        managers.getMaterials().add(crispyFlour2);
        managers.getMaterials().add(crispyFlour3);
        managers.getMaterials().add(crispyFlour4);
        managers.getMaterials().add(crispyFlour5);
        managers.getMaterials().add(meat1);
        managers.getMaterials().add(meat2);
        managers.getMaterials().add(meat3);
        managers.getMaterials().add(meat4);
        managers.getMaterials().add(meat5);

        System.out.println("Chênh lệch giữa chiết khấu và không chiết khấu: " + managers.getDiffPrice());


    }
}
