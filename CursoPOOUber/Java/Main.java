package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("AMQlst24", new Account("Juanito", "COND1"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QlsbLa82", new Account("Pedro", "COND2"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}