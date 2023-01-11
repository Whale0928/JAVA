package d.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample wildcardSample = new WildcardSample();
        wildcardSample.callWildcardMethod();
    }

    public void callWildcardMethod(){
        //추론이 가능해서
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    public void wildcardStringMethod(WildcardGeneric<String> c){
        String value = c.getWildcard();
        System.out.println("value = " + value);

    }
}
