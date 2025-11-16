# Defining and using a publish-able Mill plugin in the same build

## Overview

This repo is a minimised example of the setup being used in the Indigo mono-repo build.

The requirement was:

1. Build a Mill plugin. (`myplugin`)
2. Have it depend on another module (`plugincore`), which has library dependencies. (Circe, in this example)
3. Ensure the plugin and the module it depends on can be published.
4. Have another module _within_ this build depend on the plugin _without_ having to locally publish. (`demo`)

The trick to all this is that the Mill meta build exposes all the sources to the main build so that the plugin can be used. It's all documented in the [Mill docs](https://mill-build.org/mill/extending/meta-build.html), but it took me a while to work out the exact incantation.

This setup is using Mill's '[Multi-file build](https://mill-build.org/mill/large/multi-file-builds.html)' arrangement, meaning that each module has it's own `package.mill` file. This isn't necessary, but it follows the pattern I'm using in Indigo's build.

## Let's see it in action

You can run the demo as normal:

`./mill demo.run`

But you can also invoke the command provided by the plugin:

`./mill demo.speak`

Only the plugin will be published:

`./mill __.publishLocal`