(ns todo.view.todo
  (:require [todo.view.layout :as layout]))

(defn todo-index-view [req todo-list]
  (->> `([:section.card
          [:h2 "TODO 一覧"]
          [:ul
           ~@(for [{:keys [title]} todo-list]
               [:li title])]])
      (layout/common req)))
