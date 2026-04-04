import java.util.*;

int[] a = {5, 1, 4, 2};
Arrays.sort(a);
Arrays.sort(a, 1, 3); // [1,3)

Integer[] b = {5, 1, 4, 2};
Arrays.sort(b, (x, y) -> Integer.compare(y, x));

List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 4, 2));
Collections.sort(list);
list.sort(Comparator.naturalOrder());
list.sort(Comparator.reverseOrder());
list.sort((x, y) -> Integer.compare(x, y));

// 2D arrays
int[][] arr = {{1, 3}, {1, 2}, {2, 5}};
Arrays.sort(arr, (x, y) -> {
    if (x[0] != y[0]) return Integer.compare(x[0], y[0]);
    return Integer.compare(x[1], y[1]);
});

// Objects / records
record Node(int val, int idx) {}
List<Node> nodes = new ArrayList<>();
nodes.sort(Comparator.comparingInt(Node::val));
nodes.sort(Comparator.comparingInt(Node::val).thenComparingInt(Node::idx));

// PriorityQueue comparator
PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::val));

// Reverse list
Collections.reverse(list);

// Common traps
// Arrays.sort on primitives cannot take custom comparator
// Use Integer[] if custom comparator is needed
// Avoid x - y comparator if overflow is possible
