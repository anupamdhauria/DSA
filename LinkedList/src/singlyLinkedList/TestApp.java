package singlyLinkedList;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList(); 
        System.out.println("Singly Linked List Test\n");          
        char ch;
      
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. display the records");
            System.out.println("6. get size");     
            System.out.println("7. exit");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtBegin( scan.nextInt());                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPosition(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPosition(p);
                break;
            case 5 : 
            	list.display();
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;  
            case 7:System.exit(0);break;
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
        
                             
        } while (true);               
    }

	

}
