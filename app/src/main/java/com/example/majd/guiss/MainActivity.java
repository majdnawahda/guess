package com.example.majd.guiss;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {
    Button b;
    int x,num;
    TextView t;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r=new Random();
        num=r.nextInt(100);
    }

   public void click(View view)
   {

       //b=(Button)findViewById(R.id.B1);

       t=(TextView)findViewById(R.id.T1);
       s=t.getText().toString();
       x=Integer.parseInt(s);

       if(x==num)
       {
           Toast.makeText(getApplicationContext(),"Congratulations this is True", Toast.LENGTH_LONG).show();
       }
       else
       if(x>num)
       {
           if(x-num<=10) {
               Toast.makeText(getApplicationContext(), "very closed", Toast.LENGTH_SHORT).show();
           }
           Toast.makeText(getApplicationContext(),"guess less than it", Toast.LENGTH_LONG).show();
       }
       else
       if(x<num)
       {
           if(num-x<=10) {
               Toast.makeText(getApplicationContext(), "very closed", Toast.LENGTH_SHORT).show();
           }
           Toast.makeText(getApplicationContext(),"guess grater than it", Toast.LENGTH_LONG).show();
       }
       else if(x<num)
       {

       }
       else if(x<num)
       {
           Toast.makeText(getApplicationContext(),"guess grater than it", Toast.LENGTH_LONG).show();
       }



   }

}
