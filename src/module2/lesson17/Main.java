package module2.lesson17;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

interface Connector {

    void listen();
}

public class Main {

    public static void main(String[] args) throws Exception {
        Class<MainTest> mainTestClass = MainTest.class;

        MainTest mainTest = new MainTest();

        Method[] methods = mainTestClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {

                if (annotation.annotationType().equals(org.junit.jupiter.api.Test.class)) {
                    method.invoke(mainTest);
                }

            }
            System.out.println("----------------");
        }
    }

}
