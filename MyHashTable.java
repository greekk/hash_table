package hashtable;

import java.util.Objects;

public class MyHashTable {

    public int init_size = 16;

    private Node[] nodes = new Node[init_size];

    public void put(String key, String value){

        int hash = getHash(key);
        Node node = new Node(key, value);

        if (this.nodes[hash] == null) {
            this.nodes[hash] = node;
        }
        else{
            Node current = nodes[hash];
            while(current.next != null){
                current =current.next;
            }
            current.next = node;
        }

    }

    public String get(String key){
        int hash = this.getHash(key);

        if(this.nodes[hash] != null){
            Node current = nodes[hash];

            while(!current.key.equals(key) && current.next != null){
                current = current.next;
            }
            return current.value;
        }
        return null;
    }

    private int getHash(String key){
        return (key.hashCode() % this.init_size)&init_size-1;
    }

    private class Node{
        String key;
        String value;
        Node next;

        public Node(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString(){
            return "key " + " " + " value";
        }
    }

    @Override
    public String toString(){
        int bucket = 0;
        String hashTableString = "";
        for(Node node : this.nodes){
            if(node == null)
                continue;
            hashTableString += "\n bucket[" + bucket + "] = " + node.toString();
            bucket++;
            Node current = node.next;
            while(Objects.nonNull(current)){
                hashTableString += " -> " + current.toString();
                current = current.next;
            }
        }
        return hashTableString;
    }

}
