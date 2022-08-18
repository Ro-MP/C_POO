package CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        UberX uberX123 = new UberX("AMQlst24", new Account("123","Juanito", "COND1"), "Toyota", "Corolla");
        uberX123.setPassenger(4);
        uberX123.printDataCar();

        UberVan uberV123 = new UberVan("QlsbLa82", new Account("456","Pedro", "COND2"));
        uberV123.setPassenger(6);
        uberV123.printDataCar();
    }
}