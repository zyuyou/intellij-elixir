// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.ericsson.otp.erlang.OtpErlangTuple;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.tree.IElementType;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirLiteralStringSigilLineImpl extends ASTWrapperPsiElement implements ElixirLiteralStringSigilLine {

  public ElixirLiteralStringSigilLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitLiteralStringSigilLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirLiteralStringBody getLiteralStringBody() {
    return findNotNullChildByClass(ElixirLiteralStringBody.class);
  }

  @Override
  @NotNull
  public ElixirSigilModifiers getSigilModifiers() {
    return findNotNullChildByClass(ElixirSigilModifiers.class);
  }

  @NotNull
  public List<Integer> addEscapedCharacterCodePoints(List<Integer> codePointList, ASTNode child) {
    return ElixirPsiImplUtil.addEscapedCharacterCodePoints(this, codePointList, child);
  }

  @NotNull
  public List<Integer> addFragmentCodePoints(List<Integer> codePointList, ASTNode child) {
    return ElixirPsiImplUtil.addFragmentCodePoints(this, codePointList, child);
  }

  @NotNull
  public List<Integer> addHexadecimalEscapeSequenceCodePoints(List<Integer> codePointList, ASTNode child) {
    return ElixirPsiImplUtil.addHexadecimalEscapeSequenceCodePoints(this, codePointList, child);
  }

  public Body getBody() {
    return ElixirPsiImplUtil.getBody(this);
  }

  public IElementType getFragmentType() {
    return ElixirPsiImplUtil.getFragmentType(this);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @NotNull
  public OtpErlangObject quoteBinary(OtpErlangTuple binary) {
    return ElixirPsiImplUtil.quoteBinary(this, binary);
  }

  @NotNull
  public OtpErlangObject quoteEmpty() {
    return ElixirPsiImplUtil.quoteEmpty(this);
  }

  @NotNull
  public OtpErlangObject quoteLiteral(List<Integer> codePointList) {
    return ElixirPsiImplUtil.quoteLiteral(this, codePointList);
  }

  public char sigilName() {
    return ElixirPsiImplUtil.sigilName(this);
  }

  public char terminator() {
    return ElixirPsiImplUtil.terminator(this);
  }

}
