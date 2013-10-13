(
(fn [coll n] (remove #(zero? (mod (inc (.indexOf coll %)) n)) coll))
[1 2 3 4 5 6 7 8] 3)