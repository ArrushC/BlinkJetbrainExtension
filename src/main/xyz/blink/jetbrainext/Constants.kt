package xyz.blink.jetbrainext

import com.intellij.openapi.util.IconLoader
import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet

object Constants {
    val ICON = IconLoader.getIcon("assets/Blink.png")
    val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS: TokenSet = TokenSet.create(BlinkTypes.COMMENT)
}