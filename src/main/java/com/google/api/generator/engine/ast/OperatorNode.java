package com.google.api.generator.engine.ast;


import com.google.common.collect.ImmutableSet;

public class OperatorNode implements AstNode {
  private enum OperatorKind {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    MODULUS,
    UNARY_PLUS,
    UNARY_MINOR,
    INCREMENT,
    RIGHT_INCREMENT,
    RIGHT_DECREMENT,
    DECREMENT,
    LOGICAL_NOT,
    EQUAL_TO,
    NOT_EQUAL_TO,
    GREATER_THAN,
    LESS_THAN,
    GREATER_THAN_OR_EQUAL_TO,
    LESS_THAN_OR_EQUAL_TO,
    LOGICAL_AND,
    LOGICAL_OR,
    LEFT_SHIFT,
  }

  private final static ImmutableSet<OperatorKind> RELATIONAL_SET = ImmutableSet.of(
      OperatorKind.GREATER_THAN,
      OperatorKind.GREATER_THAN_OR_EQUAL_TO,
      OperatorKind.LESS_THAN,
      OperatorKind.LESS_THAN_OR_EQUAL_TO,
      OperatorKind.EQUAL_TO,
      OperatorKind.NOT_EQUAL_TO
  );
  private final static ImmutableSet<OperatorKind> Left_UNARY_SET = ImmutableSet.of(
      OperatorKind.UNARY_PLUS,
      OperatorKind.UNARY_MINOR,
      OperatorKind.INCREMENT,
      OperatorKind.DECREMENT,
      OperatorKind.LOGICAL_NOT
  );

  private final static ImmutableSet<OperatorKind> RIGHT_UNARY_SET = ImmutableSet.of(
      OperatorKind.RIGHT_DECREMENT,
      OperatorKind.RIGHT_INCREMENT
  );
  private final static ImmutableSet<OperatorKind> BITWISE_SET = ImmutableSet.of(
      OperatorKind.LEFT_SHIFT
  );
  private final OperatorKind operatorKind;

  public OperatorNode(OperatorKind operatorKind) {
    this.operatorKind = operatorKind;
  }

  public static final OperatorNode ADDITION = new OperatorNode(OperatorKind.ADDITION);
  public static final OperatorNode RIGHT_INCREMENT = new OperatorNode(OperatorKind.RIGHT_INCREMENT);
  public static final OperatorNode LOGICAL_NOT = new OperatorNode(OperatorKind.LOGICAL_NOT);
  public static final OperatorNode LEFT_SHIFT = new OperatorNode(OperatorKind.LEFT_SHIFT);
  public static final OperatorNode LOGICAL_AND = new OperatorNode(OperatorKind.LOGICAL_AND);

  @Override
  public String toString() {
    switch (operatorKind) {
      case ADDITION:
        case UNARY_PLUS:
        return "+";
      case SUBTRACTION:
      case UNARY_MINOR:
        return "-";
      case MULTIPLICATION:
        return  "*";
      case DIVISION:
        return "/";
      case MODULUS:
        return "%";
      case INCREMENT:
      case RIGHT_INCREMENT:
        return "++";
      case DECREMENT:
      case RIGHT_DECREMENT:
        return "--";
      case LOGICAL_NOT:
        return "!";
      case GREATER_THAN:
        return ">";
      case LESS_THAN:
        return "<";
      case GREATER_THAN_OR_EQUAL_TO:
        return ">=";
      case LESS_THAN_OR_EQUAL_TO:
        return "<=";
      case EQUAL_TO:
        return "==";
      case NOT_EQUAL_TO:
        return "!=";
      case LOGICAL_AND:
        return "&&";
      case LOGICAL_OR:
        return "||";
      case LEFT_SHIFT:
        return "<<";
      default:
        return "";
    }
  }

  @Override
  public void accept(AstNodeVisitor visitor) {
    visitor.visit(this);
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof OperatorNode)) {
      return false;
    }
    OperatorNode operatorNode = (OperatorNode) o;
    return operatorKind.equals(operatorNode.operatorKind);
  }

  @Override
  public int hashCode() {
    return 17 * operatorKind.hashCode();
  }

  public static Boolean isRelationalOperator(OperatorNode operatorNode) {
    return RELATIONAL_SET.contains(operatorNode.operatorKind);
  }

  public static Boolean isUnaryOperator(OperatorNode operatorNode) {
    return Left_UNARY_SET.contains(operatorNode.operatorKind) || RIGHT_UNARY_SET.contains(operatorNode.operatorKind);
  }

  public static Boolean isBitwiseOperator(OperatorNode operatorNode) {
    return BITWISE_SET.contains(operatorNode.operatorKind);
  }

  public static Boolean isRightUnaryOperator(OperatorNode operatorNode) {
    return RIGHT_UNARY_SET.contains(operatorNode.operatorKind);
  }
}
