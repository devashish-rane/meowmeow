import java.util.*;

// List of lists
List<List<Integer>> adj = new ArrayList<>();
int n = 5;
for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
adj.get(0).add(1);

// ArrayList from another collection
Set<Integer> set = new HashSet<>();
List<Integer> list = new ArrayList<>(set);

// LinkedHashMap / LinkedHashSet when order matters
LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

// TreeMap / TreeSet for ordered queries
TreeMap<Integer, Integer> tm = new TreeMap<>();
tm.put(10, 1);
tm.put(20, 1);
Map.Entry<Integer, Integer> lower = tm.lowerEntry(20);
Map.Entry<Integer, Integer> floor = tm.floorEntry(15);
Map.Entry<Integer, Integer> ceil = tm.ceilingEntry(15);
Map.Entry<Integer, Integer> higher = tm.higherEntry(10);

// BitSet, rare but handy
BitSet bs = new BitSet();
bs.set(3);
bs.set(5);
boolean b = bs.get(3);

// Common DSA object wrappers
record Pair(int first, int second) {}
Pair p = new Pair(1, 2);

// int[] / long[] as quick tuple substitutes
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b2) -> Integer.compare(a[0], b2[0]));

// Common traps
// Prefer record or small class over unclear int[] when readability matters
// TreeMap / TreeSet are useful for nearest greater/smaller queries
