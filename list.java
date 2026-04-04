import java.util.*;

// Create
List<Integer> list = new ArrayList<>();
List<Integer> ll = new LinkedList<>(); // rare in DSA interviews

// Add
list.add(10);                 // end
list.add(0, 5);               // insert at index
list.addAll(List.of(1, 2, 3));

// Read
int x = list.get(0);
int n = list.size();
boolean empty = list.isEmpty();

// Update
list.set(0, 99);

// Remove
list.remove(list.size() - 1); // by index
list.remove(Integer.valueOf(99)); // by value (important overload)

// Search
boolean has10 = list.contains(10);
int idx = list.indexOf(10);   // first index or -1
int last = list.lastIndexOf(10);

// Iterate
for (int v : list) {}
for (int i = 0; i < list.size(); i++) {
    int v = list.get(i);
}

// Sort / reverse
Collections.sort(list);
list.sort((a, b) -> b - a);
Collections.reverse(list);

// Sublist (view, not copy)
List<Integer> view = list.subList(1, 4); // [1,4)
List<Integer> copy = new ArrayList<>(list.subList(1, 4)); // safe copy

// Convert
Integer[] arr = list.toArray(new Integer[0]);
List<Integer> fixed = Arrays.asList(1, 2, 3); // fixed-size
List<Integer> mutable = new ArrayList<>(Arrays.asList(1, 2, 3));
