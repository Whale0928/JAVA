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

    public void wildcardStringMethod(WildcardGeneric<?> c){

        Object value = c.getWildcard();
        if(value instanceof String){
            System.out.println("value = " + value);
        }

    }
}
