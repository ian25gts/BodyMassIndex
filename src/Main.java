public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 74;
        double bmi = service.calculate(mass);
        String result = String.format("%.2f",bmi);
        System.out.println(result);
    }
}
