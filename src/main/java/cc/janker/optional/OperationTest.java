package cc.janker.optional;

import cc.janker.optional.model.Student;
import cc.janker.optional.model.User;

import java.util.Optional;

public class OperationTest {
    public static void main(String[] args) {
//        optionalFilter();
//        optionalOrElse();
//        optionalMap();
    }

    private static void optionalMap() {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(14);
        Student student = new Student();
        student.setName("lisi");
        student.setStuNo(12);
        student.setUser(user);
        Optional<User> optionalUser = Optional.ofNullable(student).map(Student::getUser).filter(u -> 14 == user.getAge());
        User user1 = optionalUser.orElse(new User("null",0));
        System.out.println(user1);
    }

    private static void optionalOrElse() {
        User user = null;
        Optional<User> optional = Optional.ofNullable(user);
        User result = optional.orElse(new User("janker", 3));
        System.out.println(result);
    }

    private static void optionalFilter() {
        User user = new User();
        user.setAge(3);
        user.setName("janker");
        Optional<User> optional = Optional.ofNullable(user);
        Optional<User> optionalUser = optional.filter(u -> 3 == user.getAge());
        System.out.println(optionalUser.get());
    }
}
