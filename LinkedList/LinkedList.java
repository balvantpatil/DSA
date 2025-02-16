public class LinkedList{

    public Node Head;
    public Node Tail;
    public int Length;

    public class Node{
        
        public int Value;
        public Node Next;
        
        public Node (int value){
            this.Value = value;
        }
    }

    public LinkedList (int value){
        Node newNode = new Node(value);
        Head = newNode;
        Tail = newNode;
        Length = 1;
    }
    
    public void getHead() {
        System.out.println("Head = "+Head.Value);;
    }

    public void getTail() {
       System.out.println("Tail = "+Tail.Value);
    }

    public void getLength() {
        System.out.println("Lenghth = "+Length);
    }

    public void printList(){
        Node temp = Head;
        while (temp != null){
            System.out.println(temp.Value);
            temp = temp.Next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(Length == 0){
            Head = newNode;
            Tail = newNode;
        }else{
            Tail.Next = newNode;
            Tail.Next = newNode;
            }
            
            Tail = newNode;
        ++Length;
    }

    public void makeEmpty(){
        Head = null;
        Tail = null;
        Length = 0;
    }

    public void removeLast(){
        if(Length == 0){
            System.out.println("Nothing to remove, List is empty");
        }else if(Length == 1){
            Head = null;
            Tail = null;
            Length = 0;
        }else{
            Node temp = Head;
            Node prev = Head;
            while (temp.Next != null) {
                prev = temp;
                temp = temp.Next;
            }
            temp = prev;
            temp.Next=null;
            Tail = temp;
            --Length;

        }
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(Length == 0){
            Head = newNode;
            Tail = newNode;
            ++Length;
        }else{
            newNode.Next = Head;
            Head = newNode;
            ++Length;
        }
    }

    public void removeFirst(){
        if(Length == 0){
            System.out.println("Nothing To Remove");
        }else{
            Node Temp = Head;
            Head = Head.Next;
            Temp.Next = null;
            --Length;
        }
    }

}