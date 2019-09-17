package xyz.blink.jetbrainext

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object BlinkFileType : LanguageFileType(BlinkLanguage) {
    override fun getIcon(): Icon = Constants.ICON
    override fun getName(): String = "Blink file"
    override fun getDefaultExtension(): String = "blink"
    override fun getDescription(): String = "A simplistic, flexible JVM language"
}