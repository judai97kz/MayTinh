package com.Judai.MayTInh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    private Button n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,cong;
    private Button tru,nhan,chia,bang,xoa,del,cham,pow,sqrt,am,ans,sqr,noa;
    private EditText tv,tv2;
    double sum=0,minus=0,division=0,multi=0,pow1=0;
    double sqrt1=0,dem =0,sqr1=0;
    int sumd=0,minusd=0,divisiond=0,multid=0,powd=0,sqrtd=0,sqrd=0;
    Context context;

    private static long themso(int so,String c)
    {
        long e = Long.parseLong(c);
        if(c.length()<19)
        {
            if(e == 0)
            {
               return so;
            }
            if(e < 0)
            {
                return -1*(e*-10 +so);
            }
            return e*10+so;
        }
       return e;
    }
    private static double themsothuc(int so,String c)
    {
        String lastc = c.substring(c.length() - 1);
        c=c.concat(""+so);
        double st = Double.parseDouble(c);
        return st;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        tv = (EditText)findViewById(R.id.ed1);
        tv2=(EditText)findViewById(R.id.ed2);
        n0 =(Button)findViewById(R.id.n0);
        n1 =(Button)findViewById(R.id.n1);
        n2 =(Button)findViewById(R.id.n2);
        n3 =(Button)findViewById(R.id.n3);
        n4 =(Button)findViewById(R.id.n4);
        n5 =(Button)findViewById(R.id.n5);
        n6 =(Button)findViewById(R.id.n6);
        n7 =(Button)findViewById(R.id.n7);
        n8 =(Button)findViewById(R.id.n8);
        n9 =(Button)findViewById(R.id.n9);
        cong =(Button)findViewById(R.id.cong);
        tru =(Button)findViewById(R.id.tru);
        nhan =(Button)findViewById(R.id.nhan);
        chia =(Button)findViewById(R.id.chia);
        bang =(Button)findViewById(R.id.bang);
        xoa =(Button)findViewById(R.id.xoa);
        del =(Button)findViewById(R.id.del);
        cham =(Button)findViewById(R.id.cham);
        pow=(Button)findViewById(R.id.pow);
        sqrt=(Button)findViewById(R.id.sqrt);
        am=(Button)findViewById(R.id.am);
        ans=(Button)findViewById(R.id.ans);
        noa=(Button)findViewById(R.id.no);
        sqr=(Button)findViewById(R.id.sqr);
        tv.setText(""+0);
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(0,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(0,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(1,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(1,tv.getText().toString());
                    tv.setText("" + a);

                }

            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(2,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(2,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(3,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(3,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(4,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(4,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(5,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(5,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(6,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(6,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(7,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(7,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(8,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(8,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains(".")==true)
                {
                    double st = themsothuc(9,c);
                    tv.setText(""+st);
                }
                else {
                    long a =  themso(9,tv.getText().toString());
                    tv.setText("" + a);

                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a  = Double.parseDouble(tv.getText().toString());
                sum = a;
                sumd =1;
                tv2.setText("+");
                tv.setText(""+0);
            }
        });
       tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a  = Double.parseDouble(tv.getText().toString());
                minus = a;
                minusd=1;
                tv2.setText("-");
                tv.setText(""+0);
            }
        });
       nhan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               long a  = Long.parseLong(tv.getText().toString());
                multi = a;
                multid=1;
               tv2.setText("*");
               tv.setText(""+0);
           }
       });
       chia.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double a  = Double.parseDouble(tv.getText().toString());
               division = a;
               divisiond=1;
               tv2.setText("/");
               tv.setText(""+0);
           }
       });
       pow.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double a  = Double.parseDouble(tv.getText().toString());
               pow1 = a;
               powd = 1;
               tv2.setText("^");
               tv.setText(""+0);
           }
       });
       sqrt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double a  = Double.parseDouble(tv.getText().toString());
               sqrt1 = a;
               sqrtd = 1;
               tv2.setText("sqrt");
               tv.setText(""+0);
           }
       });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a  = Double.parseDouble(tv.getText().toString());
                dem =a;
                if(sumd > 0)
                {
                    sum =sum + a;
                    sum = Math.round(sum*100);
                    sum = sum/100;
                    tv2.setText("");
                    tv.setText(""+sum);
                    dem=0;
                    sum=0;
                    sumd=0;
                }
                if(minusd > 0)
                {
                    minus= minus - a;
                    minus = Math.round(minus*100);
                    minus = minus /100;
                    tv.setText(""+minus);
                    tv2.setText("");
                    dem=minus;
                    minus=0;
                    minusd=0;
                }
                if(multid > 0)
                {
                    multi= multi * a;
                    tv.setText(""+multi);
                    tv2.setText("");
                    dem=multi;
                    multi=0;
                    multid=0;
                }
                if(divisiond > 0)
                {
                    division= division / a;
                    tv.setText(""+division);
                    tv2.setText("");
                    dem=division;
                    division=0;
                    divisiond=0;
                }
                if(powd>0)
                {

                    pow1=Math.pow(pow1,a);
                    tv.setText(""+pow1);
                    tv2.setText("");
                    dem=pow1;
                    pow1=0;
                    powd=0;
                }
                if(sqrtd>0)
                {
                    if (sqrt1 < 0 )
                    {
                        tv.setText("Cannot Caculation");
                    }
                    else
                    {
                        sqrt1 =(long) Math.sqrt(a);
                        tv.setText(""+sqrt1);
                        tv2.setText("");
                        dem=(long) sqrt1;
                        sqrt1=0;
                        sqrtd=0;
                    }

                }
                if(sqrd>0)
                {
                    double c = Double.parseDouble(tv.getText().toString());
                    int y =(int) sqr1%2;
                    tv.setText(""+y);
                    if(sqr1%2==0)
                    {
                        if(c < 0 )
                        {
                            Toast.makeText(MainActivity.this,"Không hợp lệ",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            sqr1 = Math.pow(c,1/sqr1);
                            sqr1 = Math.round(sqr1*100);
                            sqr1 = sqr1/100;
                            tv.setText(""+sqr1);
                            tv2.setText("");
                            dem=sqr1;
                            sqr1=0;
                            sqrd=0;
                        }
                    }
                    else
                    {
                        sqr1 = Math.pow(c,1/sqr1);
                        sqr1 = Math.round(sqr1*100);
                        sqr1 = sqr1/100;
                        tv.setText(""+sqr1);
                        tv2.setText("");
                        dem=sqr1;
                        sqr1=0;
                        sqrd=0;
                    }
                }
            }
        });
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b = tv.getText().toString();
                if (b != null && b.length() > 1 ) {
                    tv.setText(xoa(b));
                }
                else
                {
                    tv.setText(""+0);
                }

            }
        });
        del.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tv2.setText("");
            tv.setText(""+0);
        }
    });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c=tv.getText().toString();
                if (c.contains(".")==true)
                {
                   c= c.concat("");
                   Toast.makeText(MainActivity.this,"Không hợp lệ",Toast.LENGTH_SHORT).show();
                   tv.setText(""+c);
                }
                else {
                    c = c.concat(".");
                    tv.setText(c);
                }
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c=tv.getText().toString();
                if(c.contains("-")==true)
                {
                    c = c.substring(1);
                    tv.setText(""+c);
                }
                else
                {
                    String dautru = "-";
                    c=dautru.concat(c);
                    tv.setText(c);
                }
            }
        });
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(""+dem);
                tv2.setText("Ans");
            }
        });
        noa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Nút này chưa có gì đâu , ấn làm gì :v",Toast.LENGTH_SHORT).show();
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tv.getText().toString();
                if(c.contains("0")==true)
                {
                    Toast.makeText(MainActivity.this,"a -> (sqr) -> b -> = !",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    sqr1 = Double.parseDouble(c);
                    sqrd=1;
                    tv.setText(""+0);
                    tv2.setText("sqr");
                }
            }
        });
    }

    private static String xoa(String str) {
        return str.substring(0, str.length() - 1);
    }


}