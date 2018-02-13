package ru.santaev.dimeneditor

import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement

class EditDimenAction : PsiElementBaseIntentionAction() {

    override fun getText(): String {
        return "Edit dimension"
    }

    override fun getFamilyName(): String {
        return "Edit dimension"
    }

    override fun isAvailable(project: Project, editor: Editor?, psiElement: PsiElement): Boolean {
        println("-> isAvailable()")
        return true
    }

    override fun invoke(project: Project, editor: Editor?, psiElement: PsiElement) {
        println("-> invoke($project, $psiElement)")
    }

    init {
        println("-> init()")
    }

    companion object {

        val LOGGER = logger("DimenEditor log TAG")
    }
}