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
    nil
    )
)

(comment

  (= "A" (line 0 0))
  (= " A" (line 1 0))

)

(defn diamond [order]
  (str (line order 0)))

(deftest diamond-test
  (is (=
       (diamond 0)
       "A"))
  (is (=

(diamond 2)
" A
B B
 A"

  )

)
)
