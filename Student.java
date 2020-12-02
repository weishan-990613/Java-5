package pack10;

public class Student {
    public String name;
    public String banji;
    public String id;

    public Student(String name, String banji, String id) {
        this.name = name;
        this.banji = banji;
        this.id = id;
    }

    @Override
    public String toString() {
        return " 班级：" + banji + " 姓名：" + name + " 学号：" + id;
    }
}
