package vo;

import java.util.Objects;


public class For_Equals_And_HashCode_Vo {
    private final String str1 = "abc";
    private final String str2 = "abc";
    private final String str3 = "abc";

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        For_Equals_And_HashCode_Vo that = (For_Equals_And_HashCode_Vo) o;
        return Objects.equals(str1, that.str1) && Objects.equals(str2, that.str2) && Objects.equals(str3, that.str3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str1, str2, str3);
    }

    public boolean hashCode(Object o1){
        return false;
    }
    public void cl() {
        System.out.println("cl => " + getClass());
    }


}
