package ru.ifmo.collections;
import java.util.Collections;
import java.util.PriorityQueue;


public class KthLargest {

    private final PriorityQueue<Integer> numbers;
    private final int k;

    public KthLargest(int k, int[] numbers) {
        this.numbers = new PriorityQueue<>(Collections.reverseOrder());
        this.k = k;
        for (int i : numbers) {
            this.numbers.add(i);
        }
    }

    public int add(int val) {
        numbers.add(val);
        PriorityQueue<Integer> temp = new PriorityQueue<>(numbers);
        for (int i = 0; i < k - 1; i++) {
            temp.poll();
        }
        return temp.peek();
    }
}