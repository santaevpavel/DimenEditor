package ru.santaev.dimeneditor.utils

import com.intellij.openapi.diagnostic.Logger

interface ILoggable {

    val logger: Logger
        get() = Logger.getInstance(javaClass)
}