// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    jcenter()
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath(Versions.buildGradle)
    classpath(Versions.Hilt.gradle)
    classpath(Versions.Kotlin.kotlin)
    classpath(Versions.kotlinter)
    classpath(Versions.licenseToolsPlugin)
    classpath(Versions.Navigation.safeArgs)
    classpath(Versions.releasesHub)

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle.kts files
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

task<Delete>("clean") {
  delete(rootProject.buildDir)
}
