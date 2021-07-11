package com.example.tictactoe;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.LogRecord;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int val=0;
    AlertDialog alertDialog,alertDialog1,alertDialog2;
    AlertDialog.Builder dialog,dialog1,dialog2;
    int set=0;
    int change=0;
    View view;
    ArrayList<Integer> al=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_main);
        Intent intent=new Intent(MainActivity3.this,MainActivity3.class);

        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        dialog=new AlertDialog.Builder(this);
        dialog.setMessage("First player win");
        dialog.setTitle("Result");
        dialog.setPositiveButton("Restart",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                });
        dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"exit",Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });
        alertDialog=dialog.create();

        dialog1=new AlertDialog.Builder(this);
        dialog1.setMessage("Second player win");
        dialog1.setTitle("Result");
        dialog1.setPositiveButton("Restart",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog1,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                });
        dialog1.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog1, int which) {
                Toast.makeText(getApplicationContext(),"exit",Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });
        alertDialog1=dialog1.create();


        dialog2=new AlertDialog.Builder(this);
        dialog2.setMessage("Draw");
        dialog2.setTitle("Result");
        dialog2.setPositiveButton("Restart",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog2,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Restart",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                });
        dialog2.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog2, int which) {
                Toast.makeText(getApplicationContext(),"exit",Toast.LENGTH_LONG).show();
                finish();
                System.exit(0);
            }
        });
        alertDialog2=dialog2.create();









        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b1.setText("X");
                    b1.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b1.setText("O");
                    change=0;
                    b1.setTextColor(Color.BLUE);
                }

                b1.setEnabled(false);

                al.add(1);
                set++;


                win(view);



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b2.setText("X");
                    b2.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b2.setText("O");
                    change=0;
                    b2.setTextColor(Color.BLUE);
                }
                b2.setEnabled(false);

                al.add(2);

                set++;

                win(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b3.setText("X");
                    b3.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b3.setText("O");
                    change=0;
                    b3.setTextColor(Color.BLUE);
                }
                b3.setEnabled(false);
                al.add(3);

                set++;


                win(view);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b4.setText("X");
                    b4.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b4.setText("O");
                    change=0;
                    b4.setTextColor(Color.BLUE);
                }

                b4.setEnabled(false);
                al.add(4);

                set++;


                win(view);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b5.setText("X");
                    b5.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b5.setText("O");
                    change=0;
                    b5.setTextColor(Color.BLUE);
                }
                b5.setEnabled(false);
                al.add(5);

                set++;




                win(view);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b6.setText("X");
                    b6.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b6.setText("O");
                    change=0;
                    b6.setTextColor(Color.BLUE);
                }

                b6.setEnabled(false);
                al.add(6);

                set++;

                win(view);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b7.setText("X");
                    b7.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b7.setText("O");
                    change=0;
                    b7.setTextColor(Color.BLUE);
                }
                b7.setEnabled(false);
                al.add(7);

                set++;

                win(view);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b8.setText("X");
                    b8.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b8.setText("O");
                    change=0;
                    b8.setTextColor(Color.BLUE);
                }
                b8.setEnabled(false);
                al.add(8);

                set++;


                win(view);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(change==0){
                    b9.setText("X");
                    b9.setTextColor(Color.GREEN);
                    change++;
                }
                else{
                    b9.setText("O");
                    change=0;
                    b9.setTextColor(Color.BLUE);
                }
                b9.setEnabled(false);
                al.add(9);

                set++;


                win(view);
            }
        });









    }
    public  void win(View view){

        if(b1.getText()==b2.getText() && b2.getText()==b3.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            val++;
            b1.setBackgroundColor(Color.RED);
            b2.setBackgroundColor(Color.RED);
            b3.setBackgroundColor(Color.RED);
            if(b1.getText()=="X"){



                alertDialog.show();
            }
            else{



                alertDialog1.show();
            }

        }
        else if(b1.getText()==b4.getText() && b4.getText()==b7.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b1.setBackgroundColor(Color.RED);
            b4.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b1.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b2.getText()==b5.getText() && b5.getText()==b8.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b2.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            if(b2.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b3.getText()==b6.getText() && b6.getText()==b9.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b3.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b3.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b3.getText()==b5.getText() && b5.getText()==b7.getText()){
            b3.setBackgroundColor(Color.RED);
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b5.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b3.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b1.getText()==b5.getText() && b5.getText()==b9.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b1.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b1.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b4.getText()==b5.getText() && b5.getText()==b6.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b4.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            if(b4.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }
        }
        else if(b7.getText()==b8.getText() && b8.getText()==b9.getText()){
            val++; b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b7.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b7.getText()=="X"){


                alertDialog.show();
            }
            else{


                alertDialog1.show();
            }

        }
        else if(set==9 && val==0){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            alertDialog2.show();


        }



    }
}