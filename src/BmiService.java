public class BmiService {
    public double calculate (int mass){
        double growth = 1.72;
        double calcGrowth = growth * growth;
        double calcBmi = mass / calcGrowth;
        return calcBmi;
    }
}
