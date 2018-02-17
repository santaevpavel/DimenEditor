package ru.santaev.dimeneditor.utils

import com.intellij.openapi.fileTypes.StdFileTypes
import com.intellij.psi.PsiFile

class AndroidResourceFilter {

    fun filter(file: PsiFile): Boolean{
        return file.fileType == StdFileTypes.XML // TODO use AndroidFacet
    }
}