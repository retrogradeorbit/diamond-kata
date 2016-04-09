(ns diamond-kata.core-test
  (:require [clojure.test :refer :all]
            [diamond-kata.core :as core]))

(deftest diamond
  (is (=
       (core/diamond 1)
       "A\n")))
