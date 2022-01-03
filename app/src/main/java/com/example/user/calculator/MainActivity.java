package com.example.user.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double num1,num2,r;
    String str1,str2;
    private Button n7,n8,n9,n4,n5,n6,n1,n2,n3,n0,point,equal,plus,minus,mul,div,ac,back,off;
    private EditText result;
    int action;


    public void init(){

        result = (EditText)findViewById(R.id.result);
        n7 = (Button)findViewById(R.id.n7);
        n8 = (Button)findViewById(R.id.n8);
        n9 = (Button)findViewById(R.id.n9);
        n4 = (Button)findViewById(R.id.n4);
        n5 = (Button)findViewById(R.id.n5);
        n6 = (Button)findViewById(R.id.n6);
        n1 = (Button)findViewById(R.id.n1);
        n2 = (Button)findViewById(R.id.n2);
        n3 = (Button)findViewById(R.id.n3);
        n0 = (Button)findViewById(R.id.n0);
        point = (Button)findViewById(R.id.point);
        equal = (Button)findViewById(R.id.equal);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        ac = (Button)findViewById(R.id.ac);
        back = (Button)findViewById(R.id.back);
        off = (Button)findViewById(R.id.off);
        n7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"7");

            }
        });
        n8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"8");

            }
        });
        n9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"9");

            }
        });
        n4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"4");

            }
        });
        n5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"5");

            }
        });
        n6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"6");

            }
        });
        n1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"1");

            }
        });
        n2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"2");

            }
        });
        n3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"3");

            }
        });
        n0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+"0");

            }
        });
        point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText(result.getText()+".");

            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                str1 = result.getText().toString();
                num1 = Double.parseDouble(str1);
                result.setText("");
                result.setHint("");
                action = 1;

            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                    str2 = result.getText().toString();
                    num2 = Double.parseDouble(str2);
                    if (action == 1) {
                        r = num1 + num2;
                        result.setText(String.valueOf(r));

                    } else if (action == 2) {
                        r = num1 - num2;
                        result.setText(String.valueOf(r));

                    } else if (action == 3) {
                        r = num1 * num2;
                        result.setText(String.valueOf(r));

                    } else if (action == 4) {
                        try {
                            r = num1 / num2;
                        }
                        catch (Exception e){

                            result.setHint("MATH ERROR!");
                        }
                        result.setText(String.valueOf(r));

                    }


            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                str1 = result.getText().toString();
                num1 = Double.parseDouble(str1);
                result.setText("");
                result.setHint("");
                action = 2;

            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                str1 = result.getText().toString();
                num1 = Double.parseDouble(str1);
                result.setText("");
                result.setHint("");
                action = 4;

            }
        });
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                str1 = result.getText().toString();
                num1 = Double.parseDouble(str1);
                result.setText("");
                result.setHint("");
                action = 3;

            }
        });
        ac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText("");
                result.setHint("0");

            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                StringBuffer erase = new StringBuffer(result.getText());
                erase.reverse();
                erase.deleteCharAt(0);
                erase.reverse();
                String s = new String(erase);
                result.setText(s);

            }
        });
        off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result.setText("");
                result.setHint("SHUT DOWN");

            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
