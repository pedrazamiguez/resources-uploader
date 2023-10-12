# Introduction

**Resources Uploader** is a desktop app implemented using Kotlin Compose Multiplatform for Linux (.deb), MacOS (.dmg)
and Windows (.msi) to upload resources to AWS S3 buckets and Firebase Storage.

# Versions

| Language or tool      | Version |
|-----------------------|---------|
| Kotlin                | 1.8.20  |
| Java                  | 17.0.9  |
| Compose Multiplatform | 1.4.1   |
| Gradle                | 7.5.1   |

# How to execute

The following gradle task can be executed to run the application.
```shell
./gradlew run
```

In order to package the app so that it can be installed in a system, the following gradle task can be executed:
```shell
./gradlew packageDistributionForCurrentOS
```
