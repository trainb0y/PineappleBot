pluginManagement {
    plugins {
        // Update this in libs.version.toml when you change it here
        kotlin("jvm") version "1.7.20"
        kotlin("plugin.serialization") version "1.7.20"

        id("com.github.johnrengelman.shadow") version "7.1.0"
    }
}

rootProject.name = "PineappleBot"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}
