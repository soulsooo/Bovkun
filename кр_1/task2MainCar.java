public class Main {
    public static void main(String[] args) {
        Avto1 = new Avto("White", 400, "Automatic", 270);
        Avto2 = new Avto("Black", 350, "Mechanic", 70) ;
        Avto3 = new Avto("White", 300, "Automatic", 180) ;

        Avto1.start();
        Avto2.start();
        Avto3.start();
        System.out.println();

        Avto1.stop();
        Avto2.stop();
        Avto3.stop();
        System.out.println();

        Avto1.turnLeft();
        Avto2.turnLeft();
        Avto3.turnLeft();
        System.out.println();

        Avto1.turnRight();
        Avto2.turnRight();
        avto3.turnRight();
        System.out.println();

        System.out.println(Avto1);
        System.out.println();
        System.out.println(Avto2);
        System.out.println();
        System.out.println(Avto3);
        System.out.println();

    }
}

