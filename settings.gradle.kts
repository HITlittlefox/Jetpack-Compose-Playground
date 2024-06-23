dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri(" https://maven.aliyun.com/repository/google") }
        maven { url = uri(" https://maven.aliyun.com/repository/gradle-plugin") }
        mavenLocal()
        mavenCentral()
        google()
        // jcenter()
        maven { url = uri("https://jitpack.io") }
        mavenCentral() { url = uri("https://jcenter.bintray.com/") }

    }
}
include(":app")

