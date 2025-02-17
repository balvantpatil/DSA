public class Main {
    
    public static void main(String [] args){

        LinkedList LL = new LinkedList(2);

        LL.makeEmpty();
        LL.append(1);
        LL.append(2);
        LL.append(3);
        LL.append(4);
        LL.append(5);
     /*   LL.removeLast();
        LL.removeLast();
        LL.prepend(10);
        LL.removeFirst();
        
        System.out.println("*******************");
        LL.printList(); 
        System.out.println("*******************");
        System.out.println(LL.getAtIndex(0).Value);
        System.out.println("*******************");

        System.out.println("Value Modified = "+LL.setAtIndex(0,200));
        System.out.println("*******************");  
    */
        //LL.printList(); 

        //LL.insert(0,100);
        LL.insert(0,100);

        LL.printList();

        LL.getHead();
        LL.getTail();
        LL.getLength();
        System.out.println("*******************");


        
       
    }

}
