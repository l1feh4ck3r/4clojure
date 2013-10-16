(
(fn [& more] (and (not-every? true? more) (not (every? false? more))))
true)