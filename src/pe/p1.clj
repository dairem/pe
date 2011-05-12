(ns pe.p1)
    (defn m35 [x] (or (= (mod x 5) 0) (= (mod x 3) 0))) 
    (defn p1 [] (reduce + (for [x (range 1000) :when (m35 x) ] x)) )
