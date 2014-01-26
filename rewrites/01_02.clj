(defn factorial [n]
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

(defn factorial2 [n]
  (fact-iter 1 1 n))

(defn fact-iter [product counter max-count]
  (if (> counter max-count)
    product
    (recur  (* counter product)
            (+ counter 1)
            max-count)))

(defn fib [n])