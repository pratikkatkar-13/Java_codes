
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{ // as we have not overrided abstarct class method so we need to declare this class as abstract
    public void th(){
        System.out.println("I am good");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error

        //Parent2 p = new child2() -- correct

        //Child2 c = new Child2(); -- correct

        //Child3 c3 = new Child3(); -- error
    }
}
