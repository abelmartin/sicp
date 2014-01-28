; Section 1.2.1
; ------------ Sweet Factorial Hotness ------------
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

; ------------ Fibonacci ------------
(defn fib [n]
    (cond (= n 0) 0
        (= n 1) 1
        :else (+ (fib (- n 1)) (fib (- n 2)))))

; ------------ Counting Change ------------
(defn cc [amount kinds-of-coins]
  (cond (= amount 0) 1
       (or (< amount 0) (= kinds-of-coins 0)) 0
       :else (+ (cc amount (- kinds-of-coins 1))
           (cc (- amount (first-denomination kinds-of-coins)) kinds-of-coins ) )
))

(defn first-denomination [kinds-of-coins]
  (cond (= kinds-of-coins 1) 1
        (= kinds-of-coins 2) 5
        (= kinds-of-coins 3) 10
        (= kinds-of-coins 4) 25
        (= kinds-of-coins 5) 50 ) )

(defn count-change [amount] (cc amount 5))