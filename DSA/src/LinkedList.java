import java.util.Scanner;

public class LinkedList {

    class Node{
        int value;
        Node next;
        Node(){};
        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    Node head;
    int length = 0;

    private int add(int value)
    {
        Node node=new Node(value, null);
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node curr = head;
            while (curr.next != null)
            {
                curr = curr.next;
            }
            curr.next = node;
        }
        length++;
        return length;
    }

    private void add(int value, int position)
    {
        Node node = new Node(value, null);
        if(position > length || position < 0)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(position == 0)
        {
            node.next = head;
            head = node;
        }
        else if(position > 0 )
        {
            int count = 0;
            Node curr = head;
            while (curr.next != null && count < position-1)
            {
                curr = curr.next;
                count++;
            }
            Node temp = curr.next;
            curr.next = node;
            node.next = temp;
        }
        length++;
    }

    private void delete(int position)
    {
        if(position >= length || position < 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(position == 0)
        {
            head = head.next;
        }
        else if(position > 0)
        {
            Node curr = head;
            int count = 0;
            while(curr.next != null && count < position-1)
            {
                curr = curr.next;
                count++;
            }
            Node temp = curr.next;
            curr.next = temp.next;
        }
        length--;
    }

    private void display()
    {
        Node temp = head;
        System.out.println("*****");
        while(temp != null)
        {
            System.out.print(temp.value+ (temp.next == null ? "" : " -> "));
            temp = temp.next;
        }
        System.out.println("\nLength : "+length);
    }

    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run)
        {
            System.out.println("Options : ");
            System.out.println("1. Add element ");
            System.out.println("2. Add element at position");
            System.out.println("3. Delete element");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter input : ");
            int ip = Integer.parseInt(sc.nextLine());
            switch (ip) {
                case 1:
                    System.out.println("Enter a value : ");
                    list.add(Integer.parseInt(sc.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter a value : ");
                    int num = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter a position : ");
                    int pos = Integer.parseInt(sc.nextLine());
                    list.add(num, pos);
                    break;
                case 3:
                    System.out.println("Enter a position : ");
                    list.delete(Integer.parseInt(sc.nextLine()));
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
