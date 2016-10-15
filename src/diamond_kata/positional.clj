(ns diamond-kata.positional)

(defn- char-i [i]
  (char (+ (int \A) i)))

(defn- char-for-row [n y]
  (char-i (if (<= y n) y (- (* 2 n) y))))

(defn- char-at [n y x]
  (if (or (= n (+ x y))
          (= n (- x y))
          (= n (- y x))
          (= (* 3 n) (+ x y)))
    (char-for-row n y)
    \space))

(defn diamond [n]
  (let [size (inc (* 2 n))]
    (apply str
       (map
        #(str (apply str (map (partial char-at n %) (range size))) \newline)
        (range size)))))

(defn -main
  "Print out a diamond order n"
  [n]
  (println (diamond (read-string n))))
