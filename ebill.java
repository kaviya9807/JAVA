import java.util.Scanner;
class ebill{
      public static void main(String args[]){
         int unit,prev,curr,cnum,choice;
         String cname;
         double bill=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Consumer no:");
         cnum=sc.nextInt();
         System.out.println("Consumer name:");
         sc.nextLine();
         cname=sc.nextLine();
         System.out.println("pre month reading:");
         prev=sc.nextInt();
         System.out.println("current month reading:");
         curr=sc.nextInt();
         System.out.println("Enter 1 for domestic /2 for commercial:");
         choice=sc.nextInt();
         unit=curr-prev;
         switch(choice)
         {
          case 1:
            if(unit<=100){
               bill=unit*1;
               } 
            else if(unit>100 && unit<=200){
               bill=100*1+(unit-100)+2.50;
               }
            else if(unit>200 && unit<=500){
               bill=100*1+2.50+(unit-200)*4;
               } 
            else{
               bill=100*1+100*2.50*300*4+(unit-500)*6;
               }
             break;
         case 2:
            if(unit<=100){
               bill=unit*2;
              }
            else if(unit>100 &&unit<=200){
               bill=100*2+(unit-100)*4.50;
             } 
            else if(unit>200 && unit<=500){
               bill=100*2+100*4.50+(unit-200)*6;
             } 
            else{
               bill=100*2+100*4.50+300*6+(unit-500)*7;
             }
             break;
         }
System.out.println("\t EB bill calculation \t:");
System.out.println("______________________");
System.out.println("Consumer name:"+cname);
System.out.println("Consumer no:"+cnum);
System.out.println("pre month reading:"+prev);
System.out.println("Current month reading:"+curr);
System.out.println("Type of connection:"+(choice==1? "Domestic":"Commercial"));
System.out.println("Total Charge:Rs"+bill);
}
}


