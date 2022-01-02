public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 74;
        double growth = 1.72;
        double bmi = service.calculate(mass, growth);
        String result = String.format("%.2f",bmi);
        System.out.println(result);
    }
}
