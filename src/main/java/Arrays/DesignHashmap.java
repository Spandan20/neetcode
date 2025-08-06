package Arrays;

public class DesignHashmap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));
        System.out.println(map.get(3));
        map.put(2,1);
        System.out.println(map.get(2));
        map.remove(2);
        System.out.println(map.get(2));

    }

    private static class MyHashMap {
        private final Node[] nodeList;
        public MyHashMap() {
            nodeList = new Node[10000];
            for (int i = 0; i < nodeList.length; i++) {
                nodeList[i] = new Node(-1, -1);
            }
        }
        public void put(int key, int value) {
            int index = key % 10000;
            Node curr = nodeList[index];
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            while (curr.next != null) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                curr = curr.next;
            }
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr.next = new Node(key, value);
        }

        public int get(int key) {
            int index = key % 10000;
            Node curr = nodeList[index];
            while (curr != null) {
                if (curr.key == key) {
                    return curr.value;
                }
                curr = curr.next;
            }
            return -1;
        }

        public void remove(int key) {
            int index = key % 10000;
            Node curr = nodeList[index];
            if (curr.key == key) {
                nodeList[index] = curr.next;
                return;
            }
            while (curr.next != null) {
                if (curr.next.key == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }
    }

    private static class Node {
        int key;
        int value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
