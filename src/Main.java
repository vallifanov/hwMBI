public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mbi = service.calculate(110, 1.9);
        System.out.println("ИМТ= " + mbi);
    }
}
