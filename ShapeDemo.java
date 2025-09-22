import java.util.Scanner;
abstract class shape{
   float dim1,dim2;
   shape(float d1,float d2){
        dim1=d1;
        dim2=d2;
   }
   abstract void PrintArea();
}
class Rectangle extends shape{
  Rectangle(float length,float breadth){
     super(length,breadth);
  }
  void PrintArea(){
      float area=dim1*dim2;
      System.out.println("Area of Rectangle:"+area);
  }
}
class Triangle extends shape{
  Triangle(float base,float height){
     super(base,height);
  }
  void PrintArea(){
      float area=0.5f*dim1*dim2;
      System.out.println("Area of Triangle:"+area);
  }
}
class Circle extends shape{
  Circle(int radius){
     super(radius,0);
  }
  void PrintArea(){
      double area=3.14*dim1*dim2;
      System.out.println("Area of Circle:"+area);
  }
} 
public class ShapeDemo{
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int choice;
      /*do{
         System.out.println("\n---calculate Area----");
         System.out.println("1.Rectangle");
         System.out.println("2.Triangle");
         System.out.println("3.Circle");
         System.out.println("4.Exit");
         System.out.print("Enter your choice:");
         choice=sc.nextInt();
         switch(choice){
           case 1:*/
              System.out.print("Enter length:");
              float l=sc.nextFloat();
              System.out.print("Enter breadth:");
              float b=sc.nextFloat();
              Rectangle r=new Rectangle(l,b);
              r.PrintArea();
              //break;
           //case 2:
              System.out.print("Enter base:");
              float base=sc.nextFloat();
              System.out.print("Enter height:");
              float h=sc.nextFloat();
              Triangle t=new Triangle(base,h);
              t.PrintArea();
              //break;       
           //case 3:
              System.out.print("Enter radius:");
              float rad=sc.nextFloat();
              Circle c=new Circle(rad);
              c.PrintArea();
              //break;
           //case 4:
              System.out.print("Exiting program...");
             // break; 
        /*default:
              System.out.println("Invalid choice");
            }
}while(choice!=4);*/
  sc.close();
  }
}                
                   
        
               
