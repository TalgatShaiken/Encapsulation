public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;
    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        if (currentFloor > minFloor) {
            currentFloor = currentFloor - 1;
            System.out.println("Лифт переместился на " + currentFloor + " этаж");
        } else {
            System.out.println("Лифт уже находится на самом нижнем этаже");
        }
    }
    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor = currentFloor + 1;
            System.out.println("Лифт переместился на " + currentFloor + " этаж");
        } else {
            System.out.println("Лифт уже находится на самом верхнем этаже");
        }
    }
    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Ошибка: лифт не может переместить вас на данный этаж");
            return;
        }
        while (currentFloor != floor) {
            if (currentFloor < floor) {
                moveUp();
            } else {
                moveDown();
            }
        }
    }
}