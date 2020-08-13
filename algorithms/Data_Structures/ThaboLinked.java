package algorithms.Data_Structures;

public class ThaboLinked {

    private static class Node<T> {
        private T data;
        private Node<T> next;

        //constructor
        public Node<T> (T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;

    public void addToFirst(T item){
        //Node<T> = head;
        head = new Node<T> (item, head);

    }

    public static void addToLast(T item){
        if(head == null) addToFirst(item);

        else{
            Node<T> temp = head;
            while(temp.next != null) temp = temp.next;

            temp.next = new Node<T>(item, null);
        }

    }

    public static Node<T> search(T item){
        Node<T> judas = null;

        if(head == null) throw new RuntimeException("cannot find");

        if(head.data.equals(item)){
            judas = null;
        }
        Node<T> curr = head;
        else{
            while(curr !=null && !curr.data.equals(item)){
                curr = curr.next;
            }

            if(curr == null) throw new RuntimeException("cannot find");

            judas = curr;

        }

        return judas;


    }

    public static void delete(T item){

        if(head == null) throw new RuntimeException("Cannot delete");

        if(head.data.equals(item)){
            head = head.next;
            return;
        }

        Node<T> curr = head;
        Node<T> prev = null;

        while(curr != null && !curr.data.equals(item)){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;

    }
    
}