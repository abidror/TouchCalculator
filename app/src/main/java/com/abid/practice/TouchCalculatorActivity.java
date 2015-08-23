package com.abid.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TouchCalculatorActivity extends Activity {
	TextView tv;
	Button bClear, bBksp, b0, b1, b2, b3, b4,b5, b6, b7, b8, b9, bEqual, bPoint;
	Button bPlus, bMinus, bMul, bDiv, bMod, bPower, bSquare, bCube, bFact, bSqrt, bSin, bCos;
	
	Double num1, num2, result;
	char opr;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tv = (TextView) findViewById(R.id.textView1);
        bClear = (Button) findViewById(R.id.btnClear);
        bBksp = (Button) findViewById(R.id.btnBksp);
        b0 = (Button) findViewById(R.id.btn0);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        bPoint = (Button) findViewById(R.id.btnPoint);
        bEqual = (Button) findViewById(R.id.btnEqual);
        bPlus = (Button) findViewById(R.id.btnPlus);
        bMinus = (Button) findViewById(R.id.btnMinus);
        bMul = (Button) findViewById(R.id.btnMul);
        bDiv = (Button) findViewById(R.id.btnDiv);
        bMod = (Button) findViewById(R.id.btnMod);
        bPower = (Button) findViewById(R.id.btnPower);
        bSquare = (Button) findViewById(R.id.btnSquare);
        bCube = (Button) findViewById(R.id.btnCube);
        bFact = (Button) findViewById(R.id.btnFact);
        bSqrt = (Button) findViewById(R.id.btnSqrt);
        bSin = (Button) findViewById(R.id.btnSin);
        bCos = (Button) findViewById(R.id.btnCos);
        
        ButtonHandler handler = new ButtonHandler();
        bClear.setOnClickListener(handler);
        bBksp.setOnClickListener(handler);
        b0.setOnClickListener(handler);
        b1.setOnClickListener(handler);
        b2.setOnClickListener(handler);
        b3.setOnClickListener(handler);
        b4.setOnClickListener(handler);
        b5.setOnClickListener(handler);
        b6.setOnClickListener(handler);
        b7.setOnClickListener(handler);
        b8.setOnClickListener(handler);
        b9.setOnClickListener(handler);
        bPoint.setOnClickListener(handler);
        bEqual.setOnClickListener(handler);
        bPlus.setOnClickListener(handler);
        bMinus.setOnClickListener(handler);
        bMul.setOnClickListener(handler);
        bDiv.setOnClickListener(handler);
        bMod.setOnClickListener(handler);
        bPower.setOnClickListener(handler);
        bSquare.setOnClickListener(handler);
        bCube.setOnClickListener(handler);
        bFact.setOnClickListener(handler);
        bSqrt.setOnClickListener(handler);
        bSin.setOnClickListener(handler);
        bCos.setOnClickListener(handler);
    }
    
    private class ButtonHandler implements OnClickListener
    {
    		@Override
		public void onClick(View v) {
			
			if( v == bClear)
			{
				tv.setText("");
			}
			else if( v == bBksp )
			{
				String text = tv.getText().toString();
				if( !text.equals(""))
				{
					String newText = text.substring(0, text.length()-1);
					tv.setText( newText );
				}
			}
			else if( v == b0 )
			{
				tv.setText( tv.getText() + "0");
			}
			else if( v == b1)
			{
				tv.setText( tv.getText() + "1");
			}
			else if( v == b2)
			{
				tv.setText( tv.getText()+ "2");
			}
			else if( v == b3)
			{
				tv.setText( tv.getText() + "3");
			}
			else if( v == b4 )
			{
				tv.setText(tv.getText() + "4");
			}
			else if( v == b5 )
			{
				tv.setText(tv.getText() + "5");
			}
			else if( v == b6 )
			{
				tv.setText(tv.getText() + "6");
			}
			else if( v == b7 )
			{
				tv.setText(tv.getText() + "7");
			}
			else if( v == b8 )
			{
				tv.setText(tv.getText() + "8");
			}
			else if( v == b9 )
			{
				tv.setText(tv.getText() + "9");
			}
			else if( v == bPoint )
			{
				if( ((String) tv.getText()).indexOf(".") == -1)
				{
					tv.setText(tv.getText() + ".");
				}
			}
			else if( v == bPlus )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = '+';
				tv.setText("");
			}
			else if( v == bMinus )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = '-';
				tv.setText("");
			}
			else if( v == bMul )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = '*';
				tv.setText("");
			}
			else if( v == bDiv )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = '/';
				tv.setText("");
			}
			else if( v == bMod )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = '%';
				tv.setText("");
			}
			else if( v == bPower )
			{
				num1 = Double.parseDouble( tv.getText().toString() );
				opr = 'p';
				tv.setText("");
			}
			else if( v == bEqual)
			{
				num2 = Double.parseDouble(tv.getText().toString());
				switch(opr)
				{
					case '+':
						result = num1 + num2;
						break;
					case '-':
						result = num1 - num2;
						break;
					case '*':
						result = num1 * num2;
						break;
					case '/':
						result = num1 / num2;
						break;
					case '%':
						result = num1 % num2;
						break;
					case 'p':
						result = Math.pow(num1, num2);
				}
				tv.setText(Double.toString(result));
			}
			else if( v == bSquare )
			{
				Double num = Double.parseDouble(tv.getText().toString() );
				tv.setText( Double.toString( num * num));
			}
			else if( v == bCube )
			{
				Double num = Double.parseDouble(tv.getText().toString() );
				tv.setText( Double.toString( num * num * num));
			}
			else if( v == bFact )
			{
				double num = Double.parseDouble(tv.getText().toString());
				double fact = 1;
				for( int i = 2; i <= num; i++)
				{
					fact = fact * i;
				}
				tv.setText(Double.toString(fact));
			}
			else if( v == bSqrt )
			{
				double num = Double.parseDouble(tv.getText().toString());
				tv.setText(Double.toString(Math.sqrt(num)));
			}
			else if( v == bSin)
			{
				double num = Double.parseDouble(tv.getText().toString());
				tv.setText( Double.toString(Math.sin(num)));
			}
			else if( v == bCos )
			{
				double num = Double.parseDouble(tv.getText().toString());
				tv.setText(Double.toString(Math.cos(num)));
			}
		}
    }
}