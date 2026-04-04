import java.util.*;

// Queue with ArrayDeque
Queue<Integer> q = new ArrayDeque<>();
q.offer(10);
q.offer(20);
int front = q.peek();
int removed = q.poll();
boolean empty = q.isEmpty();
int sz = q.size();

// BFS pattern
Queue<Integer> bfs = new ArrayDeque<>();
bfs.offer(0);
while (!bfs.isEmpty()) {
    int node = bfs.poll();
}

// Deque as queue
Deque<Integer> dq = new ArrayDeque<>();
dq.offerLast(1);
dq.offerLast(2);
int f = dq.peekFirst();
int gone = dq.pollFirst();

// Deque as stack
Deque<Integer> st = new ArrayDeque<>();
st.push(10);
st.push(20);
int top = st.peek();
int pop = st.pop();

// Explicit stack ops with deque names
st.offerFirst(5);
int top2 = st.peekFirst();
int pop2 = st.pollFirst();

// Monotonic stack pattern
Deque<Integer> mono = new ArrayDeque<>();
int[] a = {3, 1, 2, 4};
for (int i = 0; i < a.length; i++) {
    while (!mono.isEmpty() && a[mono.peek()] < a[i]) {
        mono.pop();
    }
    mono.push(i);
}

// Level-order BFS
int levelSize = q.size();
for (int i = 0; i < levelSize; i++) {
    int cur = q.poll();
}

// Common traps
// Queue methods: offer / poll / peek
// Stack via Deque: push / pop / peek
// Prefer ArrayDeque over Stack in interviews
// ArrayDeque does not allow null
