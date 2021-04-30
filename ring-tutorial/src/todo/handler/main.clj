(ns todo.handler.main
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.util.response :as res]
            [todo.util.response :as util-res]))

(defn home-view [req]
  "<h1>ホーム画面</h1>
   <a href=\"/todo\">TODO 一覧</a>")

(defn home [req]
  (-> (home-view req)
      res/response
      util-res/html))

(defroutes main-routes
  (GET "/" _ home)
  (route/not-found "<h1>Not found</h1>"))
