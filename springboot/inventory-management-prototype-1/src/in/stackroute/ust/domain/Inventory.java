package in.stackroute.ust.domain;

public class Inventory {

    // class used to manage the items in the inventory
    Item[] inventory=new Item[20];
    int count=0;
    public void addItem(int id,String name,String des,double price,int qty)
    {
        int flag=0;
        Item item=new Item();
        item.id=id;
        item.name=name;
        item.des=des;
        item.price=price;
        item.qty=qty;
        for(int i=0;i<count;i++)
        {
            if(inventory[i].id==id)
            {
                inventory[i].qty=inventory[i].qty+qty;
                flag=1;
            }
        }
        if(flag==0)
        {
            inventory[count] = item;
            count++;
        }

    }

    public void searchItem(String item)
    {
        int flag=0;
        System.out.printf("%10s %15s %24s %15s %18s\n","ITEM ID","ITEM NAME","ITEM DESCRIPTION","ITEM PRICE","ITEM QUANTITY");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i=0;i<count;i++)
        {
            if(inventory[i].name.equalsIgnoreCase(item))
            {
                System.out.printf("%10s %15s %24s %10s %17s\n",inventory[i].id,inventory[i].name,
                        inventory[i].des,inventory[i].price,inventory[i].qty);
                System.out.println("---------------------------------------------------------------------------------------");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Not Found");
        }

    }

    public void displayItem()
    {
        double sum=0;
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%10s %15s %24s %15s %18s\n","ITEM ID","ITEM NAME","ITEM DESCRIPTION","ITEM PRICE","ITEM QUANTITY");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i=0;i<count;i++)
        {
            System.out.printf("%10s %15s %24s %10s %17s\n",inventory[i].id,inventory[i].name,
                    inventory[i].des,inventory[i].price,inventory[i].qty);
            sum=sum+(inventory[i].qty * inventory[i].price);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Total Price : "+sum);
    }
}
