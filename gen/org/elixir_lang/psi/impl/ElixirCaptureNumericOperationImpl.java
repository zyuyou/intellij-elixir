// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.apache.commons.lang.math.IntRange;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirCaptureNumericOperationImpl extends ASTWrapperPsiElement implements ElixirCaptureNumericOperation {

  public ElixirCaptureNumericOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitCaptureNumericOperation(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirBinaryWholeNumber getBinaryWholeNumber() {
    return findChildByClass(ElixirBinaryWholeNumber.class);
  }

  @Override
  @NotNull
  public ElixirCapturePrefixOperator getCapturePrefixOperator() {
    return findNotNullChildByClass(ElixirCapturePrefixOperator.class);
  }

  @Override
  @Nullable
  public ElixirCharToken getCharToken() {
    return findChildByClass(ElixirCharToken.class);
  }

  @Override
  @Nullable
  public ElixirDecimalFloat getDecimalFloat() {
    return findChildByClass(ElixirDecimalFloat.class);
  }

  @Override
  @Nullable
  public ElixirDecimalWholeNumber getDecimalWholeNumber() {
    return findChildByClass(ElixirDecimalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirHexadecimalWholeNumber getHexadecimalWholeNumber() {
    return findChildByClass(ElixirHexadecimalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirOctalWholeNumber getOctalWholeNumber() {
    return findChildByClass(ElixirOctalWholeNumber.class);
  }

  @Override
  @Nullable
  public ElixirUnknownBaseWholeNumber getUnknownBaseWholeNumber() {
    return findChildByClass(ElixirUnknownBaseWholeNumber.class);
  }

  @Nullable
  public String functionName() {
    return ElixirPsiImplUtil.functionName(this);
  }

  @NotNull
  public PsiElement functionNameElement() {
    return ElixirPsiImplUtil.functionNameElement(this);
  }

  @Nullable
  public ElixirDoBlock getDoBlock() {
    return ElixirPsiImplUtil.getDoBlock(this);
  }

  @Nullable
  public String getName() {
    return ElixirPsiImplUtil.getName(this);
  }

  public PsiElement getNameIdentifier() {
    return ElixirPsiImplUtil.getNameIdentifier(this);
  }

  public boolean hasDoBlockOrKeyword() {
    return ElixirPsiImplUtil.hasDoBlockOrKeyword(this);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  public boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName) {
    return ElixirPsiImplUtil.isCallingMacro(this, resolvedModuleName, resolvedFunctionName);
  }

  public boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCallingMacro(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  @Nullable
  public String moduleName() {
    return ElixirPsiImplUtil.moduleName(this);
  }

  @Nullable
  public Quotable operand() {
    return ElixirPsiImplUtil.operand(this);
  }

  @NotNull
  public Operator operator() {
    return ElixirPsiImplUtil.operator(this);
  }

  @NotNull
  public PsiElement[] primaryArguments() {
    return ElixirPsiImplUtil.primaryArguments(this);
  }

  @Nullable
  public Integer primaryArity() {
    return ElixirPsiImplUtil.primaryArity(this);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @Nullable
  public PsiElement[] secondaryArguments() {
    return ElixirPsiImplUtil.secondaryArguments(this);
  }

  @Nullable
  public Integer secondaryArity() {
    return ElixirPsiImplUtil.secondaryArity(this);
  }

  @NotNull
  public int resolvedFinalArity() {
    return ElixirPsiImplUtil.resolvedFinalArity(this);
  }

  @NotNull
  public IntRange resolvedFinalArityRange() {
    return ElixirPsiImplUtil.resolvedFinalArityRange(this);
  }

  @NotNull
  public String resolvedFunctionName() {
    return ElixirPsiImplUtil.resolvedFunctionName(this);
  }

  @NotNull
  public String resolvedModuleName() {
    return ElixirPsiImplUtil.resolvedModuleName(this);
  }

  @Nullable
  public Integer resolvedPrimaryArity() {
    return ElixirPsiImplUtil.resolvedPrimaryArity(this);
  }

  @Nullable
  public Integer resolvedSecondaryArity() {
    return ElixirPsiImplUtil.resolvedSecondaryArity(this);
  }

  @NotNull
  public PsiElement setName(String newName) {
    return ElixirPsiImplUtil.setName(this, newName);
  }

}
