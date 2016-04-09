(ns diamond-kata.core
  (:require [clojure.test :refer :all])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn- line [order num]
  (case num
    0 (str
       (apply str (take (- order num) (repeat \space)))
       (char (int \A))
       )

    ;; other line
    (str
       (apply str (take (- order num) (repeat \space)))
       (char (+ (int \A) num))
       (apply str (take (dec (* 2 num)) (repeat \space)))
       (char (+ (int \A) num))
       )
    )
)

(defn diamond [order]
  (case order
    0 (str (line order 0))

    ;; full diamonds
    (apply str (concat (interpose
                        "\n"
                        (map
                         (partial line order)
                         (range (inc order))))
                       ["\n"]
                       (interpose
                        "\n"
                        (map
                         (partial line order)
                         (reverse (range order)))))
           )
    ))
