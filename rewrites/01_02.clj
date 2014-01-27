; Section 1.2.1
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

(defn factorial3 [n]
    (defn inner-fact [product counter max-count]
        (if (> counter max-count)
            product
            (recur  (* counter product)
                    (+ counter 1)
                    max-count)))
    (inner-fact 1 1 n))

; Section 1.2.2
; My intro to one way Clojure's implements a case statement
(defn five-alive [n]
    (cond (= n 5) "Five Alive"
          (> n 5) "Biger Than Five"
          :else "Less Than Five" ) )

(defn fib [n]
  (cond (= n 0) 0
        (= n 1) 1
        :else (+ (fib (- n 1)) (fib (- n 2)))))

