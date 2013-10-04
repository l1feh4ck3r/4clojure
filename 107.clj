((
(fn [x] (fn [y] (reduce (fn [z v] (* z v)) (take x (repeat y)))))
2) 16)