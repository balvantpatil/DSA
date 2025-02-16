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
        LL.prepend(10);
        LL.removeFirst();
        
        System.out.println("*******************");
        LL.printList(); 
        System.out.println("*******************");
        LL.getHead();
        LL.getTail();
        LL.getLength();
        System.out.println("*******************");


        
       
    }

}
