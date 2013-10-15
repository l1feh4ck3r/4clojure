(
(fn [x y] (->> (str (* x y))
	       (map #(- (int %) 48))
	       (vec)))
999 99)