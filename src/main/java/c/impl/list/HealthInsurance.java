package c.impl.list;

public enum HealthInsurance {
    LEVEL_ONE(1_000,1.0)
    ,LEVEL_TWO(2_000,2.0)
    ,LEVEL_THREE(3_000,3.2)
    ,LEVEL_FOUR(4_000,4.5)
    ,LEVEL_FIVE(5_000,5.6)
    ,LEVEL_SIX(6_000,7.1);

    private final int maxSalary;
    private final double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio(){
        return this.ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        switch (salary){
            case 1_000 : return LEVEL_ONE;
            case 2_000 : return LEVEL_TWO;
            case 3_000 : return LEVEL_THREE;
            case 4_000 : return LEVEL_FOUR;
            case 5_000 : return LEVEL_FIVE;
            case 6_000 : return LEVEL_ONE;
            default: return null;
        }
    }

    @Override
    public String toString() {
        return "HealthInsurance{" +
                "maxSalary=" + maxSalary +
                ", ratio=" + ratio + "}\n";
    }
}
