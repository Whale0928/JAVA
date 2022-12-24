package salaryManager;

/**직원의 급여를 계산하는 클래스
 * The type Salary manager.
 */
public class SalaryManager {
    public static void main(String[] args) {

    }

    /**연봉을 제공받아 월급을 반환한다.
     * Get monthly salary double.
     *
     * @param yearlySalary the yearly salary
     * @return the double
     */
    public double getMonthlySalary(int yearlySalary){
        return yearlySalary/12.0;
    }
}
