package plugincore

import io.circe.Json

object Core:
  val greeting: Json = Json.fromString("Hello, world!")
