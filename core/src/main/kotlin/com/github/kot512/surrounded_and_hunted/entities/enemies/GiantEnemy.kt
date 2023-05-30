package com.github.kot512.surrounded_and_hunted.entities.enemies

import com.github.kot512.surrounded_and_hunted.SurroundedAndHunted
import com.github.kot512.surrounded_and_hunted.SurroundedAndHunted.Companion.GIANT_ENEMY_TXTR
import com.github.kot512.surrounded_and_hunted.entities.Player
import com.github.kot512.surrounded_and_hunted.screen.playable_screens.BaseLocationScreen
import com.github.kot512.surrounded_and_hunted.tools.Point

class GiantEnemy (
    screen: BaseLocationScreen,
    spawnPosition: Point,
    player: Player
) : EnemyEntity(
    screen, GIANT_ENEMY_TXTR,
    spawnPosition, player,
    500f, 500f
) {
    override var health: Float = 300f
    override val damage: Float = 5f
    override val movementSpeed: Float = 50f
    override var scoreReward: Int = 10

    override fun changeViewDirection(delta: Float) {
        TODO()
    }
}
