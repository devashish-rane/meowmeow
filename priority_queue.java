import java.util.*;

// Min heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(5);
minHeap.offer(1);
minHeap.offer(3);
int min = minHeap.peek();
int gone = minHeap.poll();

// Max heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

// For arrays / objects
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
pq.offer(new int[]{2, 10});
pq.offer(new int[]{1, 99});
int[] best = pq.poll();

// Top k pattern
PriorityQueue<Integer> topK = new PriorityQueue<>();
for (int x : new int[]{5, 1, 9, 2}) {
    topK.offer(x);
    if (topK.size() > 2) topK.poll();
}

// Common traps
// Iterating a PriorityQueue does not give sorted order
// poll() removes, peek() does not
// Use Integer.compare(...) instead of b - a to avoid overflow
