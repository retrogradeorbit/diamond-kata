(ns diamond-kata.recursive-test
  (:require [clojure.test :refer :all]
            [diamond-kata.recursive :as recursive]))

(deftest diamond
  (is (=

(recursive/diamond 0)
"A"))

  (is (=

(recursive/diamond 1)
" A
B B
 A"))

  (is (=

(recursive/diamond 2)
"  A
 B B
C   C
 B B
  A")))
