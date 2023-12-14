/*Write an oops program to swap the contents of two objects. */
import java.util.Scanner;
class Question2 {
    public static void main(String[] args) {
        SwapObjects obj1 = new SwapObjects();
        SwapObjects obj2 = new SwapObjects();
        obj1.display();
        obj2.display();
        SwapObjects.swap(obj1,obj2);
        obj1.display();
        obj2.display();
    }
}
class SwapObjects{
    int a;
    int b;
    public SwapObjects(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a= sc.nextInt();
        System.out.println("Enter the value of b : ");
        b= sc.nextInt();
    }
    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

    public void seta(int v1){
        a = v1;
    }

    public void setb(int v2){
        b = v2;
    }
    static  void swap(SwapObjects l1 , SwapObjects l2) {
        int j , k ;
        j= l1.geta();
        k= l1.getb();
        l1.seta(l2.geta());
        l1.setb(l2.getb());
        l2.seta(j);
        l2.setb(k);
    }

    public void display(){
        System.out.println(a + "  " + b);
    }
}


