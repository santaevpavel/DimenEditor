package ru.santaev.dimeneditor

import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import ru.santaev.dimeneditor.utils.ILoggable

class EditDimenAction : PsiElementBaseIntentionAction(), ILoggable {

    override fun getText(): String {
        return "Edit dimension"
    }

    override fun getFamilyName(): String {
        return "Edit dimension"
    }

    override fun isAvailable(project: Project, editor: Editor?, psiElement: PsiElement): Boolean {
        return true
    }

    override fun invoke(project: Project, editor: Editor?, psiElement: PsiElement) {
        logger.debug("-> invoke($project, $psiElement)")
    }

    init {
        println("-> init()")
    }

}