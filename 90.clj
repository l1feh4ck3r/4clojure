(
#(set (mapcat (fn [x] (map (fn [y] (vector x y)) %2)) %1))
#{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})