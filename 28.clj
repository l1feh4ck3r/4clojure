(
(fn [coll]
    (loop [c (first coll)
           r (rest coll)
           acc '()]
      (if (and (nil? c) (empty? r))
        acc
        (if (sequential? c)
          (recur (first c) (concat (rest c) r) acc)
          (recur (first r) (rest r) (concat acc (list c)))
        )
      )
    ))
'((1 2) 3 [4 [5 6]]))