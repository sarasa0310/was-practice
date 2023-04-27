package org.example.calculator.operator;

import org.example.calculator.value.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
