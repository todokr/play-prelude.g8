package services

import models.$model$

/** Provides a service as described.
 *
 *  Here are more details about what it does and why it does.
 */
trait $serviceName$ {

  def list$model$: Seq[$model$] = $model$.findAll()

  def find$model$($model;format="camel"$Id: Id[$model$]): Option[$model$] = $model$.find($model;format="camel"$Id.value)

  def create$model$(): $model$ = ???

  def update$model$($model;format="camel"$: $model$): $model$ = $model$.save($model;format="camel"$)

  def delelte$model$($model;format="camel"$: $model$): Id[$model$] = {
    val id = $model$.destroy($model;format="camel"$)
    Id(id)
  }

}
