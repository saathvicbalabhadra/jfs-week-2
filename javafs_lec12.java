class A{
    String type="I am an alpahabet";
    void groupType(){
        System.out.println(type+",and I am the first alphabet");
    }
}
class B extends A{
    void groupType(){
        System.out.println(type+",and I am the second alphabet");
    }
}
class C extends B{
    void groupType(){
        System.out.println(type+",and I am the third alphabet");
    }
}

public class Lecture12 {
    public static void main(String[] args) {
        C c=new C();
        c.groupType();
    }
    
}
