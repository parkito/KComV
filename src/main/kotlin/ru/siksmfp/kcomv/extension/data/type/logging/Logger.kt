package ru.siksmfp.kcomv.extension.data.type.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline fun <reified T> T.Logger(): Logger {
    return LoggerFactory.getLogger(T::class.java)!!
}