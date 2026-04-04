import java.util.*;
import java.util.stream.*;

int[] a = {1, 2, 3, 4};
List<Integer> list = Arrays.asList(1, 2, 3, 4);

// Primitive array streams
int sum = Arrays.stream(a).sum();
int max = Arrays.stream(a).max().orElse(-1);
long count = Arrays.stream(a).filter(x -> x % 2 == 0).count();
int[] doubled = Arrays.stream(a).map(x -> x * 2).toArray();

// Box / unbox
List<Integer> boxed = Arrays.stream(a).boxed().toList();
int[] back = list.stream().mapToInt(Integer::intValue).toArray();

// List streams
List<Integer> evens = list.stream().filter(x -> x % 2 == 0).toList();
List<Integer> sorted = list.stream().sorted().toList();
List<Integer> desc = list.stream().sorted(Comparator.reverseOrder()).toList();

// Distinct / limit / skip
List<Integer> clean = list.stream().distinct().toList();
List<Integer> firstTwo = list.stream().limit(2).toList();
List<Integer> skipTwo = list.stream().skip(2).toList();

// String stream helpers
List<String> words = Arrays.asList("a", "bb", "ccc");
List<Integer> lens = words.stream().map(String::length).toList();
String joined = words.stream().collect(Collectors.joining(","));

// Grouping / counting
Map<String, Long> freq = words.stream()
    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

Map<Integer, List<String>> byLen = words.stream()
    .collect(Collectors.groupingBy(String::length));

// Common traps
// Streams are concise but often slower to type in interviews
// Prefer loops when speed and debugging matter
// toList() returns an unmodifiable list in modern Java
