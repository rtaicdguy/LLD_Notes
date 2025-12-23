package lruCache;

public class Main {
    public static void main(String[] args) {
        LRUCache lruCache=new LRUCache(3);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);

        System.out.println("1->"+lruCache.get(1)); //10

        lruCache.put(4,40); //evict key 2

        System.out.println("2->"+lruCache.get(2)); //-1


        System.out.println("3->"+lruCache.get(3)); //30

        lruCache.put(5,50);  //evict key 1

        System.out.println("1->"+lruCache.get(1)); //-1
        System.out.println("4->"+lruCache.get(4)); //40
        System.out.println("5->"+lruCache.get(5)); //50



    }
}
