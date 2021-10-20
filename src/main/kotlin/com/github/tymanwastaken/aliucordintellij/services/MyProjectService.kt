package com.github.tymanwastaken.aliucordintellij.services

import com.intellij.openapi.project.Project
import com.github.tymanwastaken.aliucordintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
