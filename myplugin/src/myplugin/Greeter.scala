package myplugin

import mill.*
import mill.api.PathRef
import mill.scalalib.*

import plugincore.Core

trait Greeter extends ScalaModule:

  def speak = Task {
    println(Core.greeting)
  }
