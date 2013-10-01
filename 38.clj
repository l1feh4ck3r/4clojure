((fn [& nums]
    (reduce (fn [x y]
                (if (> x y) x y))
            nums))
1 8 3 4)