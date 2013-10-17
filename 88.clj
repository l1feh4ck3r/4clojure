(
(fn [x y] (set (concat (filter #(not (contains? y %)) x) (filter #(not (contains? x %)) y))))
#{1 2 3 4 5 6} #{1 3 5 7})