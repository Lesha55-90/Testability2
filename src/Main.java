public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(1.76, 80);
        // где index = рост (в метрах);
        // где weight = вес (в кг);

        int myBmi = (int) bmi;
        // индекс массы тела;

        System.out.println("Ваш индекс массы тела равен: " + myBmi);

    }
}
