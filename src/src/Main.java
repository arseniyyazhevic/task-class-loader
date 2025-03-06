import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> validator = myClassLoader.load("Validator");

        Object object = validator.getDeclaredConstructor().newInstance();
        Class<?> Class = int.class;
        Method validate = validator.getMethod("validate", Class);

        validate.invoke(object, 10);
    }
}