package xyz.blink.jetbrainext.parse

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class BlinkParserDefinition: ParserDefinition {

    override fun getFileNodeType(): IFileElementType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWhitespaceTokens(): TokenSet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createParser(p0: Project?): PsiParser {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createLexer(p0: Project?): Lexer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createFile(p0: FileViewProvider?): PsiFile {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun spaceExistanceTypeBetweenTokens(p0: ASTNode?, p1: ASTNode?): ParserDefinition.SpaceRequirements {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createElement(p0: ASTNode?): PsiElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCommentTokens(): TokenSet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}