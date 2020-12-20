package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView input,operation;
Double Pi,num1,num2,result;
String operator,value1,value2;
boolean haspoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (TextView) findViewById(R.id.input);
        operation = (TextView) findViewById(R.id.operator);
        haspoint=false;

    }
    public void Zero(View view) {
        input.setText(input.getText()+"0");
    }

    public void one(View view) {
        input.setText(input.getText()+"1");
    }

    public void two(View view) {
        input.setText(input.getText()+"2");
    }

    public void three(View view) {
        input.setText(input.getText()+"3");
    }

    public void four(View view) {
        input.setText(input.getText()+"4");
    }

    public void five(View view) {
        input.setText(input.getText()+"5");
    }

    public void six(View view) {
        input.setText(input.getText()+"6");
    }

    public void seven(View view) {
        input.setText(input.getText()+"7");
    }

    public void eight(View view) {
        input.setText(input.getText()+"8");
    }

    public void Nine(View view) {
        input.setText(input.getText()+"9");
    }


    public void log(View view) {
        operator = "log";
        input.setText(null);
        haspoint = false;
        operation.setText("log");
    }

    public void ln(View view) {
       operator = "ln";
        input.setText(null);
        haspoint = false;
        operation.setText("ln");

    }

    public void root(View view) {
        operator = "root";
        input.setText(null);
        haspoint = false;
        operation.setText("√");
    }

    public void factorial(View view) {
        operator = "factorial";
        input.setText(null);
        haspoint = false;
        operation.setText("!");

    }

    public void sin(View view) {
      operator = "sin";
        input.setText(null);
        haspoint = false;
        operation.setText("sin");
    }

    public void cos(View view) {
        operator = "cos";
        input.setText(null);
        haspoint = false;
        operation.setText("cos");
    }

    public void tan(View view) {
        operator = "tan";
        input.setText(null);
        haspoint = false;
        operation.setText("tan");
    }

    public void Add(View view) {
        operator = "+";
        value1 = input.getText().toString();
        input.setText(null);
        haspoint = false;
       operation.setText("+");

    }

    public void Sub(View view) {
        operator = "-";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("-");
        haspoint = false;
    }

    public void Multiply(View view) {
        operator = "*";
        value1 = input.getText().toString();
        input.setText(null);
        operation.setText("*");
        haspoint = false;
    }

    public void Divition(View view) {
        operator = "/";
        value1 = input.getText().toString();
        input.setText(null);
        haspoint = false;
        operation.setText("/");

    }



    public void Point(View view) {
        if (!haspoint){
            if (input.getText().equals("null")){
                haspoint=true;
                input.setText("0.");
            }
            else{
                input.setText(input.getText() + ".");
            }
            haspoint=true;
        }
    }


    public void Pi(View view) {
        input.getText().toString();
        input.setText(input.getText()+"3.1416");
        operation.setText("π");

    }

    public void allclear(View view) {
        input.setText(null);
        operation.setText(null);
        value1 = null;
        value2 = null;
        operator = null;
        haspoint = false;
    }



    public void clear(View view) {
        if (input.getText().equals("")){
            input.setText(null);
        }
        else{
            int len = input.getText().length();
            String s = input.getText().toString();
            if (s.charAt(len - 1) == '.') {
                haspoint = false;
                input.setText(input.getText().subSequence(0, input.getText().length() - 1));
            }
                else {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }

            }
        }

    public void Equal(View view) {
        if (operator == null) {
            operation.setText("Error!");
        } else if (input.getText().equals("")) {
            operation.setText("Error!");
        } else if ((operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) && value1.equals("")) {
            operation.setText("Error!");
        } else {
            switch (operator) {
                default:
                    break;
                case "log":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log10(num1) + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "ln":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    input.setText(Math.log(num1) + "");
                    operator = null;
                    operation.setText(null);
                    break;

                case "root":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    input.setText(Math.sqrt(num1) + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "factorial":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    int i = Integer.parseInt(value1) - 1;

                    while (i > 0) {
                        num1 = num1 * i;
                        i--;
                    }

                    input.setText(num1 + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "sin":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    result = Math.sin(Math.toRadians(num1));
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "cos":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    result = Math.cos(Math.toRadians(num1));
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "tan":
                    value1 = input.getText().toString();
                    num1 = Double.parseDouble((value1));
                    result = Math.tan(Math.toRadians(num1));
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "+":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 + num2;
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "-":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 - num2;
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "*":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 * num2;
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;
                case "/":
                    value2 = input.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    result = num1 / num2;
                    input.setText(result + "");
                    operator = null;
                    operation.setText(null);
                    break;


            }

        }
    }
}
