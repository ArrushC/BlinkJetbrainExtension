package xyz.blink.jetbrainext.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import xyz.blink.jetbrainext.BlinkLanguage

class BlinkElementType(@NonNls debugName: String): IElementType(debugName, BlinkLanguage)