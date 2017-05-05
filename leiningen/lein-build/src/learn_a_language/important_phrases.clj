(ns learn-a-language.important-phrases
  (:gen-class))
(require 'clojure.tools.trace)

;; It's time for some German love! 
(def german
  [["I love you." "Ich liebe dich."]
   ["You make me so happy!" "Du machst mich so glücklich!"]
   ["I miss you." "Ich vermisse dich./Du fehlst mir."]
   ["Pass me the mustard." "Gib mir den Senf."]   
   ["Kiss me!" "Küss mich!"]])

(defn ^:dynamic -main
  [& which]
  (println which)
  (doseq [x which]
    (println x)
    (let [phrases (get german (Integer. x))]
      (println "English: " (first phrases))
      (println "German: " (second phrases)))))

