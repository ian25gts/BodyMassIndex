public class BmiService {
    public double calculate (int mass, double growth){
        double calcGrowth = growth * growth;
        double calcBmi = mass / calcGrowth;
        return calcBmi;
    }
}
