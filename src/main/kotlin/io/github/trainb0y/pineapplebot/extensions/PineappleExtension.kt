package io.github.trainb0y.pineapplebot.extensions

import com.kotlindiscord.kord.extensions.commands.application.slash.publicSubCommand
import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import dev.kord.common.entity.Permission

class PineappleExtension : Extension() {
	override val name = "pineapple"

	override suspend fun setup() {
		publicSlashCommand {
			name = "pineapple"
			description = "pineapple related commands"
			requirePermission(Permission.ManageEmojisAndStickers)

			publicSubCommand {
				name = "clear"
				description = "Clear all generated pineapple emoji"
				action {

				}
			}

			publicSubCommand {
				name = "list"
				description = "List all generated pineapple emoji"
				action {
				}
			}

			publicSubCommand {
				name = "generate"
				description = "List all generated pineapple emoji"
				action {
				}
			}
		}
	}
}
