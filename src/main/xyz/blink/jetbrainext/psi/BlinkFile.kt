package xyz.blink.jetbrainext.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.jetbrains.annotations.NotNull
import xyz.blink.jetbrainext.BlinkFileType
import xyz.blink.jetbrainext.BlinkLanguage

class BlinkFile(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, BlinkLanguage) {
    fun getFileType(): FileType  = BlinkFileType
    fun toString(): String = "Blink File"
}