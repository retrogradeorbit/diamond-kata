(ns diamond-kata.core
  (:require [clojure.test :refer :all])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn diamond [order]
  (str (char (int \A))"\n"))

(deftest diamond-test
  (is (=
       (diamond 1)
       "A\n"))
)
