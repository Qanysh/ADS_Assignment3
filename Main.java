import java.util.Random;

public class Main {
    public void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();

        // add 10000 random elements to the table
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(rand.nextInt(1000), "name" + i);
            table.put(key, i);
        }

        // count the number of elements in each bucket
        int[] bucketCounts = new int[table.M];
        for (int i = 0; i < table.M; i++) {
            MyHashTable<MyTestingClass, Integer>.HashNode<MyTestingClass, Integer> node = table.chainArray[i];
            while (node != null) {
                bucketCounts[i]++;
                node = node.next;
            }
        }

        // print the bucket counts
        for (int i = 0; i < table.M; i++) {
            System.out.println("Bucket " + i + ": " + bucketCounts[i]);
        }
    }
}
}
