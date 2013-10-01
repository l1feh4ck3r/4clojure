(#(loop [accum []
         xs %1]
         (if (empty? xs)
           accum
           (recur (conj accum (first xs) (first xs))
                  (rest xs))))
;   [1 2 3 4 5])
    [[1 2][3 4][5 6]])