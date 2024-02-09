vpublic class Lecture8 {
    int width;
    int height;
    void display(String item){
        System.out.println("Height of the product is: "+height+" ,And width of it is: "+width);
    }
    public static void main(String args[]){
        chair neelkamal=new chair();
        neelkamal.details();

    }
}

class chair extends Lecture8{
    void details(){
        height=24;
        width=32;
        display("chair");
        
    }

}
class stool extends Lecture8{
    void details(){
        height=12;
        width=32;
        display("stool");
    }
}