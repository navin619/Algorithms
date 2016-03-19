/**
 * Created by navin on 3/18/16.
 */
public class SingleLinkList {

    Node head;


    public void addNode(Node x){
        Node temp;

        if(head == null){
            // if head is null head is the first node
            head =  x;
        }
        else{
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = x;

        }

    }

    public void deletelastnode(){

       if(head == null){
           System.out.println("Nothing to delete");
       }
        else {
           Node temp =head;
           while(temp.next.next!=null){
               temp = temp.next;
           }
           temp.next= null;
       }
    }


    public void printLinkList(){
        if(head == null){
            System.out.println("Nothing inside");
        }
        else{
            Node temp;
            temp = head;
            while(temp!= null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {


        SingleLinkList a = new SingleLinkList();


        a.addNode(new Node(1));
        a.addNode(new Node(2));
        a.addNode(new Node(3));

        a.printLinkList();


    }

}
