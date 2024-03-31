import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            Dimensions dimensions = new Dimensions(2.5, 1.5, 3.0);
            Immutability cargo = new Immutability(dimensions, 50.0, "123 St", true, "ABC123", true);
            Immutability updatedCargo = cargo.updateDeliveryAddress("456 St");
            System.out.println("Исходный адрес: " + cargo.getDeliveryAddress());
            System.out.println("Измененный адрес: " + updatedCargo.getDeliveryAddress());
            Dimensions newDimensions = new Dimensions(3.0, 2.0, 4.0);
            Immutability updatedCargo2 = cargo.updateDimensions(newDimensions);
            System.out.println("Исходные габариты: " + cargo.getDimensions().width() + "x" + cargo.getDimensions().height() + "x" + cargo.getDimensions().length());
            System.out.println("Измененные габариты: " + updatedCargo2.getDimensions().width() + "x" + updatedCargo2.getDimensions().height() + "x" + updatedCargo2.getDimensions().length());
        }
    }
}