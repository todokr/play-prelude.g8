package services

import models.$model$

/** Provides a service as described.
 *
 *  Here are more details about what it does and why it does.
 */
trait $serviceName$ {

  def list$model$: Seq[$model$] = ???

  def find$model$($model;format="camel"$Id: Id[$model$]): Option[$model$] = ???

  def update$model$($model;format="camel"$: $model$): $model$ = ???

  def delelte$model$: Id[$model$] = ???

}
