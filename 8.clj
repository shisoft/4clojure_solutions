;;;Sets are collections of unique values.

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;;;Failed Attempts: (set :a :b :c :d) {:a :b :c :d}


