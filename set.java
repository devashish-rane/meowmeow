import java.util.*;

// Create
Set<Integer> set = new HashSet<>();
Set<Integer> sorted = new TreeSet<>();
Set<Integer> insertionOrder = new LinkedHashSet<>();

// Add
set.add(10);
set.add(20);
boolean added = set.add(10); // false if already present

// Read / search
boolean has10 = set.contains(10);
int sz = set.size();
boolean empty = set.isEmpty();

// Remove
set.remove(10);
set.clear();

// Iterate
for (int v : set) {}

// Common DSA patterns
int x = 5;
if (set.contains(x)) {
    // duplicate found
}
set.add(x);

// Convert
List<Integer> list = new ArrayList<>(set);

// TreeSet handy ops
TreeSet<Integer> ts = new TreeSet<>();
ts.add(10);
ts.add(20);
ts.add(30);
Integer lower = ts.lower(20);
Integer floor = ts.floor(20);
Integer ceiling = ts.ceiling(25);
Integer higher = ts.higher(20);
Integer first = ts.first();
Integer last = ts.last();

// Common traps
// HashSet has no ordering
// TreeSet operations are log n, HashSet average O(1)
// Do not mutate a set while iterating with for-each
