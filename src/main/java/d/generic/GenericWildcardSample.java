package d.generic;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
        sample.callGenericMethod();
    }

    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericMethod(wildcard,"Add_Value");
    }
    public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println("value = " + value);
    }
}
