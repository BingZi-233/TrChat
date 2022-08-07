val taboolibVersion: String by project

plugins {
    id("io.izzel.taboolib") version "1.40"
}

taboolib {
    install("common", "common-5")
    install("module-kether")
    options("skip-minimize", "keep-kotlin-module", "skip-plugin-file", "skip-taboolib-relocate")
    classifier = null
    version = taboolibVersion
}

dependencies {
    api(project(":project:common"))
}