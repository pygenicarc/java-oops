class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("dog is eating...");
    }
}
public class Inheritance{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new dog();
        a.eat();
        b.eat();
    }
}