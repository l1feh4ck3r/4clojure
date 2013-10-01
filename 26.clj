(#(take %1 (map second (iterate (fn [[x y]] [y (+ x y)]) [0 1])))
 6)