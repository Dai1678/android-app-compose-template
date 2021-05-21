object Versions {
  const val compileSdkVersion = 30
  const val buildToolsVersion = "30.0.3"
  const val minSdkVersion = 23
  const val targetSdkVersion = 30

  const val activity = "androidx.activity:activity-ktx:1.2.3"
  const val appCompat = "androidx.appcompat:appcompat:1.3.0"
  const val buildGradle = "com.android.tools.build:gradle:4.2.1"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
  const val core = "androidx.core:core-ktx:1.5.0"
  const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
  const val extJunit = "androidx.test.ext:junit:1.1.2"
  const val fragment = "androidx.fragment:fragment-ktx:1.3.4"
  const val gson = "com.google.code.gson:gson:2.8.6"
  const val junit = "junit:junit:4.13.2"
  const val kotlinter = "org.jmailen.gradle:kotlinter-gradle:3.4.4"
  const val licenseToolsPlugin = "gradle.plugin.com.cookpad.android.plugin:plugin:1.2.6"
  const val material = "com.google.android.material:material:1.3.0"
  const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0"
  const val releasesHub = "com.dipien:releases-hub-gradle-plugin:2.0.2"
  const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
  const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
  const val timber = "com.jakewharton.timber:timber:4.7.1"

  object ArchCore {
    const val testing = "androidx.arch.core:core-testing:2.1.0"
  }

  object Hilt {
    const val compiler = "com.google.dagger:hilt-android-compiler:2.35.1"
    const val gradle = "com.google.dagger:hilt-android-gradle-plugin:2.35.1"
    const val hilt = "com.google.dagger:hilt-android:2.35.1"
  }

  object Kotlin {
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.0"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.5.0"
  }

  object Lifecycle {
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.3.1"
  }

  object Navigation {
    const val fragment = "androidx.navigation:navigation-fragment-ktx:2.3.5"
    const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5"
    const val ui = "androidx.navigation:navigation-ui-ktx:2.3.5"
  }

  object Okhttp3 {
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.1"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:4.9.1"
  }

  object Test {
    const val core = "androidx.test:core:1.3.0"
    const val rules = "androidx.test:rules:1.3.0"
    const val runner = "androidx.test:runner:1.3.0"
  }
}
