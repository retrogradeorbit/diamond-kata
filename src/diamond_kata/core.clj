(ns diamond-kata.core
  (:gen-class))

(defn- char-for [num]
  (char (+ (int \A) num)))

(defn- n-spaces [n]
  (apply str (take n (repeat \space))))

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
    ;; special case of just "A"
    (line order 0)

    ;; full diamonds
    (apply
     str
     (interpose
      \newline
      (map
       (partial line order)
       (concat (range (inc order))
               (reverse (range order))))))))

(defn -main
  "Print out a diamond order n"
  [n]
  (println (diamond (read-string n))))
