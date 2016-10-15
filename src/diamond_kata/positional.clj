(ns diamond-kata.positional)

(defn- char-for-row [n y]
  (-> (if (<= y n) y (- (* 2 n) y))
      (+ (int \A))
      char))

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

(defn -main [n]
  (->> n read-string diamond flatten (apply str) print))
