plugins {
    id("dev.fritz2.fritz2-gradle") version "0.5"
}

repositories {
    jcenter()
}

kotlin {
    kotlin {
        jvm()
        js().browser()

        sourceSets {
            val commonMain by getting {
                dependencies {
                    implementation(kotlin("stdlib"))
                }
            }
            val jvmMain by getting {
                dependencies {
                }
            }
            val jsMain by getting {
                dependencies {
                    implementation(npm("bootstrap", "^4.5.0"))
                    implementation(npm("autoprefixer", "^9.8.4"))
                    implementation(npm("postcss-cli", "^7.1.1"))
                    implementation(npm("postcss-loader", "^3.0.0"))
                    implementation(npm("sass-loader", "^8.0.2"))
                    implementation(npm("file-loader", "^6.0.0"))
                    implementation(npm("extract-loader", "^5.1.0"))
                    implementation(npm("css-loader", "^3.6.0"))
                    implementation(npm("node-sass", "^4.14.1"))
                }
            }
        }
    }
}