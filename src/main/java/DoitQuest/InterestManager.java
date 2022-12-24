package DoitQuest;

/**은행에서 사용할 이율을 구하는 클랙스 구현 과제형문제
 * The type Interst manager.
 */
public class InterestManager {
    public static void main(String[] args) {

    }

    /**일자를 매개변수로 받아 이율을 계산해 반환하는 메서드
     * Get interes rate double.
     *
     * @param day the day
     * @return the double
     */
    public double getInteresRate(int day){
        if(day<=90) return  0.5;
        else if(day<=180) return 1.0;
        else if(day<=364) return  2.0;
        else return  5.6;
    }
}
