import java.util.*;

// Array literal in method call
eat(new int[]{1, 2, 3});

// List literal
List<Integer> list = List.of(1, 2, 3); // immutable
List<Integer> mutable = new ArrayList<>(List.of(1, 2, 3));

// Map literal
Map<String, Integer> map = Map.of("a", 1, "b", 2); // immutable

// Ternary
int ans = x > y ? x : y;

// For-each
for (int v : new int[]{1, 2, 3}) {}

// Multi-variable init
int l = 0, r = 10;

// Safe mid
int mid = l + (r - l) / 2;

// Char/int conversions
int digit = ch - '0';
char ch2 = (char) ('0' + digit);

// String to char array
char[] chars = s.toCharArray();

// Build list of lists
List<List<Integer>> g = new ArrayList<>();
for (int i = 0; i < n; i++) g.add(new ArrayList<>());

// Copy current path in backtracking
ansList.add(new ArrayList<>(cur));

// Default values
int[] a = new int[5]; // all 0
boolean[] vis = new boolean[5]; // all false
String[] names = new String[5]; // all null

// Switch expression
String type = switch (x) {
    case 1 -> "one";
    case 2 -> "two";
    default -> "other";
};

// Common traps
// List.of / Map.of are immutable
// Arrays.asList is fixed-size
// a.length is field, s.length() is method
// substring(l, r) uses exclusive r
