package com.github.jenodk.indexingextendedconfig.services

import com.intellij.openapi.project.Project
import com.github.jenodk.indexingextendedconfig.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
