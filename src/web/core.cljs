(ns web.core
  (:require
    [reagent.dom :as rd]
    [reagent.core :as reagent]))

(defonce app-state
  (reagent/atom {}))

(defn page [_ratom]
  [:div
   "welcome to reagent-figwheel."])

(defn reload []
  (rd/render [page app-state]
             (.getElementById js/document "app")))

(reload)
