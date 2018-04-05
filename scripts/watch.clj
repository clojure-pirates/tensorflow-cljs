(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tensorflow-cljs.core
   :output-to "out/tensorflow_cljs.js"
   :output-dir "out"})
