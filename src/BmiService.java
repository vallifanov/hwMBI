public class BmiService {
    public double calculate(int weight, double height) {
        double mbi = weight / (height * height);
        return mbi;
    }
}
