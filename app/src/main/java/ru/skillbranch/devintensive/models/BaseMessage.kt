package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()
) {
    abstract fun formatMessage(): String

    companion object AbstractFactory {
        var lastId = -1;
        fun makeMassage(from: User?, chat: Chat, date: Date = Date(), type: TypeOfMessage = TypeOfMessage.TEXT, payload: Any?, isIncoming: Boolean = false): BaseMessage {
            lastId++;
            return when (type) {
                TypeOfMessage.IMAGE -> ImageMessage("$lastId", from, chat, date = date, image = payload as String)
                else -> TextMessage("$lastId", from, chat, date = date, text = payload as String)
            }
        }
    }
}

enum class TypeOfMessage {
    TEXT,
    IMAGE
}