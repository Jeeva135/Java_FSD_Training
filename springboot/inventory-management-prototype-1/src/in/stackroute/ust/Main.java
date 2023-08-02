package in.stackroute.ust;

import in.stackroute.ust.domain.Inventory;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inventory management application - proptotype 1.0");
        Scanner s=new Scanner(System.in);
        int ch;
        Inventory inventory=new Inventory();
        // this will be the main entry point for the application,
        // this will be a menu-driven application
        // the menu will have the following options:
        // 1. Add item
        // 2. Search item
        // 3. Display all items
        // 4. Exit
        do {
            System.out.println("\n1.Add item\n2.Search item\n3.Display all items\n4.Exit\n");
            System.out.println("Enter the choice : ");
            ch=s.nextInt();
            switch (ch)
            {
                case 1:
                    String name,des;
                    double price;
                    int qty,id;
                    System.out.println("Enter item id");
                    id=s.nextInt();
                    System.out.println("Enter the item");
                    name=s.next();
                    System.out.println("Description");
                    des=s.next();
                    System.out.println("Enter the price");
                    price=s.nextDouble();
                    System.out.println("Quantity");
                    qty=s.nextInt();
                    inventory.addItem(id,name,des,price,qty);
                    break;

                case 2:
                    System.out.println("Enter the Item");
                    String item=s.next();
                    inventory.searchItem(item);
                    break;

                case 3:
                    inventory.displayItem();
                    break;

                case 4:
                    exit(0);

                default:
                    System.out.println("Enter invalid choice");
            }
        }while(ch!=4);
    }
}