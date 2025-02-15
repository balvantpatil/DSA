public class Main {
    
    public static void main(String [] args){

        LinkedList LL = new LinkedList(2);

        LL.makeEmpty();
        LL.append(1);
        LL.append(2);
        LL.append(3);
        LL.append(4);
        LL.append(5);
        LL.removeLast();
        LL.removeLast();
        LL.printList();

        LL.getHead();
        LL.getTail();
        LL.getLength();


        
       
    }

}
