public class BmiService {
    public double calculate(double index, double weight) {

        // index - рост в метрах;
        // weight - вес в кг;

        double bmi;
        bmi = weight / (index * index);
        // индекс массы тела;

        return bmi;

    }
}
