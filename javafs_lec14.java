import java.util.*;

public class Lecture14 {
    void calculate(){
        Scanner sc=new Scanner(System.in);
        int n1,n2,result=0;
        try{
        System.out.println("Enter 1st number:");
        n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        n2=sc.nextInt();
        result=n1/n2;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(InputMismatchException ime){
            System.out.println(ime);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("The result of the Division is:"+result);
        }
        
    }
    public static void main (String args[]){
        Lecture14 l14=new Lecture14();
        l14.calculate();
    }
}