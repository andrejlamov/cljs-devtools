(ns devtools.version)

(def current-version "0.9.5-SNAPSHOT")                                                                                        ; this should match our project.clj

(defmacro get-current-version []
  current-version)
