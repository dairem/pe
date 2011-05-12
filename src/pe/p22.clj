(ns pe.p22
   (:require clojure.contrib.string))


    (defn namescore [x] (reduce + (map #(- %1 64) (seq (. )))))

    (def rawstr (slurp "names.txt"))
    (def nstr (replace-str  "\"" "" rawstr))
    (def lnames (split #"," nstr))
    (def snames (sort lnames))
    (def lscores (map namescore snames)) 
    (def lfull (map-indexed #(* (inc %1) %2) lscores))  
    (reduce + lfull) 


