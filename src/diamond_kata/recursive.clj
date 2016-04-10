(ns diamond-kata.recursive)

(defn- char-for [num]
  (char (+ (int \A) num)))

(defn- n-spaces [n]
  (apply str (take n (repeat \space))))

(defn diamond-top [order]
  (if (zero? order)
    (vector (char-for 0))
    (concat
     (map (partial str \space)
      (diamond-top (dec order)))
     [(str
       (char-for order)
       (n-spaces (dec (* 2 order)))
       (char-for order))])))

(defn diamond [order]
  (apply str
   (interpose \newline
    (let [top (diamond-top order)]
      (concat top (reverse (butlast top)))))))

(defn -main
  "Print out a diamond order n"
  [n]
  (println (diamond (read-string n))))
