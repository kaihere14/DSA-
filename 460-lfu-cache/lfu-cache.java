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
    int capacity = 0;
    int u_capacity = 0;
    int freq = 1;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(keyMap.get(key)!=null){
            Node node = keyMap.get(key);
            int curr_freq = node.freq;
            int next_freq = node.freq+1;
            int ans = node.value;
 
            DLL d = freqMap.get(next_freq);

            if (d == null) {
                d = new DLL();
                freqMap.put(next_freq, d);
            }

            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.freq = next_freq;


            node.prev = d.tail.prev;
            node.next = d.tail;
            d.tail.prev = node;
            node.prev.next = node;

            DLL curr = freqMap.get(curr_freq);
            if (curr.head.next == curr.tail && curr_freq == freq) {
                freq++;
            }

            return ans;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(this.capacity == 0)return;

        Node node = keyMap.get(key);
        if(node!=null){
            node.value = value;
            int curr_freq = node.freq;
            int next_freq = node.freq+1;

            DLL d = freqMap.get(next_freq);

            if (d == null) {
                d = new DLL();
                freqMap.put(next_freq, d);
            }

            node.prev.next = node.next;
            node.next.prev = node.prev;
            
            node.freq = next_freq;


            node.prev = d.tail.prev;
            node.next = d.tail;
            d.tail.prev = node;
            node.prev.next = node;

            DLL curr = freqMap.get(curr_freq);
            if (curr.head.next == curr.tail && curr_freq == freq) {
                freq++;
            }
            return;
        }else{
            node = new Node(key,value,1);
        }
        DLL d = freqMap.get(this.freq);

        if(this.capacity<=this.u_capacity){
            Node r_node = d.head.next;
            r_node.next.prev = r_node.prev;
            r_node.prev.next = r_node.next;
            keyMap.remove(r_node.key);
            this.u_capacity--;
        }
        DLL newList = freqMap.get(1);
        if(newList==null){
            newList = new DLL();
            freqMap.put(1,newList);
        }
        node.prev = newList.tail.prev;
        node.next = newList.tail;
        node.prev.next = node;
        newList.tail.prev = node;
        keyMap.put(key, node);   
        this.freq=1;
        this.u_capacity++;

    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */