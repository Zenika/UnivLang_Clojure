(ns univ.core-test
  (:require [clojure.test :refer :all]
            [univ.core :refer :all]))

(deftest a-test
  (testing "Arithmetic"
    (testing "with positive integers"
      (is (= 2 (+ 1 1)))
      (is (= 3 (+ 1 2))))))

