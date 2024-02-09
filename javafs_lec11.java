class add{
    int sum(int n1,int n2 ){
        return n1+n2;
    }
    int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    int sum(int n1,float n2){
        return (int)( n1+n2);
    }

}

public class Lecture10_1 {
    public static void main(String[] args) {
        add a=new add();
        System.out.println(a.sum(2,8.5f));

    }
    
}
