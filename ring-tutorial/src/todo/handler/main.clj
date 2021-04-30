(ns todo.handler.main
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [ring.util.response :as res]
            [todo.util.response :as util-res]
            [todo.view.main :as view]))

(defn home [req]
  (-> (view/home-view req)
      res/response
      util-res/html))

(defroutes main-routes
  (GET "/" _ home)
  (route/not-found "<h1>Not found</h1>"))
