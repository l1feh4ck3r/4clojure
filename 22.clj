
(time ((fn [x]
    ((fn [x i]
        (if (empty? x)
          i
          (recur (rest x) (inc i))))
          x 0))
  '(1 2 3 3 1)))
