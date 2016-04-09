(ns diamond-kata.core
  (:require [clojure.test :refer :all])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn- char-for [num]
  (char (+ (int \A) num)))

(defn- n-spaces [len]
  (apply str (take len (repeat \space))))

(defn- line [order num]
  (if (zero? num)
    ;; first/last line
    (str
       (n-spaces (- order num))
       (char-for 0)
       )

    ;; other line
    (str
       (n-spaces (- order num))
       (char-for num)
       (n-spaces (dec (* 2 num)))
       (char-for num)
       )
    )
)

(defn diamond [order]
  (if (zero? order)
    (str (line order 0))

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
