package ru.santaev.dimeneditor.action

import com.intellij.codeInsight.intention.HighPriorityAction
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import ru.santaev.dimeneditor.utils.AndroidResourceFilter
import ru.santaev.dimeneditor.utils.ILoggable

class AndroidResourceEditorAction : PsiElementBaseIntentionAction(), HighPriorityAction, ILoggable {

    private val androidResourceFilter = AndroidResourceFilter()

    init {
        println("init")
    }

    override fun invoke(project: Project, editor: Editor?, element: PsiElement) {
        element.containingFile
    }

    override fun getFamilyName(): String = text

    override fun isAvailable(project: Project, editor: Editor?, element: PsiElement): Boolean {
        val isAndroidFile = androidResourceFilter.filter(element.containingFile)
        if (!isAndroidFile) {
            return false
        }
        return true
    }

    override fun getText(): String = "Edit Android resource"

}
