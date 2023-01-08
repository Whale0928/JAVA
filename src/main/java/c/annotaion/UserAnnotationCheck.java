package c.annotaion;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args){
        UserAnnotationCheck check = new UserAnnotationCheck();
    }
    public void checkAnnotations(Class useClass){
        Method[] methods = useClass.getDeclaredMethods();

        for(Method method : methods){
            UserAnnotation annotation = method.getAnnotation(UserAnnotation.class);

            if (annotation != null){
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(method.getName()+"number = " + number+"text = " + text);
            }else{
                System.out.println(method.getName()+"is Null");
            }
        }
    }
}
