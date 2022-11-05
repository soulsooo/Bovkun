public class ReaderMain {
    public static void main(String[] args) {
          = new Reader();
        Reader st2 = new Reader();

        st1.setName("Иванов Сергей Петрович");
        st1.setNumber(5708);
        st1.setDate("17/07/2001");
        st1.setFacult("Журналистика");
        st1.setPhone("+7(925)6387987");
        System.out.println(" Name " + st1.getName() + " number " + st1.getNumber() + " facult " + st1.getFacult() );
        System.out.println("Data: " + st1.getDate() + "; phone: " + st1.getPhone());

        st2.setName("Наумов Борис Михайлович");
        st2.setNumber(7692);
        st2.setDate("12/10/2000");
        st2.setFacult("Журналистика");
        st2.setPhone("+7(928)8985687");
        System.out.println(" Name " + st2.getName() + " number " + st2.getNumber() + " facult " + st2.getFacult() );
        System.out.println("Data: " + st2.getDate() + "; phone: " + st2.getPhone());

        st1.takeBook("Горе от ума");

        st1.returnBook("Выжить после");

        st1.info();
        st2.info();
    }
}
