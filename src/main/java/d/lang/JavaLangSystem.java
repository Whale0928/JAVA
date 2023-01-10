package d.lang;

import java.util.Map;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem system = new JavaLangSystem();
        system.sysoutProperties();
        system.getSystemTime();


        System.out.println(system.parseLogn("10321dsa0"));

        system.printOtherBase(1024l);
    }

    public void sysoutProperties() {
        System.out.println("Java Version : " + System.getProperty("java.version"));

        Map<String, String> getenv = System.getenv();
        for (String k : getenv.keySet()) {
            System.out.println(k + "=" + getenv.get(k));
        }
    }

    public void getSystemTime() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }

    /**
     * 문자열을 받아 Long으로 변환
     * Parse logn long.
     *
     * @param data the data
     * @return the long
     */
    public long parseLogn(String data) {

        long result = 0;
        try {
            result = Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.println(data + "is not null");
            return -1;
        }

        return result;
    }

    public void printOtherBase(long value) {
        System.out.println("Original :" + value);
        System.out.println("Binary :" + Long.toBinaryString(value));
        System.out.println("Hex :" + Long.toHexString(value));
        System.out.println("Octal :" + Long.toOctalString(value));
    }
}
