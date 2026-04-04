import java.util.*;

// Create
Map<Integer, Integer> map = new HashMap<>();
Map<String, List<Integer>> mp2 = new HashMap<>();
Map<Integer, Integer> ordered = new TreeMap<>();
Map<Integer, Integer> insertionOrder = new LinkedHashMap<>();

// Put / update
map.put(1, 10);
map.put(2, 20);
map.put(1, 99);
map.putIfAbsent(3, 30);
map.merge(1, 5, Integer::sum);

// Read
int val = map.get(1);
int safe = map.getOrDefault(7, 0);
boolean hasKey = map.containsKey(1);
boolean hasValue = map.containsValue(99);
int sz = map.size();
boolean empty = map.isEmpty();

// Frequency counting
int x = 5;
map.put(x, map.getOrDefault(x, 0) + 1);
map.merge(x, 1, Integer::sum);

// Remove
map.remove(1);
map.remove(2, 20);
map.clear();

// Iterate
for (int key : map.keySet()) {}
for (int value : map.values()) {}
for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    int k = e.getKey();
    int v = e.getValue();
}

// Nested map/list patterns
mp2.computeIfAbsent("a", k -> new ArrayList<>()).add(10);

// Sorting by value after extracting entries
List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
entries.sort((a, b) -> Integer.compare(a.getValue(), b.getValue()));

// Common traps
// map.get(key) can return null
// TreeMap gives sorted keys, HashMap does not
// containsKey(...) is safer than get(...) != null when values can be null
