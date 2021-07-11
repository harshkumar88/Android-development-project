package com.example.alarmclock;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
int var=0;
int rotate=0;
int b=0;
    int s=1;
    int a=1000000;
    int v=0;
    int sec1=60;
    int pop;

   int min1=59;
   int hour1;
   String arr[];

    String n="";

Toast toast;
    TextView hour,min,sec;
    EditText upto;
    CountDownTimer count;
    MediaPlayer mysong;
    Button btn,button;
    TextView val;


    public class CountDownTimerClass extends CountDownTimer{

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public CountDownTimerClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            int progress= (int)((l/l)*s);
            if(sec1<10 && sec1>0){
                sec.setText("0"+Integer.toString(sec1));
                sec1--;

            }
            else if(sec1==0 && min1==0 && hour1==0){
                sec.setText("0"+Integer.toString(sec1));
            }
            else if(sec1==0){
                sec1=59;
                min1--;
                sec.setText(Integer.toString(sec1));
                sec1--;
            }
            else{  sec.setText(Integer.toString(sec1));
                sec1--;
            }
            if(min1==0 && hour1>0){
                hour1--;
                min1=59;
                min.setText("0"+Integer.toString(min1)+":");


            }
            else if(min1<10 && min1>=0){
                min.setText("0"+Integer.toString(min1)+":");
            }
            else {

                min.setText(Integer.toString(min1)+":");
            }

            if(hour1<10){
                hour.setText("0"+Integer.toString(hour1)+":");
            }
            else{
                hour.setText(Integer.toString(hour1)+":");
            }



            v++;
            s++;



        }

        @Override
        public void onFinish() {

            mysong.start();

        }
    }



    @Override
    public void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("hour",hour1);
        outState.putInt("min",min1);
        outState.putInt("sec",sec1);
        outState.putInt("var1",var);
        outState.putInt("rotate1",rotate);
        outState.putInt("a1",pop);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.start);


        min=findViewById(R.id.min);
        sec=findViewById(R.id.sec);
        hour=findViewById(R.id.hour);
        button=findViewById(R.id.stop);
        button.setEnabled(false);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var=1;

                    button=findViewById(R.id.stop);
                    mysong=MediaPlayer.create(MainActivity.this,R.raw.weep);
                    button.setEnabled(true);

                    min=findViewById(R.id.min);
                    sec=findViewById(R.id.sec);
                    hour=findViewById(R.id.hour);

                    val=findViewById(R.id.again);
                    val.setText("start");
                    upto =findViewById(R.id.upto);
                    upto.setEnabled(false);

                    btn.setEnabled(false);
                    String p=upto.getText().toString();
                    arr=p.split(":");

                    if(arr.length==1){
                        arr[1]="0";
                    }
                    a=Integer.parseInt(arr[0]);
                    b=Integer.parseInt(arr[1]);


                    int mp=a;


                    hour1=a;


                    if(b==0){
                        b=1;
                    }
                a=((((mp*60)+b)*60)+1)*1000;
                    pop=a;
                    min1=--b;
                    Toast.makeText(getApplicationContext(),""+a,Toast.LENGTH_SHORT).show();












                    count=new CountDownTimerClass(a,1000);
                    count.start();





                }

        });
        if(savedInstanceState!=null ){





            Toast.makeText(getApplicationContext(),""+pop,Toast.LENGTH_SHORT).show();

            hour1=savedInstanceState.getInt("hour");
            min1=savedInstanceState.getInt("min");
            sec1=savedInstanceState.getInt("sec");
            var=savedInstanceState.getInt("var1");
            rotate=savedInstanceState.getInt("rotate1");
            pop=savedInstanceState.getInt("a1");
            pop-=1000;



            if(var==1){
                rotate=1;
                if(hour1<10){
                    hour.setText("0"+Integer.toString(hour1)+":");

                }
                else{
                    hour.setText(Integer.toString(hour1)+":");
                }
                if(min1<10){
                    min.setText("0"+Integer.toString(min1)+":");
                }
                else{
                    min.setText(Integer.toString(min1)+":");
                }
                if(sec1<10){
                    sec.setText("0"+Integer.toString(sec1));
                }
                else{
                    sec.setText(Integer.toString(sec1));
                }
                if(min1==0 && sec1==0 && hour1==0){
                    mysong=MediaPlayer.create(MainActivity.this,R.raw.weep);
                }
                btn=findViewById(R.id.start);
                btn.setEnabled(false);
                button=findViewById(R.id.stop);
                button.setEnabled(true);
                upto =findViewById(R.id.upto);
                upto.setEnabled(false);

                count=new CountDownTimerClass(a,1000);
                count.start();

            }
            else{
                min.setText("00"+":");
                hour.setText("00"+":");
                sec.setText("00");
                button=findViewById(R.id.stop);
                button.setEnabled(false);

            }



        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var=0;
                if(rotate==1){

                    sec.setText("00");
                    min.setText("00:");
                    hour.setText("00:");
                    count.cancel();
                    min1 = 59;
                    sec1 = 60;
                    btn=findViewById(R.id.start);
                    btn.setEnabled(true);
                    button=findViewById(R.id.stop);
                    button.setEnabled(false);
                    upto =findViewById(R.id.upto);
                    upto.setEnabled(true);




                }

                else{
                    button.setEnabled(false);
                    mysong.stop();
                    sec.setText("00");
                    min.setText("00:");
                    hour.setText("00:");
                    count.cancel();
                    min1 = 59;
                    sec1 = 60;
                    btn.setEnabled(true);
                    upto.setEnabled(true);
                    val.setText("Reset");


                }


                }


        });




    }

}