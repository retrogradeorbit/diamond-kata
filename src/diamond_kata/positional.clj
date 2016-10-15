(ns diamond-kata.positional)

(defn- char-i [i]
  (char (+ (int \A) i)))

(defn- char-for-row [n y]
  (char-i (if (<= y n) y (- (* 2 n) y))))

(defn- char-at [n x y]
  (if (or (= n (+ x y))
          (= n (- x y))
          (= n (- y x))
          (= (* 3 n) (+ x y)))
    (char-for-row n y)
    \space))

(defn diamond [n]
  (let [s (range (inc (* 2 n)))]
    (for [y s] (concat
                (for [x s] (char-at n x y))
                '(\newline)))))

(defn -main
  "Print out a diamond order n"
  [n]
  (println (flatten (diamond (read-string n)))))
