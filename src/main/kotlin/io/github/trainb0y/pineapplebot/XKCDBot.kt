package io.github.trainb0y.pineapplebot

import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kord.extensions.utils.env
import dev.kord.common.entity.PresenceStatus
import dev.kord.common.entity.Snowflake
import io.github.trainb0y.pineapplebot.extensions.PineappleExtension
import mu.KotlinLogging

const val version = "1.0"

val logger = KotlinLogging.logger {}
suspend fun main() {
	logger.info { "Starting Pineapple Bot v$version" }
	val bot = ExtensibleBot(env("TOKEN")) {
		applicationCommands {
			enabled = true
			try { defaultGuild = Snowflake(env("TEST_SERVER").toLong()) }
			catch (_: RuntimeException) {} // no default guild
		}
		presence {
			status = PresenceStatus.Online
			watching(env("STATUS"))
		}
		extensions {
			add(::PineappleExtension)
		}
	}
	bot.start()
}
