package com.example.calculator

import com.example.calculator.ui.theme.CalculatorOperation

sealed class CalculatorAction(){
    data class Number(val number:Int):CalculatorAction()
    object Clear:CalculatorAction()
    object Delete:CalculatorAction()
    object Decimal:CalculatorAction()
    object Calculate:CalculatorAction()
    data class Operarion(val operation:CalculatorOperation):CalculatorAction()
}
