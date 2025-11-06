package myplugin

import mill.*
import mill.api.PathRef
import mill.scalalib.*

trait Greeter extends ScalaModule:

  def speak = Task {
    println("Hello, world!")
  }

