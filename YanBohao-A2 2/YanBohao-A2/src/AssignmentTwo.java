public class AssignmentTwo {
    public static void main(String[] args) {
        // 主方法内容保持不变
    }

    public void partThree() {
        Ride rollerCoaster = new Ride("Thunderbolt", 12, 50, 3);

        Visitor alice = new Visitor("Alice", 15, true);
        Visitor bob = new Visitor("Bob", 13, true);
        Visitor charlie = new Visitor("Charlie", 14, true);

        rollerCoaster.addVisitorToQueue(alice);
        rollerCoaster.addVisitorToQueue(bob);
        rollerCoaster.addVisitorToQueue(charlie);

        System.out.println("Initial queue:");
        rollerCoaster.printQueue();

        rollerCoaster.removeVisitorFromQueue();

        System.out.println("\nQueue after removing one visitor:");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        Ride ferrisWheel = new Ride("Sky View", 5, 20, 1);

        Visitor alice = new Visitor("Alice", 15, true);
        Visitor bob = new Visitor("Bob", 13, true);

        ferrisWheel.addVisitorToHistory(alice);
        ferrisWheel.addVisitorToHistory(bob);

        System.out.println("Number of visitors on Ferris Wheel: " + ferrisWheel.numberOfVisitors());

        ferrisWheel.printRideHistory();
    }

    public void partFourB() {
        Ride waterSlide = new Ride("Splash Mountain", 8, 30, 2);

        Visitor charlie = new Visitor("Charlie", 14, true);
        Visitor david = new Visitor("David", 16, true);

        waterSlide.addVisitorToHistory(charlie);

        System.out.println("Is Charlie in the ride history? " + waterSlide.checkVisitorFromHistory(charlie));
        System.out.println("Is David in the ride history? " + waterSlide.checkVisitorFromHistory(david));
    }

    public void partFive() {
        Ride rollerCoaster = new Ride("Thunderbolt", 12, 50, 3);
        Employee john = new Employee("John", 30, "Ride Operator", 5);

        Visitor alice = new Visitor("Alice", 15, true);
        Visitor bob = new Visitor("Bob", 13, true);

        rollerCoaster.assignOperator(john);
        rollerCoaster.addVisitorToQueue(alice);
        rollerCoaster.addVisitorToQueue(bob);

        System.out.println("Before running a cycle:");
        rollerCoaster.printQueue();

        rollerCoaster.runOneCycle();

        System.out.println("\nAfter running a cycle:");
        rollerCoaster.printQueue();

        System.out.println("\nRide history:");
        rollerCoaster.printRideHistory();
    }

    public void partSix() {
        // Implementation for part six
    }

    public void partSeven() {
        // Implementation for part seven
    }
}