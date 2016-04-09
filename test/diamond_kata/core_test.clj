(ns diamond-kata.core-test
  (:require [clojure.test :refer :all]
            [diamond-kata.core :as core]))

(deftest diamond
  (is (=

(core/diamond 0)
"A"))

  (is (=

(core/diamond 1)
" A
B B
 A"))

  (is (=

(core/diamond 2)
"  A
 B B
C   C
 B B
  A")))
