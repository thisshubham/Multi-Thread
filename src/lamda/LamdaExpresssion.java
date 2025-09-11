package lamda;

public class LamdaExpresssion {
    public static void main(String[] args) {
        Student studentIm = new Student() {
            @Override
            public void getName(String name) {
                System.out.println("student name " + name);
            }
        };
        Student student = (String name) -> {
            System.out.println("student name " + name);
        };
        Student student1 = name -> System.out.println("student1 name " + name);

    }
}
