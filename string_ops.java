import java.util.*;

String s = "hello";

// Length / access
int n = s.length();
char c = s.charAt(0);

// Substring
String a = s.substring(1);
String b = s.substring(1, 4); // [1,4)

// Search
boolean has = s.contains("ell");
boolean starts = s.startsWith("he");
boolean ends = s.endsWith("lo");
int idx = s.indexOf('l');
int idx2 = s.indexOf("ll");
int last = s.lastIndexOf('l');

// Compare
boolean eq = s.equals("hello");
boolean eqIgnore = s.equalsIgnoreCase("HELLO");
int cmp = s.compareTo("world");

// Replace
String r1 = s.replace('l', 'x');
String r2 = s.replace("ll", "yy");

// Split / join
String[] parts = "a,b,c".split(",");
String joined = String.join("-", "a", "b", "c");

// Trim / case
String t = "  hi  ".trim();
String low = s.toLowerCase();
String up = s.toUpperCase();

// To char array
char[] arr = s.toCharArray();

// From char/int
char digit = '7';
int val = digit - '0';
char back = (char) ('0' + 7);

// StringBuilder
StringBuilder sb = new StringBuilder();
sb.append("ab");
sb.append('c');
sb.append(123);
sb.insert(1, "X");
sb.deleteCharAt(sb.length() - 1);
sb.reverse();
String out = sb.toString();

// Repeated char/string
String stars = "*".repeat(5);

// Common traps
// String is immutable
// substring end index is exclusive
// Use equals, not ==
// StringBuilder is usually better for repeated concatenation in loops
