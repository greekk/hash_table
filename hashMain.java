package hashtable;

public class hashMain {

    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable();
        hashTable.put("greekk", "Sasha");
        hashTable.put("corpsegrinder", "Fisher");
        hashTable.put("nergal", "Adam");

        System.out.println(hashTable.get("nergal"));
        System.out.println(hashTable.get("corpsegrinder"));
        System.out.println(hashTable.get("greekk"));
    }
}
