package pet.nekos.nekos

import pet.nekos.api.server.Server
import pet.nekos.api.event.message.MessageEvent

import pet.nekos.api.user.User
import pet.nekos.api.message.Message

import kotlinx.coroutines.*

/**
 * The main runner for NEKOS, given functionality with plugins
 */
object NEKOS {
    @JvmStatic
    fun main(args: Array<String>): Unit = runBlocking {
        var server = Server()

        server.loadPlugins()
        server.loadServices()

        delay(2000)
        println("Testing firing a message...")
        var user = User("TestSender", "Sender", "TEMPORARY")
        var message = Message("Testing Message", user)
        server.serverManager.fireEvent(MessageEvent(message))

        message = Message("Testing Message 2", user)
        delay(2000)
        println("Testing firing a message... 2 ")
        server.serverManager.fireEvent(MessageEvent(message))
    }
}