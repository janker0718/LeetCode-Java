package cc.janker.optional.model;

public class Student {
    private String name;
    private int  stuNo;
    private User user;

    public Student() {
    }

    public Student(String name, int stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                '}';
    }
}
