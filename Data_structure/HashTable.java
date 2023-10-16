import java.util.LinkedList;

public class HashTable {

    LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    public void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }

        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        }else {
            node.value = value;
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? null : node.value;
    }

    private int getHashCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    private int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    private Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }



    private static class Node {
        private String key;
        private String value;

        private Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        HashTable map = new HashTable(3);
        map.put("hong" , "Eunmo Hong");
        map.put("grace" , "GraceLove");
        map.put("github", "https://github.com/gracelove91");
        map.put("tistory", "https://gracelove91.tistory.com");
        map.put("email", "govlmo91@gmail.com");
    }
}