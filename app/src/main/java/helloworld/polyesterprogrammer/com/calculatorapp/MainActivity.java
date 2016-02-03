package helloworld.polyesterprogrammer.com.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtoperand1;        // will take in top text numbers
    private EditText edtoperand2;        // will take in bottom text numbers
    private Button btnAddition;       // will add operands 1 & 2 together
    private Button btnSubtraction;    // will subtract operands 1 & 2 together
    private Button btnDivision;       // will divide operands 1 & 2 together
    private Button btnMultiplication; // will multiply operands 1 & 2 together
    private Button btnClear;                 // will clear all fields
    private TextView txtvResult;      // will output result of math

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        Assigning values to their interface counterpart
        Java variables are named the same as their Design Layout variables to avoid confusion
         */
        edtoperand1 = (EditText) findViewById(R.id.edtOperand1);
        edtoperand2 = (EditText) findViewById(R.id.edtOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtvResult = (TextView) findViewById(R.id.txtvResult);

        /*
        Creating methods for each button for when they are clicked
         */
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((edtoperand1.getText().length())>0 && (edtoperand2.getText().length())>0  ) {
                    //converting the values in edtoperand 1 & 2 into a string, which is then converted into a double
                    double oper1 = Double.parseDouble(edtoperand1.getText().toString());
                    double oper2 = Double.parseDouble(edtoperand2.getText().toString());
                    //sum of values
                    double additionResult = oper1 + oper2;
                    // takes in the double and converts to a string, which is then sent to txtvresult
                    txtvResult.setText(Double.toString(additionResult));
                }else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtoperand1.getText().length()) > 0 && (edtoperand2.getText().length()) > 0) {
                    //converting the values in edtoperand 1 & 2 into a string, which is then converted into a double
                    double oper1 = Double.parseDouble(edtoperand1.getText().toString());
                    double oper2 = Double.parseDouble(edtoperand2.getText().toString());
                    //difference of values
                    double additionResult = oper1 - oper2;
                    // takes in the double and converts to a string, which is then sent to txtvresult
                    txtvResult.setText(Double.toString(additionResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edtoperand1.getText().length())>0 && (edtoperand2.getText().length())>0  ) {
                    //converting the values in edtoperand 1 & 2 into a string, which is then converted into a double
                    double oper1 = Double.parseDouble(edtoperand1.getText().toString());
                    double oper2 = Double.parseDouble(edtoperand2.getText().toString());
                    //dividend of values
                    double additionResult = oper1 / oper2;
                    // takes in the double and converts to a string, which is then sent to txtvresult
                    txtvResult.setText(Double.toString(additionResult));
                }else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edtoperand1.getText().length())>0 && (edtoperand2.getText().length())>0  ) {
                    //converting the values in edtoperand 1 & 2 into a string, which is then converted into a double
                    double oper1 = Double.parseDouble(edtoperand1.getText().toString());
                    double oper2 = Double.parseDouble(edtoperand2.getText().toString());
                    //multiple of values
                    double additionResult = oper1 * oper2;
                    // takes in the double and converts to a string, which is then sent to txtvresult
                    txtvResult.setText(Double.toString(additionResult));
                }else{
                    Toast.makeText(MainActivity.this, "Please enter numbers in both fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            edtoperand1.setText("");
            edtoperand2.setText("");
            txtvResult.setText("0.0");
            edtoperand1.requestFocus();

            }
        });







    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
