package com.github.kot512.surrounded_and_hunted

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Preferences
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.github.kot512.surrounded_and_hunted.screen.image_screens.MainMenuImageScreen
import com.github.kot512.surrounded_and_hunted.tools.Point
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.assets.disposeSafely

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
class SurroundedAndHunted : KtxGame<KtxScreen>() {
//    предзагружаемые ресурсы
    companion object {
//        константы
        var SCREEN_WIDTH = 0f
        var SCREEN_HEIGHT = 0f
        val L_JOYSTICK_POS = Point(0f, 0f)
        val R_JOYSTICK_POS = Point(0f, 0f)

//        текстуры
        lateinit var TEXTURE_ATLAS: TextureAtlas

        lateinit var JOYSTICK_KNOB_TXTR: TextureRegion
        lateinit var JOYSTICK_BASE_TXTR:  TextureRegion
        lateinit var PROJECTILE_BASE_TXTR: TextureRegion
        lateinit var PLAYER_TXTR: TextureRegion
        lateinit var BASIC_ENEMY_TXTR: TextureRegion

//        выгрузка сохраненных переменных
        lateinit var SAVE_DATA: Preferences

        var RECORD_SCORE = 0
        var CURRENT_SCORE = 0
        var UPGRADE_POINTS = 0
    }

    override fun create() {
//        загрузка сохраненных данных
        SAVE_DATA = Gdx.app.getPreferences("data")

        if (!SAVE_DATA.contains("record"))
            SAVE_DATA.apply {
                putInteger("record", 0)
                flush()
            }
        else RECORD_SCORE = SAVE_DATA.getInteger("record")

        if (!SAVE_DATA.contains("upgrade"))
            SAVE_DATA.apply {
                putInteger("upgrade", 0)
                flush()
            }
        else UPGRADE_POINTS = SAVE_DATA.getInteger("upgrade")


//        инициализируем константы
        SCREEN_WIDTH = Gdx.graphics.width.toFloat()
        SCREEN_HEIGHT = Gdx.graphics.height.toFloat()
        L_JOYSTICK_POS.setPoint(Point(SCREEN_WIDTH / 20, SCREEN_HEIGHT / 15))
        R_JOYSTICK_POS.set(Point(SCREEN_WIDTH - SCREEN_WIDTH / 20 - 350f, SCREEN_HEIGHT / 15))

//        инициализируем текстуры
        TEXTURE_ATLAS = TextureAtlas("graphics/atlas/PPM_atlas.atlas")

//        текстуры интерфейса
        JOYSTICK_KNOB_TXTR = TextureRegion(
            TEXTURE_ATLAS.findRegion("hud_joystick_knob")
        )
        JOYSTICK_BASE_TXTR = TextureRegion(
            TEXTURE_ATLAS.findRegion("hud_joystick_base")
        )

//        текстуры объектов и сущнестей
        PROJECTILE_BASE_TXTR = TextureRegion(
            TEXTURE_ATLAS.findRegion("projectile_main")
        )
        PLAYER_TXTR = TextureRegion(
            TEXTURE_ATLAS.findRegion("entity_player")
        )
        BASIC_ENEMY_TXTR =
            TextureRegion(
                TEXTURE_ATLAS.findRegion("entity_enemy_basic")
            )

//        активируем экран главного меню
        addScreen(MainMenuImageScreen())
        setScreen<MainMenuImageScreen>()
    }

    override fun dispose() {
        TEXTURE_ATLAS.disposeSafely()
    }


    override fun pause() {
        super.pause()
    }

    override fun render() {
        super.render()
    }


    override fun resume() {
        super.resume()
    }
}
