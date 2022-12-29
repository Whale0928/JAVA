package etc;

public class interfaceOfTestClass {

    public static void main(String[] args) {
        Object a = "String 객체";
        Object b = new String("321");

        if (a instanceof String)
            System.out.println(a.toString());

        if(b instanceof Integer)
            System.out.println("인트형 동일");
    }
}
