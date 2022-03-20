package pet.nekos.nekos
import pet.nekos.api.Server
import pet.nekos.api.event.message.MessageEvent

import kotlinx.coroutines.*

/**
 * The main runner for NEKOS, given functionality with plugins
 */
object NEKOS {
    @JvmStatic
    fun main(args: Array<String>): Unit = runBlocking {
        var server = Server()

        server.loadPlugins()

        delay(2000)

        server.pluginManager.fireEvent(MessageEvent("Testing firing a message..."))
    }


}