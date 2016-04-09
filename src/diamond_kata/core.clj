(ns diamond-kata.core
  (:require [clojure.test :refer :all])
  (:gen-class))

(defn- char-for [num]
  (char (+ (int \A) num)))

(defn- n-spaces [len]
  (apply str (take len (repeat \space))))

(defn- prefix-spaces [order num]
  (n-spaces (- order num)))

(defn- line [order num]
  (if (zero? num)
    ;; first/last line
    (str
       (prefix-spaces order num)
       (char-for 0))

    ;; other line
    (str
       (prefix-spaces order num)
       (char-for num)
       (n-spaces (dec (* 2 num)))
       (char-for num))))

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
                         (reverse (range order))))))))

(defn -main
  "Print out a diamond order n"
  [n]
  (println (diamond (read-string n))))
