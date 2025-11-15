package myplugin

import mill.*
import mill.api.PathRef
import mill.scalalib.*

import io.circe.*

trait Greeter extends ScalaModule:

  def speak = Task {
    println(Json.fromString("Hello, world!"))
  }

