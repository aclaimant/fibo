(ns fibo.core
  (:gen-class))

(defn fibonacci-recursion [n]
  (cond
    (zero? n)
    0

    (or (= n 1) (= n 2))
    1

    :else
    (+ (fibonacci-recursion (- n 2)) (fibonacci-recursion (- n 1)))))

(defn -main []
  (loop []
    (let [fib (fibonacci-recursion 23)]
      (println fib)
      (Thread/sleep 1000)
      (recur))))
