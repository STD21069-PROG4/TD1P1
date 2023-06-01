import com.example.td1.ClassSingleton;

public class TestClassSingleton {
    public static void main(String[] args) {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        ClassSingleton singleton2 = ClassSingleton.getInstance();
        ClassSingleton singleton3 = ClassSingleton.getInstance();

        singleton1.setDescription("Première description");
        singleton2.setDescription("Deuxième description");
        singleton3.setDescription("Troisième description");

        System.out.println("Description 1 : " + singleton1.getDescription());
        System.out.println("Description 2 : " + singleton2.getDescription());
        System.out.println("Description 3 : " + singleton3.getDescription());
    }
}
