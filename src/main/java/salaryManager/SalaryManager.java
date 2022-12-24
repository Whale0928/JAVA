package salaryManager;

/**직원의 급여를 계산하는 클래스
 * The type Salary manager.
 */
public class SalaryManager {

    final static SalaryManager sm = new SalaryManager();
    static final double work = 0.125; //근로소득세
    static final double nation = 0.081; //national pension 국민연금
    static final double health = 0.135; //건강보험료

    public static void main(String[] args) {
        double salary = sm.getMonthlySalary(20_000_000);
        System.out.printf("\n 공제 후 월급 : %.2f\n",salary);
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

        double tax = calculateTax(salary);
        double nation = calculateNationalPerson(salary);
        double health = calculateHealthnsurance(salary);

        salary -= (tax + nation + health);
        return salary;
    }

    /**
     * 월급여를 받고 근로소득세를 공제하고 반환한다.
     * Calculate tax double.
     *
     * @param salary the salary
     */
    public double calculateTax(double salary){
        double tax = salary * work;
        System.out.printf("\n공제금액 : %.2f\n",tax);
        System.out.printf("공제후 월급 : %.2f\n",salary-tax);
        return tax;
    }

    /**
     * 연금을 공제해주는 메서드
     * Calculate national persion double.
     * @param salary the salary
     */
    public double calculateNationalPerson(double salary){
        double tax = salary * nation;
        System.out.printf("\n연금공제후 : %.2f\n",tax);
        System.out.printf("연금공제후 : %.2f\n",salary-tax);
        return tax;
    }
    public double calculateHealthnsurance(double salary){
        double tax = salary * health;
        System.out.printf("\n건강보험료 : %.2f\n",tax);
        System.out.printf("건강보험 공제후 : %.2f\n",salary-tax);
        return tax;
    }

}
