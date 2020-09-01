// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.generator.engine.ast;

import java.util.EnumSet;

public enum OperatorKind {
  ARITHMETIC_ADDITION,
  UNARY_POST_INCREMENT,
  LOGICAL_NOT,
  RELATIONAL_EQUAL_TO,
  RELATIONAL_NOT_EQUAL_TO;

  private static final EnumSet<OperatorKind> PREFIX_OPERATORS_SET;

  static {
    PREFIX_OPERATORS_SET = EnumSet.of(OperatorKind.LOGICAL_NOT);
  }

  public boolean isPrefixOperator() {
    return PREFIX_OPERATORS_SET.contains(this);
  }
}
