pluginManagement {
    repositories {
        maven {
            //通过不安全的HTTP连接与仓库通信
            isAllowInsecureProtocol=true
            setUrl("https://maven.aliyun.com/repository/public")
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
            setUrl("https://maven.aliyun.com/repository/google")
            setUrl("https://jitpack.io")
            setUrl("http://frp.ctlife.tv:8452/repository/maven-public")

        }
        jcenter()
        google()
        mavenCentral()
        gradlePluginPortal()
    }

}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            //通过不安全的HTTP连接与仓库通信
            isAllowInsecureProtocol=true
            setUrl("https://maven.aliyun.com/repository/public")
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
            setUrl("https://maven.aliyun.com/repository/google")
            setUrl("https://jitpack.io")
            setUrl("http://frp.ctlife.tv:8452/repository/maven-public/")
        }
        jcenter()
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "HotelTest"
include(":app")
 