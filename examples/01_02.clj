; Exercise 1.2.13
  ; Thinking about this explanation makes my hair hurt.  Possibly from my brain catching fire.
  ; Here's an answer for you: http://www.kendyck.com/math/sicp/ex1-13.xml
; Exercise 1.2.14
  ; Fun?
; Exercise 1.2.17
  ; Neat!
  (defn double-me [base] (+ base base))
  (defn halve-me [base] (/ base 2))
  (defn multi-us [factor1, factor2]
      (cond (= factor2 0) 0
            (= (mod factor2 2) 0) (double-me (multi-us factor1 (halve-me factor2)))
            :else (+ factor1 (multi-us factor1 (- factor2 1)))
      )
  )
; Exercise 1.2.24
  ; ???