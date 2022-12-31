package c.impl.list;

public class Main {
    public static void main(String[] args) {
        int[] salary = {1_000,2_000,4_000};
        for (int sal : salary){
            System.out.println(HealthInsurance.getHealthInsurance(sal));
        }
    }
}
