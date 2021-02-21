;;Reviewing https://clojure.org/guides/learn/syntax

;; Numeric Types

42 ; integer
-1.5 ; floating point
22/7 ; ratio

;; Character Types

"hello" ; string
\e ; character
#"[0-9]+" ; regular expression

;; Symbols and idents

map ; symbol
+ ; symbol - most punctuation allowed
clojure.core/+ ; namespaced symbol
nil ; null value
true false ; booleans
:alpha ; keyword
:release/alpha ; keyword with namespace

;; Literal collections

'(1 2 3) ; list
[1 2 3] ; vector
#{1 2 3} ; set
{:a 1, :b 2} ; map

;; Expressions

(+ 3 4) ; This expression reads as 3 + 4 which would equal 7

; "Many languages have both statements and expressions, where statements have some stateful effect but do not return a value. In Clojure, everything is an expression that evaluates to a value. Some expressions (but not most) also have side effects."

user=> 'x
user=> '(1 2 3)
(1 2 3)
;Quote can be used to avoid evaluation of symbols or lists

;; Exploring at the REPL

*1 ; the last result
*2 ; the result two expressions ago
*3 ; the result three expressions ago

user=> (+ 3 4)
7
user=> (+ 10 *1)
17
user=> (+ *1 *2)
24

(require '[clojure.repl :refer :all]) ; clojure.repl is a namespace included in the standard Clojure library that provides a number of helpful functions

;; Clojure basics

user=> (def x 7)
#'user/x
;def is a special form that associates a symbol (x) in the current namespace with a value (7). This linkage is called a var. In most actual Clojure code, vars should refer to either a constant value or a function, but it’s common to define and re-define them for convenience when working at the REPL.