public class BmiService {

    public int calculate(double heightInMeters, int weightInKilograms) {

        int calculate = (int) ((int) weightInKilograms / (heightInMeters * heightInMeters));

        return calculate;
    }
}
