package lruCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final Map<Integer,Node> cacheMap;
    private final Integer maxCapacity;
    private Node head;
    private Node tail;

    LRUCache(Integer maxCapacity){
        this.maxCapacity=maxCapacity;
        cacheMap=new HashMap<>();
        head=new Node(null,null,-1,-1);
        tail=new Node(null,null,-1,-1);
        head.next=tail;
        tail.prev=head;
    }

    Integer get(Integer key){
        if(!cacheMap.containsKey(key)){
            return -1;
        }
        Node node=cacheMap.get(key);
        remove(node);
        addToFront(node);
        return node.value;
    }

    void put(Integer key,Integer val){
        if(cacheMap.containsKey(key)){
            Node node=cacheMap.get(key);
            node.value=val;
            remove(node);
            addToFront(node);
            return;
        }

        if(cacheMap.size()==maxCapacity){
            Node lruNode=tail.prev;
            remove(lruNode);
            cacheMap.remove(lruNode.key);
        }

        Node node=new Node(null,null,key,val);
        cacheMap.put(key,node);
        addToFront(node);
    }


    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void addToFront(Node node) {
        node.next=head.next;
        node.prev=head;
        head.next.prev= node;
        head.next= node;
    }



    private static class Node {
        public Node prev;
        public Node next;
        public Integer key;
        public Integer value;

        Node(Node prev,Node next,Integer key,Integer value){
            this.prev=prev;
            this.next=next;
            this.key=key;
            this.value=value;
        }
    }
}
