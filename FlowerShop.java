/**
 * program description : To create a flower management system
 * programmer : fezy
 * Date : 19 February 2024
 */
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        int size = 3;
        Flower[] flowerArr = new Flower[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Name of Flower: ");
            String inputName = scanner.nextLine();

            System.out.print("Enter Color: ");
            String inputColor = scanner.nextLine();

            System.out.print("Enter Price: ");
            double inputPrice = scanner.nextDouble();

            System.out.print("Enter Quantity: ");
            int inputQuantity = scanner.nextInt();
            scanner.nextLine();

            flowerArr[i] = new Flower(inputName, inputColor, inputPrice, inputQuantity);
        }

        System.out.println("\n---------Flower Details---------");
        for (int i = 0; i < size; i++) {
            System.out.println(flowerArr[i].toString());
        }

        double totalValue = 0;
        for (int i = 0; i < size; i++) {
            totalValue += flowerArr[i].getPrice() * flowerArr[i].getQuantity();
        }

        System.out.println("\nTotal Value: " + totalValue);

        System.out.print("\nEnter the name of the flower to search: ");
        String flowerName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < flowerArr.length; i++) {
            if (flowerArr[i].getName().equalsIgnoreCase(flowerName)) {
                System.out.println("\nFlower Found!");
                System.out.println(flowerArr[i].toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nFlower Not Found!");
        }

        System.out.print("\nEnter the name of the flower to restock: ");
        flowerName = scanner.nextLine();

        for (int i = 0; i < flowerArr.length; i++) {
            if (flowerArr[i].getName().equalsIgnoreCase(flowerName)) {
                System.out.print("Enter the quantity to add: ");
                int quantity = scanner.nextInt();
                int newQuantity = quantity + flowerArr[i].getQuantity();
                flowerArr[i].setQuantity(newQuantity);
                System.out.println("\n---------Flower Inventory Restock!---------");
                System.out.println(flowerArr[i].toString());
            }
        } 

    }
}