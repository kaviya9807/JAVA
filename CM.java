import java.util.*;

public class CM{
    public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    ArrayList<String>names=new ArrayList<>();
    ArrayList<String>phones=new ArrayList<>();
   int choice;
   do{
         System.out.println("\n--add the contact---");
         System.out.println("1.Add Contact");
         System.out.println("2.view contact");
         System.out.println("3.search contacts");
         System.out.println("4.update contact");
         System.out.println("5.delete contact");
         System.out.println("6.exit");
         System.out.println("enter your choice:");
         choice=sc.nextInt();
         sc.nextLine();
         if(choice==1){
             System.out.println("Enter name:");
             String name=sc.nextLine();
             System.out.println("enter phone:");
             String phone=sc.nextLine();
             names.add(name);
             phones.add(phone);
             System.out.println("contact added:");
           }
           else if(choice==2){
              for(int i=0;i<names.size();i++){
                  System.out.println((i+1)+","+names.get(i)+"-"+phones.get(i));
               }
            }else if(choice==3){
                System.out.println("enter name to search:");
                String search=sc.nextLine();
                boolean found=false;
                for(int i=0;i<names.size();i++){
                    if(names.get(i).equalsIgnoreCase(search)){
                       System.out.println("found:"+ names.get(i)+"-"+phones.get(i));
                       found=true;
                     }
                 }
                 if(!found){
                     System.out.println("contact not found.");
                  }
             }else if(choice==4){
                  System.out.println("contact name to update:");
                  String update=sc.nextLine();
                  for(int i=0;i<names.size();i++){
                     if(names.get(i).equalsIgnoreCase(update)){
                        System.out.println("enter new phone:");
                        phones.set(i,sc.nextLine());
                        System.out.println("updated succesfully");
                      }
                  }
               }else if(choice==5){
                  System.out.println("enter name to delete:");
                  String delete=sc.nextLine();
                  for(int i=0;i<names.size();i++){
                      if(names.get(i).equalsIgnoreCase(delete)){
                         names.remove(i);
                         phones.remove(i);
                         System.out.println("deleted succesfully");
                         break;
                       }
                     }
                 }else if(choice==6){
                    System.out.println("Exiting...");
                 }else{
                    System.out.println("Invalid choice");
                 }
           }while(choice!=6);
        }
   }
                 
                 
                 
                    
              
              
                  
                  
