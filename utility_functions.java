import java.util.*;

// Math
int mn = Math.min(3, 5);
int mx = Math.max(3, 5);
double pw = Math.pow(2, 10);
int abs = Math.abs(-7);
double ceil = Math.ceil(2.3);
double floor = Math.floor(2.9);
double sqrt = Math.sqrt(16);

// Character helpers
boolean d1 = Character.isDigit('7');
boolean l1 = Character.isLetter('a');
boolean w1 = Character.isWhitespace(' ');
char lo = Character.toLowerCase('A');
char up = Character.toUpperCase('b');

// Integer / Long parse
int x = Integer.parseInt("123");
long y = Long.parseLong("123456");

// Min / max over collections
List<Integer> list = Arrays.asList(3, 1, 9);
int minVal = Collections.min(list);
int maxVal = Collections.max(list);

// Swap for arrays
int[] a = {1, 2};
int i = 0, j = 1;
int tmp = a[i];
a[i] = a[j];
a[j] = tmp;

// Reverse a list
Collections.reverse(list);

// Frequency helper
Map<Integer, Integer> freq = new HashMap<>();
int key = 5;
freq.put(key, freq.getOrDefault(key, 0) + 1);

// Null-safe default
String s = Objects.requireNonNullElse(null, "fallback");

// Compare helpers
int c1 = Integer.compare(3, 5);
int c2 = Long.compare(10L, 2L);

// Common traps
// Math.pow returns double
// Collections.min/max need non-empty collections
// Integer.parseInt throws on bad input
