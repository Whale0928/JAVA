package DoitQuest;

/**
 * 은행에서 사용할 이율을 구하는 클랙스 구현 과제형문제
 * The type Interst manager.
 */
public class InterestManager {
    final static int amount = 1_000_000;
    final static InterestManager im = new InterestManager();

    public static void main(String[] args) {
        for (int i = 1; i <= 365; i++) {
            double value = im.calculateAmount(i, amount);
            System.out.printf("%d일 이자금액 : %.2f\n", i, value);
        }
    }

    /**
     * 일자를 매개변수로 받아 이율을 계산해 반환하는 메서드
     * Get interes rate double.
     *
     * @param day the day
     * @return the double
     */
    public double getInterestRate(int day) {
        if (day <= 90) return 0.005;
        else if (day <= 180) return 0.010;
        else if (day <= 364) return 0.020;
        else return 0.056;
    }

    /**
     * 예금 거치 기간과 금액을 받아 금액을 계산해 반환한다.
     * Cacluate amout double.
     *
     * @param day    the day
     * @param amount the amount
     * @return the double
     */
    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        return amount * interestRate;
    }
}
