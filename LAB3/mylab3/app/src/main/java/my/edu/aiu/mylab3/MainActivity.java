package my.edu.aiu.mylab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
            private TextView formulaView, resultView;
    private Button btn0,btn1, btn2, btn3, btn4,btn5,btn6,btn7,btn8,btn9;
    private Button btnC,btnMultiply,btnBracket,btnPower,btnDivide,btnMinus,btnPlus,btnEqual,btnDot;

    private String workinValue = "";
    private String formulaValue = "";
    private String tempValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        formulaView= findViewById(R.id.formulaTextView);
        resultView= findViewById(R.id.resultTextView);
        btn0 = findViewById(R.id.btnzero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDivide = findViewById(R.id.btnDivide);
        btnPlus = findViewById(R.id.btnPlus);
        btnBracket = findViewById(R.id.btnBracket);
        btnEqual = findViewById(R.id.btnequal);
        btnMultiply = findViewById(R.id.multiply);


        btn9.setOnClickListener(MainActivity.this);
        btn8.setOnClickListener(MainActivity.this);
        btn7.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn1.setOnClickListener(MainActivity.this);
        btn0.setOnClickListener(MainActivity.this);
        btnC.setOnClickListener(MainActivity.this);
        btnMultiply.setOnClickListener(MainActivity.this);
        btnBracket.setOnClickListener(MainActivity.this);
        btnPower.setOnClickListener(MainActivity.this);
        btnDivide.setOnClickListener(MainActivity.this);
        btnMinus.setOnClickListener(MainActivity.this);
        btnPlus.setOnClickListener(MainActivity.this);
        btnEqual.setOnClickListener(MainActivity.this);
        btnDot.setOnClickListener(MainActivity.this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btn9){
            formulaView.setText("9");
        }
        if(v.getId() == R.id.btn8) {
            formulaView.setText("8");
        }
        if(v.getId() == R.id.btn7){
            formulaView.setText("7");
        }
        if(v.getId() == R.id.btn6) {
            formulaView.setText("6");
        }
        if(v.getId() == R.id.btn5) {
            formulaView.setText("5");
        }
        if(v.getId() == R.id.btn4) {
            formulaView.setText("4");
        }
        if(v.getId() == R.id.btn3) {
            formulaView.setText("3");
        }
        if(v.getId() == R.id.btn2) {
            formulaView.setText("2");
        }
        if(v.getId() == R.id.btn1) {
            formulaView.setText("1");
        }
        if(v.getId() == R.id.btnzero) {
            formulaView.setText("0");
        }
        if(v.getId() == R.id.multiply) {
            formulaView.setText("*");
        }
        if(v.getId() == R.id.btnDivide) {
            formulaView.setText("/");
        }
        if(v.getId() == R.id.btnPlus) {
            formulaView.setText("+");
        }
        if(v.getId() == R.id.btnequal) {
            formulaView.setText("=");
        }
        if(v.getId() == R.id.btnBracket) {
            formulaView.setText("()");
        }
        if(v.getId() == R.id.btnpower) {
            formulaView.setText("^");
        }
        if(v.getId() == R.id.btnMinus) {
            formulaView.setText("-");
        }
        if(v.getId() == R.id.btndot) {
            formulaView.setText(".");
        }
        if(v.getId() == R.id.btnC) {
            formulaView.setText("");
            resultView.setText("");
        }
        if(v.getId() == R.id.btnequal){
            ScriptEngine engine = new ScriptEngineManager()
                    .getEngineByName("rhino");
            Double result = null;
            try {
                result =(double) engine.eval(tempValue);
            }catch (ScriptException ex) {
                Toast.makeText(MainActivity.this,"invalid calculation",Toast.LENGTH_SHORT)
                .show();
            }

            if(result != null) {
                resultView.setText(
                        String.valueOf(result.doubleValue()));
            }

        }


    }
    private void setNumberValue(String  givenInputValue){
            tempValue=tempValue + givenInputValue;
            formulaView.setText(tempValue);
        }




        
        
}