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

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int val=0;
    AlertDialog alertDialog,alertDialog1,alertDialog2;
    AlertDialog.Builder dialog,dialog1,dialog2;
int set=0;
int fly=0;
    View view;
ArrayList<Integer> al=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


         dialog=new AlertDialog.Builder(this);
        dialog.setMessage("You win");
        dialog.setTitle("Result");
        dialog.setPositiveButton("Restart",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {

                        startActivity(intent);
                    }
                });
        dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
                System.exit(0);
            }
        });
         alertDialog=dialog.create();

        dialog1=new AlertDialog.Builder(this);
        dialog1.setMessage("You Loose");
        dialog1.setTitle("Result");
        dialog1.setPositiveButton("Restart",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog1,
                                        int which) {

                        startActivity(intent);
                    }
                });
        dialog1.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog1, int which) {

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

                        startActivity(intent);
                    }
                });
        dialog2.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog2, int which) {

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
                b1.setText("X");
                b1.setEnabled(false);
                b1.setTextColor(Color.GREEN);
                al.add(1);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("X");
                b2.setEnabled(false);
                b2.setTextColor(Color.GREEN);
                al.add(2);

                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("X");
                b3.setEnabled(false);
                al.add(3);
                b3.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("X");
                b4.setEnabled(false);
                al.add(4);
                b4.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("X");
                b5.setEnabled(false);
                al.add(5);
                b5.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }



                win(view);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("X");
                b6.setEnabled(false);
                al.add(6);
                b6.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }
                win(view);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("X");
                b7.setEnabled(false);
                al.add(7);
                b7.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }
                win(view);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("X");
                b8.setEnabled(false);
                al.add(8);
                b8.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("X");
                b9.setEnabled(false);
                al.add(9);
                b9.setTextColor(Color.GREEN);
                set++;
                win(view);
                if(set!=5 && val==0){
                    get(view);
                }

                win(view);
            }
        });









    }
    public  void get(View view){


        int count=0;
        int value= (int) (Math.random()*9);

        if(value==0){
            value=1;
        }

        for(int i=0;i<al.size();i++ ){
            if(value==al.get(i)){
                get(view);
            }
            else{
                count++;

            }
        }
        if(count==al.size()){
            if(value==1){
                b1.setText("O");
                b1.setEnabled(false);
                al.add(1);
                b1.setTextColor(Color.BLUE);
            }
            else if(value==2){
                b2.setText("O");
                b2.setEnabled(false);
                al.add(2);
                b2.setTextColor(Color.BLUE);
            }
            else if(value==3){
                b3.setText("O");
                b3.setEnabled(false);
                al.add(3);
                b3.setTextColor(Color.BLUE);
            }
            else if(value==4){
                b4.setText("O");
                b4.setEnabled(false);
                al.add(4);
                b4.setTextColor(Color.BLUE);
            }
            else if(value==5){
                b5.setText("O");
                b5.setEnabled(false);
                al.add(5);
                b5.setTextColor(Color.BLUE);
            }
            else if(value==6){
                b6.setText("O");
                b6.setEnabled(false);
                al.add(6);
                b6.setTextColor(Color.BLUE);
            }
            else if(value==7){
                b7.setText("O");
                b7.setEnabled(false);
                al.add(7);
                b7.setTextColor(Color.BLUE);
            }
            else if(value==8){
                b8.setText("O");
                b8.setEnabled(false);
                al.add(8);
                b8.setTextColor(Color.BLUE);
            }
            else if(value==9){
                b9.setText("O");
                b9.setEnabled(false);
                al.add(9);
                b9.setTextColor(Color.BLUE);
            }

        }

    }
    public  void win(View view){

        if(b1.getText()==b2.getText() && b2.getText()==b3.getText()){
            val++;

            b1.setBackgroundColor(Color.RED);
            b2.setBackgroundColor(Color.RED);
            b3.setBackgroundColor(Color.RED);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);

            if(b1.getText()=="X"){
fly++;


                alertDialog.show();
            }


        }
        else if(b1.getText()==b4.getText() && b4.getText()==b7.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            val++;
            b1.setBackgroundColor(Color.RED);
            b4.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b1.getText()=="X"){

fly++;
                alertDialog.show();
            }

        }
        else if(b2.getText()==b5.getText() && b5.getText()==b8.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            val++;
            b2.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            if(b2.getText()=="X"){

fly++;
                alertDialog.show();
            }

        }
        else if(b3.getText()==b6.getText() && b6.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b3.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b3.getText()=="X"){
fly++;

                alertDialog.show();
            }

        }
        else if(b3.getText()==b5.getText() && b5.getText()==b7.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b3.setBackgroundColor(Color.RED);
            val++;
            b5.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b3.getText()=="X"){

fly++;
                alertDialog.show();
            }

        }
        else if(b1.getText()==b5.getText() && b5.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b1.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b1.getText()=="X"){

fly++;
                alertDialog.show();
            }

        }
        else if(b4.getText()==b5.getText() && b5.getText()==b6.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b4.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            if(b4.getText()=="X"){
fly++;

                alertDialog.show();
            }

        }
        else if(b7.getText()==b8.getText() && b8.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b7.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b7.getText()=="X"){

            fly++;
                alertDialog.show();
            }


        }
        else if(set==5 && val==0){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            alertDialog2.show();


        }
        if(fly==0){

            again(view);
        }



    }

    public void again(View view){



        if(b1.getText()==b2.getText() && b2.getText()==b3.getText()){

            b1.setBackgroundColor(Color.RED);
            b2.setBackgroundColor(Color.RED);
            b3.setBackgroundColor(Color.RED);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);

            if(b1.getText()=="O"){



                alertDialog1.show();
            }


        }
        else if(b1.getText()==b4.getText() && b4.getText()==b7.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            val++;
            b1.setBackgroundColor(Color.RED);
            b4.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b1.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b2.getText()==b5.getText() && b5.getText()==b8.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            val++;
            b2.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            if(b2.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b3.getText()==b6.getText() && b6.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b3.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b3.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b3.getText()==b5.getText() && b5.getText()==b7.getText()){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b3.setBackgroundColor(Color.RED);
            val++;
            b5.setBackgroundColor(Color.RED);
            b7.setBackgroundColor(Color.RED);
            if(b3.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b1.getText()==b5.getText() && b5.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b1.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b1.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b4.getText()==b5.getText() && b5.getText()==b6.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b4.setBackgroundColor(Color.RED);
            b5.setBackgroundColor(Color.RED);
            b6.setBackgroundColor(Color.RED);
            if(b4.getText()=="O"){


                alertDialog1.show();
            }

        }
        else if(b7.getText()==b8.getText() && b8.getText()==b9.getText()){
            val++;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            b7.setBackgroundColor(Color.RED);
            b8.setBackgroundColor(Color.RED);
            b9.setBackgroundColor(Color.RED);
            if(b7.getText()=="O"){


                alertDialog1.show();
            }


        }
        else if(set==5 && val==0){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);b6.setEnabled(false); b7.setEnabled(false);b8.setEnabled(false);b9.setEnabled(false);
            alertDialog2.show();


        }



    }
}