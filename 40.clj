(
(fn [x coll] (butlast (interleave coll (repeat x))))
0 [1 2 3])