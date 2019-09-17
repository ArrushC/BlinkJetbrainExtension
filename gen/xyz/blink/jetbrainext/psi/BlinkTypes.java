// This is a generated file. Not intended for manual editing.
package xyz.blink.jetbrainext.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import xyz.blink.jetbrainext.psi.impl.*;

public interface BlinkTypes {

  IElementType PROPERTY = new BlinkElementType("PROPERTY");

  IElementType COMMENT = new BlinkTokenType("COMMENT");
  IElementType CRLF = new BlinkTokenType("CRLF");
  IElementType KEY = new BlinkTokenType("KEY");
  IElementType SEPARATOR = new BlinkTokenType("SEPARATOR");
  IElementType VALUE = new BlinkTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new BlinkPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
