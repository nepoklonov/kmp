rootProject.name = "kmp"

pluginManagement {
    resolutionStrategy {
        repositories {
            gradlePluginPortal()
            mavenCentral()
        }
    }
}

include("shared")
include("client")
include("server")