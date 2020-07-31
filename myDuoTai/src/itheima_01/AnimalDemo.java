package itheima_01;
//测试类

public class AnimalDemo {
    public static void main(String[] args) {

        //创建猫类对象进行测试
        Animal a =  new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲猫",6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        System.out.println("----------------");
        //创建狗类对象就行测试
        Animal b = new Dog();
        b.setName("哮天犬");
        b.setAge(30);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

        b = new Dog("哮天犬",100);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

    }

}
