package d.lang;

import java.util.Map;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem system = new JavaLangSystem();
        system.sysoutProperties();
        system.getSystemTime();
    }

    public void sysoutProperties(){
        System.out.println("Java Version : " +System.getProperty("java.version"));

        Map<String, String> getenv = System.getenv();
        for (String k : getenv.keySet()){
            System.out.println(k+"="+getenv.get(k));
        }
    }

    public void getSystemTime(){
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}
