import java.util.Stack;
import java.util.ListIterator;


class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Dynamic {
    public static void main(String[] args) {
        Stack<Person> stack = new Stack<>();
    
        stack.push(new Person("Ritesh", 22));
        ListIterator<Person> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person); 
        }
    }
}
