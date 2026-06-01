import java.lang.reflect.Method;

class Demo {
    public void show() {
        System.out.println("Method Invoked");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Demo");

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method[] methods = cls.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.getName());
                method.invoke(obj);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}