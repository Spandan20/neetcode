package Arrays;

public class DesignHashset {

    private static class MyHashSet {
        private final Node[] hash;
        public MyHashSet() {
            hash = new Node[10000];
            for (int i = 0; i < hash.length; i++) {
                hash[i] = new Node(-1); // 0 <= key <= 10000
            }
        }
        public void add(int key) {
            int index = key % 10000;
            Node curr = hash[index];
            if (curr.data == key) return;
            while (curr.next != null) {
                if (curr.next.data == key) return;
                curr = curr.next;
            }
            curr.next = new Node(key);

        }

        public boolean contains(int key) {
            int index = key % 10000;
            Node curr = hash[index];
            while (curr != null) {
                if (curr.data == key) return true;
                curr = curr.next;
            }
            return false;
        }

        public void remove(int key) {
            int index = key % 10000;
            Node curr = hash[index];
            if (curr.data == key) hash[index] = curr.next;
            while (curr.next != null) {
                if (curr.next.data == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }
    }

    private static class Node {
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
        set.add(2);
        System.out.println(set.contains(2));
        set.remove(2);
        System.out.println(set.contains(2));
    }

}
