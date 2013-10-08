(map #((
(fn [n] 
    (fn [x]
        (reduce * (take n (repeat x)))
    )
)
%) 2) [0 1 2 3 4])