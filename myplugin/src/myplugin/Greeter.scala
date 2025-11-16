package myplugin

import mill.*
import mill.api.PathRef
import mill.scalalib.*

import plugincore.Core

trait Greeter extends ScalaModule:

  /** Using `Task.Command {..}` means that running `./mill demo.speak` will
    * produce it's output every time. If this was changed to `Task {..}` then
    * the results would be cached, and the output would only show on the first
    * invocation.
    */
  def speak() = Task.Command {
    println(Core.greeting)
  }
