/**
 * Created by 陈子健 on 2016/10/18.
 */
class Human {
    private String name;
    private int age;
    private String sex = "男";

    public void tell() {
        System.out.println("我的名字: " + getName() + ", 我的年龄: " + getAge() + ", 我的性别: " + sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
