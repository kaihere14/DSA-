class Node {
    int key;
    int value;
    int freq;
    Node prev;
    Node next;

    Node(int key, int value, int freq) {
        this.key = key;
        this.value = value;
        this.freq = freq;
    }
}

class DLL {
    Node head;
    Node tail;

    DLL() {
        head = new Node(-1, -1, 0);
        tail = new Node(-1, -1, 0);
        head.next = tail;
        tail.prev = head;
    }
}

class LFUCache {
    Map<Integer, DLL> freqMap = new HashMap<>();
    Map<Integer, Node> keyMap = new HashMap<>();

    int capacity;
    int u_capacity;
    int freq = 1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void add(Node node, DLL list) {
        node.prev = list.tail.prev;
        node.next = list.tail;
        list.tail.prev = node;
        node.prev.next = node;
    }

    private void increaseFreq(Node node) {
        int currFreq = node.freq;
        int nextFreq = currFreq + 1;

        DLL nextList = freqMap.get(nextFreq);

        if (nextList == null) {
            nextList = new DLL();
            freqMap.put(nextFreq, nextList);
        }

        remove(node);

        node.freq = nextFreq;
        add(node, nextList);

        DLL currList = freqMap.get(currFreq);

        if (currList.head.next == currList.tail && currFreq == freq) {
            freq++;
        }
    }

    public int get(int key) {
        Node node = keyMap.get(key);

        if (node == null) {
            return -1;
        }

        int value = node.value;
        increaseFreq(node);

        return value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        Node node = keyMap.get(key);

        if (node != null) {
            node.value = value;
            increaseFreq(node);
            return;
        }

        if (u_capacity >= capacity) {
            DLL list = freqMap.get(freq);
            Node removeNode = list.head.next;

            remove(removeNode);
            keyMap.remove(removeNode.key);
            u_capacity--;
        }

        DLL list = freqMap.get(1);

        if (list == null) {
            list = new DLL();
            freqMap.put(1, list);
        }

        node = new Node(key, value, 1);
        add(node, list);

        keyMap.put(key, node);
        freq = 1;
        u_capacity++;
    }
}