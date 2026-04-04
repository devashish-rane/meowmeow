# 50 Java DSA Bugs Caused By Weak Language Grasp

1. Using `==` instead of `.equals()` for `String`.
2. Writing `arr.length()` instead of `arr.length`.
3. Writing `s.length` instead of `s.length()`.
4. Passing `{1,2,3}` directly into a method instead of `new int[]{1,2,3}`.
5. Forgetting `main` must be `public static void main(String[] args)`.
6. Calling instance method from static context by mistake.
7. Forgetting to initialize `List<List<Integer>>` inner lists.
8. Using `Arrays.asList(intArray)` expecting `List<Integer>`.
9. Assuming `Arrays.asList(...)` is mutable size-wise.
10. Assuming `List.of(...)` is mutable.
11. Using `remove(x)` on `List<Integer>` and deleting by index instead of value.
12. Forgetting `Map.get(key)` may return `null`.
13. Using `map.get(key) + 1` without `getOrDefault`.
14. Using `containsValue` when `containsKey` is needed.
15. Iterating a `HashMap` expecting sorted keys.
16. Iterating a `HashSet` expecting insertion order.
17. Using `PriorityQueue` iteration expecting sorted output.
18. Writing comparator as `a - b` and risking overflow.
19. Forgetting primitive arrays cannot use custom comparator in `Arrays.sort`.
20. Forgetting `Arrays.sort(arr, l, r)` uses exclusive `r`.
21. Forgetting `substring(l, r)` uses exclusive `r`.
22. Forgetting `copyOfRange(l, r)` uses exclusive `r`.
23. Using `subList` like an independent copy.
24. Modifying original list and breaking a `subList` view.
25. Forgetting to copy list in backtracking answer storage.
26. Mutating collection while for-each iterating.
27. Using `Stack` instead of `ArrayDeque` out of habit.
28. Using `add/remove` on queue when `offer/poll/peek` is clearer.
29. Forgetting `ArrayDeque` cannot store `null`.
30. Using `poll()` result without null-check when queue may be empty.
31. Parsing char digit without `c - '0'`.
32. Building char from int without `(char) ('0' + x)`.
33. Using `Math.pow` and assuming result is `int`.
34. Using `Collections.min/max` on empty list.
35. Forgetting `toList()` result may be unmodifiable.
36. Mixing `int` and `long` and silently overflowing.
37. Computing `mid = (l + r) / 2` and risking overflow.
38. Reusing loop variable names and shadowing values accidentally.
39. Forgetting `String` is immutable after `replace`, `trim`, `toLowerCase`.
40. Building long strings with `+` inside loops instead of `StringBuilder`.
41. Using wrong bound in loops: `i <= arr.length`.
42. Confusing row count and col count in 2D arrays.
43. Forgetting jagged array second dimension initialization.
44. Assuming `deepEquals` works for all primitive arrays directly.
45. Returning internal mutable collection directly from object.
46. Forgetting `record` fields are accessed by methods like `p.x()`, not `p.x`.
47. Using raw types like `new ArrayList()` and losing type safety.
48. Assuming `TreeSet`/`TreeMap` operations are O(1)`; they are O(log n)`.
49. Comparing boxed integers with `==` and getting cached-value surprises.
50. Writing syntax from another language under pressure instead of Java's exact form.

## Remaining Major Gaps After These Files

If you want a nearly complete interview language reference, the next useful files are:

- `arrays.java`
- `graphs.java`
- `trees.java`
- `bit_ops.java`
- `input_output.java`
- `dp_templates.java`

Those are not "collections", but they are high-frequency interview syntax zones.
