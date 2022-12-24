package salaryManager;

/**직원의 급여를 계산하는 클래스
 * The type Salary manager.
 */
public class SalaryManager {

    final static SalaryManager sm = new SalaryManager();
    static final double work = 0.125; //근로소득세
    static final double nation = 8.1; //national pension 국민연금
    static final double health = 12.5; //건강보험료

    public static void main(String[] args) {
        sm.getMonthlySalary(100_000_000);
    }

    /**연봉을 제공받아 월급을 반환한다.
     * Get monthly salary double.
     *
     * @param yearlySalary the yearly salary
     * @return the double
     */
    public double getMonthlySalary(int yearlySalary){
        double salary = yearlySalary / 12.0;
        System.out.printf("월급 : %.2f\n",salary);

        calculateTax(salary);
        calculateNationalPerson(salary);

        return 0;
    }

    /**
     * 월급여를 받고 근로소득세를 공제하고 반환한다.
     * Calculate tax double.
     *
     * @param salary the salary
     */
    public void calculateTax(double salary){
        salary *= work;
        System.out.printf("공제후 월급 : %.2f\n",salary);
    }

    /**
     * 연금을 공제해주는 메서드
     * Calculate national persion double.
     * @param salary the salary
     */
    public void calculateNationalPerson(double salary){
        salary *= nation;
        System.out.printf("연금공제후 : %.2f\n",salary);
    }

}
