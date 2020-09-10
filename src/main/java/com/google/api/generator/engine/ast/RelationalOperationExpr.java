package com.google.api.generator.engine.ast;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;

@AutoValue
public abstract class RelationalOperationExpr implements OperationExpr {
  public abstract Expr lhsExpr();

  public abstract Expr rhsExpr();

  public abstract OperatorKind operatorKind();

  @Override
  public TypeNode type() {
    return TypeNode.BOOLEAN;
  }

  @Override
  public void accept(AstNodeVisitor visitor) {
    visitor.visit(this);
  }

  // Convenience wrapper.
  public static RelationalOperationExpr equalToWithExprs(Expr lhsExpr, Expr rhsExpr) {
    return builder()
        .setLhsExpr(lhsExpr)
        .setRhsExpr(rhsExpr)
        .setOperatorKind(OperatorKind.RELATIONAL_EQUAL_TO)
        .build();
  }

  // Convenience wrapper.
  public static RelationalOperationExpr notEqualToWithExprs(Expr lhsExpr, Expr rhsExpr) {
    return builder()
        .setLhsExpr(lhsExpr)
        .setRhsExpr(rhsExpr)
        .setOperatorKind(OperatorKind.RELATIONAL_NOT_EQUAL_TO)
        .build();
  }

  // TODO(summerji): Add convenience wrapper lessThanWithExprs
  // public static RelationalOperationExpr lessThanWithExprs(Expr lhsExpr, Expr rhsExpr) {
  //   return builder()
  //       .setLhsExpr(lhsExpr)
  //       .setRhsExpr(rhsExpr)
  //       .setOperatorKind(OperatorKind.RELATIONAL_LESS_THAN)
  //       .build();
  // }

  private static Builder builder() {
    return new AutoValue_RelationalOperationExpr.Builder();
  }

  @AutoValue.Builder
  abstract static class Builder {

    // Private setter.
    abstract Builder setLhsExpr(Expr expr);

    // Private setter.
    abstract Builder setRhsExpr(Expr expr);

    // Private setter.
    abstract Builder setOperatorKind(OperatorKind operator);

    abstract RelationalOperationExpr autoBuild();

    private RelationalOperationExpr build() {
      RelationalOperationExpr relationalOperationExpr = autoBuild();
      TypeNode lhsExprType = relationalOperationExpr.lhsExpr().type();
      TypeNode rhsExprType = relationalOperationExpr.rhsExpr().type();
      OperatorKind operator = relationalOperationExpr.operatorKind();
      final String errorMsg =
          String.format(
              "Relational operator %s can not be applied to %s, %s.",
              operator, lhsExprType.toString(), rhsExprType.toString());

      if (operator.equals(OperatorKind.RELATIONAL_EQUAL_TO)
          || operator.equals(OperatorKind.RELATIONAL_NOT_EQUAL_TO)) {
        Preconditions.checkState(isValidEqualityType(lhsExprType, rhsExprType), errorMsg);
      }

      return relationalOperationExpr;
    }

    // isValidEqualityType checks expressions' type for equality operator (==) and non-equality
    // operator (!=).
    private boolean isValidEqualityType(TypeNode lhsType, TypeNode rhsType) {
      // The Operators can not be applied on void type.
      if (lhsType.equals(TypeNode.VOID) || rhsType.equals(TypeNode.VOID)) {
        return false;
      }

      // If the expressions' type are array, the types should be array and matched, or either is
      // null;
      if (lhsType.isArray() || rhsType.isArray()) {
        if (lhsType.equals(TypeNode.NULL) || rhsType.equals(TypeNode.NULL)) {
          return true;
        }
        if ((lhsType.isArray() && !rhsType.isArray())
            || (!lhsType.isArray() && rhsType.isArray())) {
          return false;
        }
        return lhsType.equals(rhsType);
      }

      // If lhs expression type is boolean or its boxed type, rhs should be boolean or boxed or null
      // or new Object
      if (lhsType.equals(TypeNode.BOOLEAN)) {
        return rhsType.equals(lhsType)
            || rhsType.equals(TypeNode.NULL)
            || rhsType.equals(TypeNode.OBJECT);
      }

      // If lhs expression type is numeric type (char, byte, short, int, long, double), the rhs
      // expression type should be any numeric type or any numeric boxed type
      // if lhs is boxed numeric type, rhs could be null or Object;
      if (TypeNode.isNumericType(lhsType)) {
        if (TypeNode.isNumericType(rhsType)) {
          return true;
        }
        return TypeNode.isBoxedType(lhsType)
            && (rhsType.equals(TypeNode.NULL) || rhsType.equals(TypeNode.OBJECT));
      }

      // If lhs expression type is new Object or null, the rhs type should be a reference type or
      // null or boxed type;
      if (TypeNode.OBJECT.equals(lhsType) || TypeNode.NULL.equals(lhsType)) {
        return TypeNode.isReferenceType(rhsType)
            || rhsType.equals(TypeNode.NULL)
            || TypeNode.isBoxedType(rhsType);
      }

      // If lhs expression type is reference type, the rhs type should match lhs or null or new
      // Object.
      if (TypeNode.isReferenceType(lhsType)) {
        return lhsType.equals(rhsType)
            || rhsType.equals(TypeNode.NULL)
            || rhsType.equals(TypeNode.OBJECT);
      }

      return lhsType.equals(rhsType);
    }
  }
}
