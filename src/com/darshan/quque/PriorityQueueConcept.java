package com.darshan.quque;

import java.util.PriorityQueue;

public class PriorityQueueConcept {

    /**
     * Priority queue does not have specified ends, so insertion doesnt happen at a specific end,
     * and deletion also does not happen at a specific end.
     *
     * When you insert into the queue, the elements can be inserted in any order,
     * but the removal happens according to the priority/ value assigned to it
     * @param args
     */
    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println("Numbers before rekoval : "+numbers);
            System.out.println(numbers.remove());
        }

    }
}
