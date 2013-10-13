(
(fn [coll t] (mapcat #(take t (repeat %)) coll))
[[1 2] [3 4]] 2)