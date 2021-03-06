object Versions {
  const val compileSdkVersion = 30
  const val buildToolsVersion = "30.0.3"
  const val minSdkVersion = 23
  const val targetSdkVersion = 30

  const val activity = "androidx.activity:activity-compose:1.3.0"
  const val buildGradle = "com.android.tools.build:gradle:7.0.0"
  const val coil = "io.coil-kt:coil-compose:1.3.1"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02"
  const val core = "androidx.core:core-ktx:1.6.0"
  const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1"
  const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
  const val extJunit = "androidx.test.ext:junit:1.1.3"
  const val gson = "com.google.code.gson:gson:2.8.7"
  const val junit = "junit:junit:4.13.2"
  const val kotlinter = "org.jmailen.gradle:kotlinter-gradle:3.4.4"
  const val licenseToolsPlugin = "gradle.plugin.com.cookpad.android.plugin:plugin:1.2.6"
  const val material = "com.google.android.material:material:1.4.0"
  const val navigation = "androidx.navigation:navigation-compose:2.4.0-alpha05"
  const val releasesHub = "com.dipien:releases-hub-gradle-plugin:2.0.2"
  const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
  const val timber = "com.jakewharton.timber:timber:4.7.1"

  object Accompanist {
    const val insets = "com.google.accompanist:accompanist-insets:0.15.0"
    const val pager = "com.google.accompanist:accompanist-pager:0.15.0"
    const val permission = "com.google.accompanist:accompanist-permissions:0.15.0"
    const val placeholder = "com.google.accompanist:accompanist-placeholder:0.15.0"
    const val systemUiController = "com.google.accompanist:accompanist-systemuicontroller:0.15.0"
    const val swipeRefreshLayout = "com.google.accompanist:accompanist-swiperefresh:0.15.0"
  }

  object ArchCore {
    const val testing = "androidx.arch.core:core-testing:2.1.0"
  }

  object Compose {
    const val foundation = "androidx.compose.foundation:foundation:1.0.0"
    const val iconsCore = "androidx.compose.material:material-icons-core:1.0.0"
    const val iconsExtended = "androidx.compose.material:material-icons-extended:1.0.0"
    const val material = "androidx.compose.material:material:1.0.0"
    const val ui = "androidx.compose.ui:ui:1.0.0"
    const val uiTooling = "androidx.compose.ui:ui-tooling:1.0.0"
  }

  object Hilt {
    const val compiler = "com.google.dagger:hilt-android-compiler:2.38.1"
    const val compose = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
    const val gradle = "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
    const val hilt = "com.google.dagger:hilt-android:2.38.1"
  }

  object Kotlin {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.5.21"
  }

  object Lifecycle {
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
    const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1"
  }

  object Okhttp3 {
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.1"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:4.9.1"
  }

  object Test {
    const val core = "androidx.test:core:1.4.0"
    const val rules = "androidx.test:rules:1.4.0"
    const val runner = "androidx.test:runner:1.4.0"
  }
}
