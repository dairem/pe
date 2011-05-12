(ns pe.p2)
(use ['clojure.contrib.def :only ['defn-memo]])
(defn-memo fib [x] (if (< x 2) x (+ (fib (dec x)) (fib (dec (dec x))))))
(defn acf [a i] 
    (if (> (fib i ) 4000000) 
       a 
       (do 
          ;;(println a i (fib i)) 
          (recur (+ a (if (even?(fib i) ) (fib i) 0)) (inc i))))) 
(acf 0 1)
