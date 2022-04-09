package pet.nekos.nekos

import pet.nekos.api.server.Server
import pet.nekos.api.event.message.MessageEvent

import pet.nekos.api.user.User
import pet.nekos.api.message.Message
import pet.nekos.api.channel.Channel

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

    }
}