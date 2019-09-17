// This is a generated file. Not intended for manual editing.
package xyz.blink.jetbrainext.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static xyz.blink.jetbrainext.psi.BlinkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import xyz.blink.jetbrainext.psi.*;

public class BlinkPropertyImpl extends ASTWrapperPsiElement implements BlinkProperty {

  public BlinkPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BlinkVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BlinkVisitor) accept((BlinkVisitor)visitor);
    else super.accept(visitor);
  }

}
