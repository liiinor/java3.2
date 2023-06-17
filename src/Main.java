public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightInKilograms = 98; //вес в килограмах
        double heightInMeters = 1.87; //рост в метрах
        int bmi = service.calculate((double) heightInMeters, weightInKilograms);
        System.out.println(bmi);

    }
}