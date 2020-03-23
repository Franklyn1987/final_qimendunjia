package com.example.final_qimendunjia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32,textView33,textView34,textView35,textView36,textView37,textView38,textView39,textView40,textView41,textView42,textView43,textView44,textView45,textView46,textView47,textView48,textView49,textView50,textView51,textView52,textView53,textView54;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);
        textView21 = findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24=findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26=findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28=findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30=findViewById(R.id.textView30);
        textView31 = findViewById(R.id.textView31);
        textView32=findViewById(R.id.textView32);
        textView33 = findViewById(R.id.textView33);
        textView34=findViewById(R.id.textView34);
        textView35 = findViewById(R.id.textView35);
        textView36=findViewById(R.id.textView36);
        textView37 = findViewById(R.id.textView37);
        textView38=findViewById(R.id.textView38);
        textView39 = findViewById(R.id.textView39);
        textView40=findViewById(R.id.textView40);
        textView41 = findViewById(R.id.textView41);
        textView42=findViewById(R.id.textView42);
        textView43 = findViewById(R.id.textView43);
        textView44=findViewById(R.id.textView44);
        textView45 = findViewById(R.id.textView45);
        textView46=findViewById(R.id.textView46);
        textView47 = findViewById(R.id.textView47);
        textView48=findViewById(R.id.textView48);
        textView49 = findViewById(R.id.textView49);
        textView50=findViewById(R.id.textView50);
        textView51 = findViewById(R.id.textView51);
        textView52=findViewById(R.id.textView52);
        textView53 = findViewById(R.id.textView53);
        textView54=findViewById(R.id.textView54);
        //设置点击时间
        button.setOnClickListener(new MyButton());



        //

    }
    private class MyButton implements View.OnClickListener {
        public void onClick(View v){
            switch(v.getId()){
                case R.id.button:
                    String jieguo[][]=zidongjisuan();
                    textView47.setText(jieguo[4][0]);
                    textView46.setText(jieguo[3][0]);
                    textView45.setText(jieguo[2][0]);
                    textView44.setText(jieguo[1][0]);
                    textView43.setText(jieguo[0][0]);
                    //
                    textView17.setText(jieguo[4][1]);
                    textView16.setText(jieguo[3][1]);
                    textView15.setText(jieguo[2][1]);
                    textView14.setText(jieguo[1][1]);
                    textView13.setText(jieguo[0][1]);
                    //
                    textView23.setText(jieguo[4][2]);
                    textView22.setText(jieguo[3][2]);
                    textView21.setText(jieguo[2][2]);
                    textView20.setText(jieguo[1][2]);
                    textView19.setText(jieguo[0][2]);
                    //
                    textView5.setText(jieguo[4][3]);
                    textView4.setText(jieguo[3][3]);
                    textView3.setText(jieguo[2][3]);
                    textView2.setText(jieguo[1][3]);
                    textView.setText(jieguo[0][3]);
                    //
                    textView29.setText(jieguo[4][4]);
                    textView28.setText(jieguo[3][4]);
                    textView27.setText(jieguo[2][4]);
                    textView26.setText(jieguo[1][4]);
                    textView25.setText(jieguo[0][4]);
                    //
                    textView53.setText(jieguo[4][5]);
                    textView52.setText(jieguo[3][5]);
                    textView51.setText(jieguo[2][5]);
                    textView50.setText(jieguo[1][5]);
                    textView49.setText(jieguo[0][5]);
                    //
                    textView35.setText(jieguo[4][6]);
                    textView34.setText(jieguo[3][6]);
                    textView33.setText(jieguo[2][6]);
                    textView32.setText(jieguo[1][6]);
                    textView31.setText(jieguo[0][6]);
                    //
                    textView41.setText(jieguo[4][7]);
                    textView40.setText(jieguo[3][7]);
                    textView39.setText(jieguo[2][7]);
                    textView38.setText(jieguo[1][7]);
                    textView37.setText(jieguo[0][7]);
                    //
                    textView11.setText(jieguo[4][8]);
                    textView10.setText(jieguo[3][8]);
                    textView9.setText(jieguo[2][8]);
                    textView8.setText(jieguo[1][8]);
                    textView7.setText(jieguo[0][8]);
                    break;

                //                    break;
            }

        }
    }
    //    函数主体
    private String run(){
        String s = "qw789" ;
        return s ;

    }
    private static String yuan(String rigan){
        String s="";
        switch (rigan){
            case "甲子":
                s= "上元";
                break;
            case "乙丑":
                s= "上元";
                break;
            case "丙寅":
                s= "上元";
                break;
            case "丁卯":
                s= "上元";
                break;
            case "戊辰":
                s= "上元";
                break;
        }
        switch (rigan){
            case "己巳":
                s= "中元";
                break;
            case "庚午":
                s= "中元";
                break;
            case "辛未":
                s= "中元";
                break;
            case "壬申":
                s= "中元";
                break;
            case "癸酉":
                s= "中元";
                break;
        }
        switch (rigan){
            case "甲戌":
                s= "下元";
                break;
            case "乙亥":
                s= "下元";
                break;
            case "丙子":
                s= "下元";
                break;
            case "丁丑":
                s= "下元";
                break;
            case "戊寅":
                s= "下元";
                break;
        }
        switch (rigan){
            case "己卯":
                s= "上元";
                break;
            case "庚辰":
                s= "上元";
                break;
            case "辛巳":
                s= "上元";
                break;
            case "壬午":
                s= "上元";
                break;
            case "癸未":
                s= "上元";
                break;
        }
        switch (rigan){
            case "甲申":
                s= "中元";
                break;
            case "乙酉":
                s= "中元";
                break;
            case "丙戌":
                s= "中元";
                break;
            case "丁亥":
                s= "中元";
                break;
            case "戊子":
                s= "中元";
                break;
        }
        switch (rigan){
            case "己丑":
                s= "下元";
                break;
            case "庚寅":
                s= "下元";
                break;
            case "辛卯":
                s= "下元";
                break;
            case "壬辰":
                s= "下元";
                break;
            case "癸巳":
                s= "下元";
                break;
        }
        switch (rigan){
            case "甲午":
                s= "上元";
                break;
            case "乙未":
                s= "上元";
                break;
            case "丙申":
                s= "上元";
                break;
            case "丁酉":
                s= "上元";
                break;
            case "戊戌":
                s= "上元";
                break;
        }
        switch (rigan){
            case "己亥":
                s= "中元";
                break;
            case "庚子":
                s= "中元";
                break;
            case "辛丑":
                s= "中元";
                break;
            case "壬寅":
                s= "中元";
                break;
            case "癸卯":
                s= "中元";
                break;
        }

        switch (rigan){
            case "甲辰":
                s= "下元";
                break;
            case "乙巳":
                s= "下元";
                break;
            case "丙午":
                s= "下元";
                break;
            case "丁未":
                s= "下元";
                break;
            case "戊申":
                s= "下元";
                break;
        }

        switch (rigan){
            case "己酉":
                s= "上元";
                break;
            case "庚戌":
                s= "上元";
                break;
            case "辛亥":
                s= "上元";
                break;
            case "壬子":
                s= "上元";
                break;
            case "癸丑":
                s= "上元";
                break;
        }

        switch (rigan){
            case "甲寅":
                s= "中元";
                break;
            case "乙卯":
                s= "中元";
                break;
            case "丙辰":
                s= "中元";
                break;
            case "丁巳":
                s= "中元";
                break;
            case "戊午":
                s= "中元";
                break;
        }

        switch (rigan){
            case "己未":
                s= "下元";
                break;
            case "庚申":
                s= "下元";
                break;
            case "辛酉":
                s= "下元";
                break;
            case "壬戌":
                s= "下元";
                break;
            case "癸亥":
                s= "下元";
                break;
        }
        return s ;
    }
    private static String yongju(String jieqi,String rigan) {
        String q = "";
        String key2=yuan(rigan);
        if (jieqi.equals("冬至")&&key2.equals("上元")) {
            q="阳遁一局";
        }
        if (jieqi.equals("冬至") && yuan(rigan).equals("中元")) {
            q="阳遁七局";
        }
        if (jieqi.equals("冬至") && yuan(rigan).equals("下元")) {
            q="阳遁四局";
        }
        if (jieqi.equals("小寒") && yuan(rigan).equals("上元"))
            q="阳遁二局";
        if (jieqi.equals("小寒") && yuan(rigan).equals("中元")) {
            q="阳遁八局";
        }
        if (jieqi.equals("小寒") && yuan(rigan).equals("下元")) {
            q="阳遁五局";
        }
        if (jieqi.equals("大寒") && yuan(rigan).equals("上元")) {
            q="阳遁三局";
        }
        if (jieqi.equals("大寒") && yuan(rigan).equals("中元")) {
            q="阳遁九局";
        }
        if (jieqi.equals("大寒") && yuan(rigan).equals("下元")) {
            q="阳遁六局";
        }
        //
        if (jieqi.equals("立春") && yuan(rigan).equals("上元")){
            q="阳遁八局";
        }
        if (jieqi.equals("立春") && yuan(rigan).equals("中元")){
            q="阳遁五局";
        }
        if (jieqi.equals("立春") && yuan(rigan).equals("下元")){
            q="阳遁二局";
        }
        if (jieqi.equals("雨水") && yuan(rigan).equals("上元")){
            q="阳遁九局";
        }
        if (jieqi.equals("雨水") && yuan(rigan).equals("中元")){
            q="阳遁六局";
        }
        if (jieqi.equals("雨水") && yuan(rigan).equals("下元")){
            q="阳遁三局";
        }
        if (jieqi.equals("惊蛰") && yuan(rigan).equals("上元")){
            q="阳遁一局";
        }
        if (jieqi.equals("惊蛰") && yuan(rigan).equals("中元")){
            q="阳遁七局";
        }
        if (jieqi.equals("惊蛰") && yuan(rigan).equals("下元")){
            q="阳遁四局";
        }
        if (jieqi.equals("春分") && yuan(rigan).equals("上元")){
            q="阳遁三局";
        }
        if (jieqi.equals("春分") && yuan(rigan).equals("中元")){
            q="阳遁九局";
        }
        if (jieqi.equals("春分") && yuan(rigan).equals("下元")){
            q="阳遁六局";
        }
        if (jieqi.equals("清明") && yuan(rigan).equals("上元")){
            q="阳遁四局";
        }
        if (jieqi.equals("清明") && yuan(rigan).equals("中元")){
            q="阳遁一局";
        }
        if (jieqi.equals("清明") && yuan(rigan).equals("下元")){
            q="阳遁七局";
        }
        if (jieqi.equals("谷雨") && yuan(rigan).equals("上元")){
            q="阳遁五局";
        }
        if (jieqi.equals("谷雨") && yuan(rigan).equals("中元")){
            q="阳遁二局";
        }
        if (jieqi.equals("谷雨") && yuan(rigan).equals("下元")){
            q="阳遁八局";
        }
        if (jieqi.equals("立夏") && yuan(rigan).equals("上元")){
            q="阳遁四局";
        }
        if (jieqi.equals("立夏") && yuan(rigan).equals("中元")){
            q="阳遁一局";
        }
        if (jieqi.equals("立夏") && yuan(rigan).equals("下元")){
            q="阳遁七局";
        }
        if (jieqi.equals("小满") && yuan(rigan).equals("上元")){
            q="阳遁五局";
        }
        if (jieqi.equals("小满") && yuan(rigan).equals("中元")){
            q="阳遁二局";
        }
        if (jieqi.equals("小满") && yuan(rigan).equals("下元")){
            q="阳遁八局";
        }
        if (jieqi.equals("芒种") && yuan(rigan).equals("上元")){
            q="阳遁六局";
        }
        if (jieqi.equals("芒种") && yuan(rigan).equals("中元")){
            q="阳遁三局";
        }
        if (jieqi.equals("芒种") && yuan(rigan).equals("下元")){
            q="阳遁九局";
        }
        if (jieqi.equals("夏至") && yuan(rigan).equals("上元")){
            q="阴遁九局";
        }
        if (jieqi.equals("夏至") && yuan(rigan).equals("中元")){
            q="阴遁三局";
        }
        if (jieqi.equals("夏至") && yuan(rigan).equals("下元")){
            q="阴遁六局";
        }
        if (jieqi.equals("小暑") && yuan(rigan).equals("上元")){
            q="阴遁八局";
        }
        if (jieqi.equals("小暑") && yuan(rigan).equals("中元")){
            q="阴遁二局";
        }
        if (jieqi.equals("小暑") && yuan(rigan).equals("下元")){
            q="阴遁五局";
        }
        if (jieqi.equals("大暑") && yuan(rigan).equals("上元")){
            q="阴遁七局";
        }
        if (jieqi.equals("大暑") && yuan(rigan).equals("中元")){
            q="阴遁一局";
        }
        if (jieqi.equals("大暑") && yuan(rigan).equals("下元")){
            q="阴遁四局";
        }
        if (jieqi.equals("立秋") && yuan(rigan).equals("上元")){
            q="阴遁二局";
        }
        if (jieqi.equals("立秋") && yuan(rigan).equals("中元")){
            q="阴遁五局";
        }
        if (jieqi.equals("立秋") && yuan(rigan).equals("下元")){
            q="阴遁八局";
        }
        if (jieqi.equals("处暑") && yuan(rigan).equals("上元")){
            q="阴遁一局";
        }
        if (jieqi.equals("处暑") && yuan(rigan).equals("中元")){
            q="阴遁四局";
        }
        if (jieqi.equals("处暑") && yuan(rigan).equals("下元")){
            q="阴遁七局";
        }
        if (jieqi.equals("白露") && yuan(rigan).equals("上元")){
            q="阴遁九局";
        }
        if (jieqi.equals("白露") && yuan(rigan).equals("中元")){
            q="阴遁三局";
        }
        if (jieqi.equals("白露") && yuan(rigan).equals("下元")){
            q="阴遁六局";
        }
        if (jieqi.equals("秋分") && yuan(rigan).equals("上元")){
            q="阴遁七局";
        }
        if (jieqi.equals("秋分") && yuan(rigan).equals("中元")){
            q="阴遁一局";
        }
        if (jieqi.equals("秋分") && yuan(rigan).equals("下元")){
            q="阴遁四局";
        }
        if (jieqi.equals("寒露") && yuan(rigan).equals("上元")){
            q="阴遁六局";
        }
        if (jieqi.equals("寒露") && yuan(rigan).equals("中元")){
            q="阴遁九局";
        }
        if (jieqi.equals("寒露") && yuan(rigan).equals("下元")){
            q="阴遁三局";
        }
        if (jieqi.equals("霜降") && yuan(rigan).equals("上元")){
            q="阴遁五局";
        }
        if (jieqi.equals("霜降") && yuan(rigan).equals("中元")){
            q="阴遁八局";
        }
        if (jieqi.equals("霜降") && yuan(rigan).equals("下元")){
            q="阴遁二局";
        }
        if (jieqi.equals("立冬") && yuan(rigan).equals("上元")){
            q="阴遁六局";
        }
        if (jieqi.equals("立冬") && yuan(rigan).equals("中元")){
            q="阴遁九局";
        }
        if (jieqi.equals("立冬") && yuan(rigan).equals("下元")){
            q="阴遁三局";
        }
        if (jieqi.equals("小雪") && yuan(rigan).equals("上元")){
            q="阴遁五局";
        }
        if (jieqi.equals("小雪") && yuan(rigan).equals("中元")){
            q="阴遁八局";
        }
        if (jieqi.equals("小雪") && yuan(rigan).equals("下元")){
            q="阴遁二局";
        }
        if (jieqi.equals("大雪") && yuan(rigan).equals("上元")){
            q="阴遁四局";
        }
        if (jieqi.equals("大雪") && yuan(rigan).equals("中元")){
            q="阴遁七局";
        }
        if (jieqi.equals("大雪") && yuan(rigan).equals("下元")){
            q="阴遁一局";
        }




        //
        return q;
    }
    private static String xunshou(String shigan){
        String x="";
        if (shigan.equals("乙丑") || shigan.equals("丙寅") || shigan.equals("丁卯") || shigan.equals("己巳") || shigan.equals("庚午") || shigan.equals("辛未") || shigan.equals("壬申") || shigan.equals("癸酉") || shigan.equals("甲子") || shigan.equals("戊辰")){
            x="戊";
        }
        if (shigan.equals("甲戌") || shigan.equals("乙亥") || shigan.equals("丙子") || shigan.equals("丁丑") || shigan.equals("戊寅") || shigan.equals("己卯") || shigan.equals("庚辰") || shigan.equals("辛巳") || shigan.equals("壬午") || shigan.equals("癸未")){
            x="己";
        }
        if (shigan.equals("甲申") || shigan.equals("乙酉") || shigan.equals("丙戌") || shigan.equals("丁亥") || shigan.equals("戊子") || shigan.equals("己丑") || shigan.equals("庚寅") || shigan.equals("辛卯") || shigan.equals("壬辰") || shigan.equals("癸巳")){
            x="庚";
        }
        if (shigan.equals("甲午") || shigan.equals("乙未") || shigan.equals("丙申") || shigan.equals("丁酉") || shigan.equals("戊戌") || shigan.equals("己亥") || shigan.equals("庚子") || shigan.equals("辛丑") || shigan.equals("壬寅") || shigan.equals("癸卯")){
            x="辛";
        }
        if (shigan.equals("甲辰") || shigan.equals("乙巳") || shigan.equals("丙午") || shigan.equals("丁未") || shigan.equals("戊申") || shigan.equals("己酉") || shigan.equals("庚戌") || shigan.equals("辛亥") || shigan.equals("壬子") || shigan.equals("癸丑")){
            x="壬";
        }
        if (shigan.equals("甲寅") || shigan.equals("乙卯") || shigan.equals("丙辰") || shigan.equals("丁巳") || shigan.equals("戊午") || shigan.equals("己未") || shigan.equals("庚申") || shigan.equals("辛酉") || shigan.equals("壬戌") || shigan.equals("癸亥")){
            x="癸";
        }
        return x;
    }
    private static String[] dipan(String shigan,String rigan,String jieqi){
        String ju=yongju(jieqi,rigan);
        String [] pan = new String [9];
        if (ju.equals("阳遁一局")){
            pan=new String[] {"戊","己","庚","辛","壬","癸","丁","丙","乙"};
        }
        if (ju.equals("阳遁二局")){
            pan=new String[] {"乙","戊","己","庚","辛","壬","癸","丁","丙"};
        }
        if (ju.equals("阳遁三局")){
            pan=new String[] {"丙","乙","戊","己","庚","辛","壬","癸","丁"};
        }
        if (ju.equals("阳遁四局")){
            pan=new String[] {"丁","丙","乙","戊","己","庚","辛","壬","癸"};
        }
        if (ju.equals("阳遁五局")){
            pan=new String[] {"癸","丁","丙","乙","戊","己","庚","辛","壬"};
        }
        if (ju.equals("阳遁六局")){
            pan=new String[] {"壬","癸","丁","丙","乙","戊","己","庚","辛"};
        }
        if (ju.equals("阳遁七局")){
            pan=new String[] {"辛","壬","癸","丁","丙","乙","戊","己","庚"};
        }
        if (ju.equals("阳遁八局")){
            pan=new String[] {"庚","辛","壬","癸","丁","丙","乙","戊","己"};
        }
        if (ju.equals("阳遁九局")){
            pan=new String[] {"己","庚","辛","壬","癸","丁","丙","乙","戊"};
        }
        if (ju.equals("阴遁一局")){
            pan=new String[] {"戊","乙","丙","丁","癸","壬","辛","庚","己"};
        }
        if (ju.equals("阴遁二局")){
            pan=new String[] {"己","戊","乙","丙","丁","癸","壬","辛","庚"};
        }
        if (ju.equals("阴遁三局")){
            pan=new String[] {"庚","己","戊","乙","丙","丁","癸","壬","辛"};
        }
        if (ju.equals("阴遁四局")){
            pan=new String[] {"辛","庚","己","戊","乙","丙","丁","癸","壬"};
        }
        if (ju.equals("阴遁五局")){
            pan=new String[] {"壬","辛","庚","己","戊","乙","丙","丁","癸"};
        }
        if (ju.equals("阴遁六局")){
            pan=new String[] {"癸","壬","辛","庚","己","戊","乙","丙","丁"};
        }
        if (ju.equals("阴遁七局")){
            pan=new String[] {"丁","癸","壬","辛","庚","己","戊","乙","丙"};
        }
        if (ju.equals("阴遁八局")){
            pan=new String[] {"丙","丁","癸","壬","辛","庚","己","戊","乙"};
        }
        if (ju.equals("阴遁九局")){
            pan=new String[] {"乙","丙","丁","癸","壬","辛","庚","己","戊"};
        }
        return pan;
    }
    private static String[] zhifu(String shigan,String rigan,String jieqi){
        String futou=xunshou(shigan);
        String[] dipanx=dipan(shigan,rigan,jieqi);
        String [] arr = new String[2];
        String zhifu="";
        String zhishi="";
        int gong=100;
        for (int x=0;x<9;x++){
            if (dipanx[x].equals(futou)){
                gong=x;
            }
        }

        if (gong==0){
            zhishi="休";
        }
        if (gong==1){
            zhishi="死";
        }
        if (gong==2){
            zhishi="伤";
        }
        if (gong==3){
            zhishi="杜";
        }
        if (gong==4){
            zhishi="中";
        }
        if (gong==5){
            zhishi="开";
        }
        if (gong==6){
            zhishi="惊";
        }
        if (gong==7){
            zhishi="生";
        }
        if (gong==8){
            zhishi="景";
        }
        if (gong==0){
            zhifu="蓬";
        }
        if (gong==1){
            zhifu="芮";
        }
        if (gong==2){
            zhifu="冲";
        }
        if (gong==3){
            zhifu="辅";
        }
        if (gong==4){
            zhifu="禽";
        }
        if (gong==5){
            zhifu="心";
        }
        if (gong==6){
            zhifu="柱";
        }
        if (gong==7){
            zhifu="任";
        }
        if (gong==8){
            zhifu="英";
        }
        arr[0] =zhifu;
        arr[1] =zhishi;

        return arr;
    }
    private static String[] xingpan(String shigan,String rigan,String jieqi){
        String shi=shigan.substring(0, 1);
        String[] xingpan_list=new String[9];
        int gong=100;
        if (shigan.substring(0,2).equals("甲子")){
            shi="戊";
        }
        if (shigan.substring(0,2).equals("甲戌")){
            shi="己";
        }
        if (shigan.substring(0,2).equals("甲申")){
            shi="庚";
        }
        if (shigan.substring(0,2).equals("甲午")){
            shi="辛";
        }
        if (shigan.substring(0,2).equals("甲辰")){
            shi="壬";
        }
        if (shigan.substring(0,2).equals("甲寅")){
            shi="癸";
        }
        String fu=zhifu(shigan,rigan,jieqi)[0];
        String shii=zhifu(shigan,rigan,jieqi)[1];
        String[] di=dipan(shigan,rigan,jieqi);
        for (int x=0;x<9;x++) {
            if (di[x].equals(shi)){
                gong=x;
            }
        }
        if (yongju(jieqi,rigan).substring(0,2).equals("阳遁")){
            if ((gong==3 && fu.equals("蓬")) || (gong==8 && fu.equals("任")) || (gong==1 && fu.equals("冲")) || (gong==6 && fu.equals("辅")) || (gong==5 && fu.equals("英")) || (gong==0 && fu.equals("芮")) || (gong==7 && fu.equals("柱")) || (gong==2 && fu.equals("心")) || (gong==4 && fu.equals("冲")) || (gong==0 && fu.equals("禽"))){
                xingpan_list=new String[] {"芮","冲","心","蓬","禽","英","辅","柱","任"};
            }
            if ((gong==8 && fu.equals("蓬")) || (gong==1 && fu.equals("任")) || (gong==6 && fu.equals("冲")) || (gong==5 && fu.equals("辅")) || (gong==0 && fu.equals("英")) || (gong==7 && fu.equals("芮")) || (gong==2 && fu.equals("柱")) || (gong==3 && fu.equals("心")) || (gong==4 && fu.equals("任")) || (gong==7 && fu.equals("禽"))){
                xingpan_list=new String[] {"英","任","柱","心","禽","辅","冲","芮","蓬"};
            }
            if ((gong==1 && fu.equals("蓬")) || (gong==6 && fu.equals("任")) || (gong==5 && fu.equals("冲")) || (gong==0 && fu.equals("辅")) || (gong==7 && fu.equals("英")) || (gong==2 && fu.equals("芮")) || (gong==3 && fu.equals("柱")) || (gong==8 && fu.equals("心")) || (gong==4 && fu.equals("蓬")) || (gong==2 && fu.equals("禽"))){
                xingpan_list=new String[] {"辅","蓬","芮","柱","禽","冲","任","英","心"};
            }
            if ((gong==6 && fu.equals("蓬")) || (gong==5 && fu.equals("任")) || (gong==0 && fu.equals("冲")) || (gong==7 && fu.equals("辅")) || (gong==2 && fu.equals("英")) || (gong==3 && fu.equals("芮")) || (gong==8 && fu.equals("柱")) || (gong==1 && fu.equals("心")) || (gong==4 && fu.equals("心")) || (gong==3 && fu.equals("禽"))){
                xingpan_list=new String[] {"冲","心","英","芮","禽","任","蓬","辅","柱"};
            }
            if ((gong==5 && fu.equals("蓬")) || (gong==0 && fu.equals("任")) || (gong==7 && fu.equals("冲")) || (gong==2 && fu.equals("辅")) || (gong==3 && fu.equals("英")) || (gong==8 && fu.equals("芮")) || (gong==1 && fu.equals("柱")) || (gong==6 && fu.equals("心")) || (gong==4 && fu.equals("柱")) || (gong==8 && fu.equals("禽"))){
                xingpan_list=new String[] {"任","柱","辅","英","禽","蓬","心","冲","芮"};
            }
            if ((gong==0 && fu.equals("蓬")) || (gong==7 && fu.equals("任")) || (gong==2 && fu.equals("冲")) || (gong==3 && fu.equals("辅")) || (gong==8 && fu.equals("英")) || (gong==1 && fu.equals("芮")) || (gong==6 && fu.equals("柱")) || (gong==5 && fu.equals("心")) || (gong==4 && fu.equals("禽")) || (gong==4 && fu.equals("芮")) || (gong==1 && fu.equals("禽"))){
                xingpan_list=new String[] {"蓬","芮","冲","辅","禽","心","柱","任","英"};
            }
            if ((gong==7 && fu.equals("蓬")) || (gong==2 && fu.equals("任")) || (gong==3 && fu.equals("冲")) || (gong==8 && fu.equals("辅")) || (gong==1 && fu.equals("英")) || (gong==6 && fu.equals("芮")) || (gong==5 && fu.equals("柱")) || (gong==0 && fu.equals("心")) || (gong==4 && fu.equals("英")) || (gong==6 && fu.equals("禽"))){
                xingpan_list=new String[] {"心","英","任","冲","禽","柱","芮","蓬","辅"};
            }
            if ((gong==2 && fu.equals("蓬")) || (gong==3 && fu.equals("任")) || (gong==8 && fu.equals("冲")) || (gong==1 && fu.equals("辅")) || (gong==6 && fu.equals("英")) || (gong==5 && fu.equals("芮")) || (gong==0 && fu.equals("柱")) || (gong==7 && fu.equals("心")) || (gong==4 && fu.equals("辅")) || (gong==5 && fu.equals("禽"))){
                xingpan_list=new String[] {"柱","辅","蓬","任","禽","芮","英","心","冲"};
            }
        }
        //
        if (yongju(jieqi,rigan).substring(0,2).equals("阴遁")){
            if ((gong==3 && fu.equals("蓬")) || (gong==8 && fu.equals("任")) || (gong==1 && fu.equals("冲")) || (gong==6 && fu.equals("辅")) || (gong==5 && fu.equals("英")) || (gong==0 && fu.equals("芮")) || (gong==7 && fu.equals("柱")) || (gong==2 && fu.equals("心")) || (gong==4 && fu.equals("冲")) || (gong==0 && fu.equals("禽"))){
                xingpan_list=new String[] {"芮","冲","心","蓬","禽","英","辅","柱","任"};
            }
            if ((gong==8 && fu.equals("蓬")) || (gong==1 && fu.equals("任")) || (gong==6 && fu.equals("冲")) || (gong==5 && fu.equals("辅")) || (gong==0 && fu.equals("英")) || (gong==7 && fu.equals("芮")) || (gong==2 && fu.equals("柱")) || (gong==3 && fu.equals("心")) || (gong==4 && fu.equals("任")) || (gong==7 && fu.equals("禽"))){
                xingpan_list=new String[] {"英","任","柱","心","禽","辅","冲","芮","蓬"};
            }
            if ((gong==1 && fu.equals("蓬")) || (gong==6 && fu.equals("任")) || (gong==5 && fu.equals("冲")) || (gong==0 && fu.equals("辅")) || (gong==7 && fu.equals("英")) || (gong==2 && fu.equals("芮")) || (gong==3 && fu.equals("柱")) || (gong==8 && fu.equals("心")) || (gong==4 && fu.equals("蓬")) || (gong==2 && fu.equals("禽"))){
                xingpan_list=new String[] {"辅","蓬","芮","柱","禽","冲","任","英","心"};
            }
            if ((gong==6 && fu.equals("蓬")) || (gong==5 && fu.equals("任")) || (gong==0 && fu.equals("冲")) || (gong==7 && fu.equals("辅")) || (gong==2 && fu.equals("英")) || (gong==3 && fu.equals("芮")) || (gong==8 && fu.equals("柱")) || (gong==1 && fu.equals("心")) || (gong==4 && fu.equals("心")) || (gong==3 && fu.equals("禽"))){
                xingpan_list=new String[] {"冲","心","英","芮","禽","任","蓬","辅","柱"};
            }
            if ((gong==5 && fu.equals("蓬")) || (gong==0 && fu.equals("任")) || (gong==7 && fu.equals("冲")) || (gong==2 && fu.equals("辅")) || (gong==3 && fu.equals("英")) || (gong==8 && fu.equals("芮")) || (gong==1 && fu.equals("柱")) || (gong==6 && fu.equals("心")) || (gong==4 && fu.equals("柱")) || (gong==8 && fu.equals("禽"))){
                xingpan_list=new String[] {"任","柱","辅","英","禽","蓬","心","冲","芮"};
            }
            if ((gong==0 && fu.equals("蓬")) || (gong==7 && fu.equals("任")) || (gong==2 && fu.equals("冲")) || (gong==3 && fu.equals("辅")) || (gong==8 && fu.equals("英")) || (gong==1 && fu.equals("芮")) || (gong==6 && fu.equals("柱")) || (gong==5 && fu.equals("心")) || (gong==4 && fu.equals("禽")) || (gong==4 && fu.equals("芮"))  || (gong==1 && fu.equals("禽"))){
                xingpan_list=new String[] {"蓬","芮","冲","辅","禽","心","柱","任","英"};
            }
            if ((gong==7 && fu.equals("蓬")) || (gong==2 && fu.equals("任")) || (gong==3 && fu.equals("冲")) || (gong==8 && fu.equals("辅")) || (gong==1 && fu.equals("英")) || (gong==6 && fu.equals("芮")) || (gong==5 && fu.equals("柱")) || (gong==0 && fu.equals("心")) || (gong==4 && fu.equals("英")) || (gong==6 && fu.equals("禽"))){
                xingpan_list=new String[] {"心","英","任","冲","禽","柱","芮","蓬","辅"};
            }
            if ((gong==2 && fu.equals("蓬")) || (gong==3 && fu.equals("任")) || (gong==8 && fu.equals("冲")) || (gong==1 && fu.equals("辅")) || (gong==6 && fu.equals("英")) || (gong==5 && fu.equals("芮")) || (gong==0 && fu.equals("柱")) || (gong==7 && fu.equals("心")) || (gong==4 && fu.equals("辅")) || (gong==5 && fu.equals("禽"))){
                xingpan_list=new String[] {"柱","辅","蓬","任","禽","芮","英","心","冲"};
            }
        }
        return xingpan_list;
    }
    private static String[] menpan(String shigan,String rigan,String jieqi) {
        shigan = shigan.substring(0, 2);
        String[] men_list = new String[9];
        int zhishigong=100;
        int yiwei=100;
        int gongg=100;
        if (shigan.equals("甲子") || shigan.equals("甲戌") || shigan.equals("甲申") || shigan.equals("甲午") || shigan.equals("甲辰") || shigan.equals("甲寅")) {
            yiwei = 0;
        }
        if (shigan.equals("乙丑") || shigan.equals("乙亥") || shigan.equals("乙酉") || shigan.equals("乙未") || shigan.equals("乙巳") || shigan.equals("乙卯")) {
            yiwei = 1;
        }
        if (shigan.equals("丙寅") || shigan.equals("丙子") || shigan.equals("丙戌") || shigan.equals("丙申") || shigan.equals("丙午") || shigan.equals("丙辰")) {
            yiwei = 2;
        }
        if (shigan.equals("丁卯") || shigan.equals("丁丑") || shigan.equals("丁亥") || shigan.equals("丁酉") || shigan.equals("丁未") || shigan.equals("丁巳")) {
            yiwei = 3;
        }
        if (shigan.equals("戊辰") || shigan.equals("戊寅") || shigan.equals("戊子") || shigan.equals("戊戌") || shigan.equals("戊申") || shigan.equals("戊午")) {
            yiwei = 4;
        }
        if (shigan.equals("己巳") || shigan.equals("己卯") || shigan.equals("己丑") || shigan.equals("己亥") || shigan.equals("己酉") || shigan.equals("己未")) {
            yiwei = 5;
        }
        if (shigan.equals("庚午") || shigan.equals("庚辰") || shigan.equals("庚寅") || shigan.equals("庚子") || shigan.equals("庚戌") || shigan.equals("庚申")) {
            yiwei = 6;
        }
        if (shigan.equals("辛未") || shigan.equals("辛巳") || shigan.equals("辛卯") || shigan.equals("辛丑") || shigan.equals("辛亥") || shigan.equals("辛酉")) {
            yiwei = 7;
        }
        if (shigan.equals("壬申") || shigan.equals("壬午") || shigan.equals("壬辰") || shigan.equals("壬寅") || shigan.equals("壬子") || shigan.equals("壬戌")) {
            yiwei = 8;
        }
        if (shigan.equals("癸酉") || shigan.equals("癸未") || shigan.equals("癸巳") || shigan.equals("癸卯") || shigan.equals("癸丑") || shigan.equals("癸亥")) {
            yiwei = 9;
        }
        String zhishii = zhifu(shigan, rigan, jieqi)[1];
        if (yongju(jieqi, rigan).substring(0, 2).equals("阳遁")) {
            String[] di = dipan(shigan, rigan, jieqi);
            for (int x = 0; x < 9; x++) {
                if (xunshou(shigan).equals(di[x])) {
                    gongg = x;
                }
            }

            zhishigong = gongg + yiwei;
            if (zhishigong > 8) {
                zhishigong = zhishigong - 9;
            }
            if ((zhishii.equals("休") && zhishigong == 3) || (zhishii.equals("生") && zhishigong == 8) || (zhishii.equals("伤") && zhishigong == 1) || (zhishii.equals("杜") && zhishigong == 6) || (zhishii.equals("景") && zhishigong == 5) || (zhishii.equals("死") && zhishigong == 0) || (zhishii.equals("惊") && zhishigong == 7) || (zhishii.equals("开") && zhishigong == 2) || (zhishii.equals("伤") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 0)) {
                men_list = new String[]{"死", "伤", "开", "休", "中", "景", "杜", "惊", "生"};
            }
            if ((zhishii.equals("休") && zhishigong == 8) || (zhishii.equals("生") && zhishigong == 1) || (zhishii.equals("伤") && zhishigong == 6) || (zhishii.equals("杜") && zhishigong == 5) || (zhishii.equals("景") && zhishigong == 0) || (zhishii.equals("死") && zhishigong == 7) || (zhishii.equals("惊") && zhishigong == 2) || (zhishii.equals("开") && zhishigong == 3) || (zhishii.equals("生") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 7)) {
                men_list = new String[]{"景", "生", "惊", "开", "中", "杜", "伤", "死", "休"};
            }
            if ((zhishii.equals("休") && zhishigong == 1) || (zhishii.equals("生") && zhishigong == 6) || (zhishii.equals("伤") && zhishigong == 5) || (zhishii.equals("杜") && zhishigong == 0) || (zhishii.equals("景") && zhishigong == 7) || (zhishii.equals("死") && zhishigong == 2) || (zhishii.equals("惊") && zhishigong == 3) || (zhishii.equals("开") && zhishigong == 8) || (zhishii.equals("休") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 2)) {
                men_list = new String[]{"杜", "休", "死", "惊", "中", "伤", "生", "景", "开"};
            }
            if ((zhishii.equals("休") && zhishigong == 6) || (zhishii.equals("生") && zhishigong == 5) || (zhishii.equals("伤") && zhishigong == 0) || (zhishii.equals("杜") && zhishigong == 7) || (zhishii.equals("景") && zhishigong == 2) || (zhishii.equals("死") && zhishigong == 3) || (zhishii.equals("惊") && zhishigong == 8) || (zhishii.equals("开") && zhishigong == 1) || (zhishii.equals("开") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 3)) {
                men_list = new String[]{"伤", "开", "景", "死", "中", "生", "休", "杜", "惊"};
            }
            if ((zhishii.equals("休") && zhishigong == 5) || (zhishii.equals("生") && zhishigong == 0) || (zhishii.equals("伤") && zhishigong == 7) || (zhishii.equals("杜") && zhishigong == 2) || (zhishii.equals("景") && zhishigong == 3) || (zhishii.equals("死") && zhishigong == 8) || (zhishii.equals("惊") && zhishigong == 1) || (zhishii.equals("开") && zhishigong == 6) || (zhishii.equals("惊") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 8)) {
                men_list = new String[]{"生", "惊", "杜", "景", "中", "休", "开", "伤", "死"};
            }
            if ((zhishii.equals("休") && zhishigong == 0) || (zhishii.equals("生") && zhishigong == 7) || (zhishii.equals("伤") && zhishigong == 2) || (zhishii.equals("杜") && zhishigong == 3) || (zhishii.equals("景") && zhishigong == 8) || (zhishii.equals("死") && zhishigong == 1) || (zhishii.equals("惊") && zhishigong == 6) || (zhishii.equals("开") && zhishigong == 5) || (zhishii.equals("死") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 1)) {
                men_list = new String[]{"休", "死", "伤", "杜", "中", "开", "惊", "生", "景"};
            }
            if ((zhishii.equals("休") && zhishigong == 7) || (zhishii.equals("生") && zhishigong == 2) || (zhishii.equals("伤") && zhishigong == 3) || (zhishii.equals("杜") && zhishigong == 8) || (zhishii.equals("景") && zhishigong == 1) || (zhishii.equals("死") && zhishigong == 6) || (zhishii.equals("惊") && zhishigong == 5) || (zhishii.equals("开") && zhishigong == 0) || (zhishii.equals("景") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 6)) {
                men_list = new String[]{"开", "景", "生", "伤", "中", "惊", "死", "休", "杜"};
            }
            if ((zhishii.equals("休") && zhishigong == 2) || (zhishii.equals("生") && zhishigong == 3) || (zhishii.equals("伤") && zhishigong == 8) || (zhishii.equals("杜") && zhishigong == 1) || (zhishii.equals("景") && zhishigong == 6) || (zhishii.equals("死") && zhishigong == 5) || (zhishii.equals("惊") && zhishigong == 0) || (zhishii.equals("开") && zhishigong == 7) || (zhishii.equals("杜") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 5)) {
                men_list = new String[]{"惊", "杜", "休", "生", "中", "死", "景", "开", "伤"};
            }

            if (yongju(jieqi, rigan).substring(0, 2).equals("阴遁")) {
                di = dipan(shigan, rigan, jieqi);
                for (int x = 0; x < 9; x++) {
                    if (xunshou(shigan).equals(di[x])) {
                        gongg = x;
                    }
                }
                zhishigong = gongg - yiwei;
                if (zhishigong < 0) {
                    zhishigong = zhishigong + 9;
                }
                if ((zhishii.equals("休") && zhishigong == 3) || (zhishii.equals("生") && zhishigong == 8) || (zhishii.equals("伤") && zhishigong == 1) || (zhishii.equals("杜") && zhishigong == 6) || (zhishii.equals("景") && zhishigong == 5) || (zhishii.equals("死") && zhishigong == 0) || (zhishii.equals("惊") && zhishigong == 7) || (zhishii.equals("开") && zhishigong == 2) || (zhishii.equals("伤") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 0)) {
                    men_list = new String[]{"死", "伤", "开", "休", "中", "景", "杜", "惊", "生"};
                }
                if ((zhishii.equals("休") && zhishigong == 8) || (zhishii.equals("生") && zhishigong == 1) || (zhishii.equals("伤") && zhishigong == 6) || (zhishii.equals("杜") && zhishigong == 5) || (zhishii.equals("景") && zhishigong == 0) || (zhishii.equals("死") && zhishigong == 7) || (zhishii.equals("惊") && zhishigong == 2) || (zhishii.equals("开") && zhishigong == 3) || (zhishii.equals("生") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 7)) {
                    men_list = new String[]{"景", "生", "惊", "开", "中", "杜", "伤", "死", "休"};
                }
                if ((zhishii.equals("休") && zhishigong == 1) || (zhishii.equals("生") && zhishigong == 6) || (zhishii.equals("伤") && zhishigong == 5) || (zhishii.equals("杜") && zhishigong == 0) || (zhishii.equals("景") && zhishigong == 7) || (zhishii.equals("死") && zhishigong == 2) || (zhishii.equals("惊") && zhishigong == 3) || (zhishii.equals("开") && zhishigong == 8) || (zhishii.equals("休") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 2)) {
                    men_list = new String[]{"杜", "休", "死", "惊", "中", "伤", "生", "景", "开"};
                }
                if ((zhishii.equals("休") && zhishigong == 6) || (zhishii.equals("生") && zhishigong == 5) || (zhishii.equals("伤") && zhishigong == 0) || (zhishii.equals("杜") && zhishigong == 7) || (zhishii.equals("景") && zhishigong == 2) || (zhishii.equals("死") && zhishigong == 3) || (zhishii.equals("惊") && zhishigong == 8) || (zhishii.equals("开") && zhishigong == 1) || (zhishii.equals("开") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 3)) {
                    men_list = new String[]{"伤", "开", "景", "死", "中", "生", "休", "杜", "惊"};
                }
                if ((zhishii.equals("休") && zhishigong == 5) || (zhishii.equals("生") && zhishigong == 0) || (zhishii.equals("伤") && zhishigong == 7) || (zhishii.equals("杜") && zhishigong == 2) || (zhishii.equals("景") && zhishigong == 3) || (zhishii.equals("死") && zhishigong == 8) || (zhishii.equals("惊") && zhishigong == 1) || (zhishii.equals("开") && zhishigong == 6) || (zhishii.equals("惊") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 8)) {
                    men_list = new String[]{"生", "惊", "杜", "景", "中", "休", "开", "伤", "死"};
                }
                if ((zhishii.equals("休") && zhishigong == 0) || (zhishii.equals("生") && zhishigong == 7) || (zhishii.equals("伤") && zhishigong == 2) || (zhishii.equals("杜") && zhishigong == 3) || (zhishii.equals("景") && zhishigong == 8) || (zhishii.equals("死") && zhishigong == 1) || (zhishii.equals("惊") && zhishigong == 6) || (zhishii.equals("开") && zhishigong == 5) || (zhishii.equals("死") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 1)) {
                    men_list = new String[]{"休", "死", "伤", "杜", "中", "开", "惊", "生", "景"};
                }
                if ((zhishii.equals("休") && zhishigong == 7) || (zhishii.equals("生") && zhishigong == 2) || (zhishii.equals("伤") && zhishigong == 3) || (zhishii.equals("杜") && zhishigong == 8) || (zhishii.equals("景") && zhishigong == 1) || (zhishii.equals("死") && zhishigong == 6) || (zhishii.equals("惊") && zhishigong == 5) || (zhishii.equals("开") && zhishigong == 0) || (zhishii.equals("景") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 6)) {
                    men_list = new String[]{"开", "景", "生", "伤", "中", "惊", "死", "休", "杜"};
                }
                if ((zhishii.equals("休") && zhishigong == 2) || (zhishii.equals("生") && zhishigong == 3) || (zhishii.equals("伤") && zhishigong == 8) || (zhishii.equals("杜") && zhishigong == 1) || (zhishii.equals("景") && zhishigong == 6) || (zhishii.equals("死") && zhishigong == 5) || (zhishii.equals("惊") && zhishigong == 0) || (zhishii.equals("开") && zhishigong == 7) || (zhishii.equals("杜") && zhishigong == 4) || (zhishii.equals("中") && zhishigong == 5)) {
                    men_list = new String[]{"惊", "杜", "休", "生", "中", "死", "景", "开", "伤"};
                }
            }
        }
        return men_list;
    }
    private static String[] shenpan(String shigan,String rigan,String jieqi){
        String[] shen_list = new String[9];
        int gong_shen=100;
        if (yongju(jieqi,rigan).substring(0,2).equals("阳遁")){
            String key=zhifu(shigan,rigan,jieqi)[0];
            if (key.equals("禽")){
                key="芮";
            }
            String[] xing=xingpan(shigan,rigan,jieqi);
            for (int x = 0; x < 9; x++) {
                if (xing[x].equals(key)){
                    gong_shen=x;
                }
            }
            if (gong_shen==3){
                shen_list=new String[]{"玄","阴","天","符","中","白","六","地","蛇"};
            }
            if (gong_shen==8){
                shen_list=new String[]{"白","蛇","地","天","中","六","阴","玄","符"};
            }
            if (gong_shen==1 || gong_shen==4){
                shen_list=new String[]{"六","符","玄","地","中","阴","蛇","白","天"};
            }
            if (gong_shen==6){
                shen_list=new String[]{"阴","天","白","玄","中","蛇","符","六","地"};
            }
            if (gong_shen==5){
                shen_list=new String[]{"蛇","地","六","白","中","符","天","阴","玄"};
            }
            if (gong_shen==0){
                shen_list=new String[]{"符","玄","阴","六","中","天","地","蛇","白"};
            }
            if (gong_shen==7){
                shen_list=new String[]{"天","白","蛇","阴","中","地","玄","符","六"};
            }
            if (gong_shen==2){
                shen_list=new String[]{"地","六","符","蛇","中","玄","白","天","阴"};
            }
        }
        if (yongju(jieqi,rigan).substring(0,2).equals("阴遁")){
            String key=zhifu(shigan,rigan,jieqi)[0];
            if (key.equals("禽")){
                key="芮";
            }
            String[] xing=xingpan(shigan,rigan,jieqi);
            for (int x = 0; x < 9; x++) {
                if (xing[x].equals(key)){
                    gong_shen=x;
                }
            }
            if (gong_shen==3){
                shen_list=new String[] {"六","地","蛇","符","中","白","玄","阴","天"};
            }
            if (gong_shen==8){
                shen_list=new String[] {"白","天","阴","蛇","中","玄","地","六","符"};
            }
            if (gong_shen==1 || gong_shen==4){
                shen_list=new String[] {"玄","符","六","阴","中","地","天","白","蛇"};
            }
            if (gong_shen==6){
                shen_list=new String[] {"地","蛇","白","六","中","天","符","玄","阴"};
            }
            if (gong_shen==5){
                shen_list=new String[] {"天","阴","玄","白","中","符","蛇","地","六"};
            }
            if (gong_shen==0){
                shen_list=new String[] {"符","六","地","玄","中","蛇","阴","天","白"};
            }
            if (gong_shen==7){
                shen_list=new String[] {"蛇","白","天","地","中","阴","六","符","玄"};
            }
            if (gong_shen==2){
                shen_list=new String[] {"阴","玄","符","天","中","六","白","蛇","地"};
            }
        }
        return shen_list;
    }
    private static String[] tianpan(String shigan,String rigan,String jieqi){
        String futou=xunshou(shigan);
        String fu=zhifu(shigan,rigan,jieqi)[0];
        String[] dipanx=dipan(shigan,rigan,jieqi);
        String[] xing=xingpan(shigan,rigan,jieqi);
        String[] tian_list = new String[9];
        int gan_gong=100;
        int xing_gong=100;
        for (int x = 0; x < 9; x++) {
            if (dipanx[x].equals(futou)){
                gan_gong=x;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (xing[i].equals(fu)){
                xing_gong=i;
            }
        }
        tian_list[4]="";
        if ((gan_gong==3 && xing_gong==3) || (gan_gong==2 && xing_gong==2) || (gan_gong==7 && xing_gong==7) || (gan_gong==0 && xing_gong==0) || (gan_gong==5 && xing_gong==5) || (gan_gong==6 && xing_gong==6) || (gan_gong==1 && xing_gong==1) || (gan_gong==8 && xing_gong==8) || (gan_gong==4 && xing_gong==4)){
            tian_list[3]=dipanx[3];
            tian_list[2]=dipanx[2];
            tian_list[7]=dipanx[7];
            tian_list[0]=dipanx[0];
            tian_list[5]=dipanx[5];
            tian_list[6]=dipanx[6];
            tian_list[1]=dipanx[1];
            tian_list[8]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==2) || (gan_gong==2 && xing_gong==7) || (gan_gong==7 && xing_gong==0) || (gan_gong==0 && xing_gong==5) || (gan_gong==5 && xing_gong==6) || (gan_gong==6 && xing_gong==1) || (gan_gong==1 && xing_gong==8) || (gan_gong==8 && xing_gong==3)){
            tian_list[2]=dipanx[3];
            tian_list[7]=dipanx[2];
            tian_list[0]=dipanx[7];
            tian_list[5]=dipanx[0];
            tian_list[6]=dipanx[5];
            tian_list[1]=dipanx[6];
            tian_list[8]=dipanx[1];
            tian_list[3]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==7) || (gan_gong==2 && xing_gong==0) || (gan_gong==7 && xing_gong==5) || (gan_gong==0 && xing_gong==6) || (gan_gong==5 && xing_gong==1) || (gan_gong==6 && xing_gong==8) || (gan_gong==1 && xing_gong==3) || (gan_gong==8 && xing_gong==2)){
            tian_list[7]=dipanx[3];
            tian_list[0]=dipanx[2];
            tian_list[5]=dipanx[7];
            tian_list[6]=dipanx[0];
            tian_list[1]=dipanx[5];
            tian_list[8]=dipanx[6];
            tian_list[3]=dipanx[1];
            tian_list[2]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==0) || (gan_gong==2 && xing_gong==5) || (gan_gong==7 && xing_gong==6) || (gan_gong==0 && xing_gong==1) || (gan_gong==5 && xing_gong==8) || (gan_gong==6 && xing_gong==3) || (gan_gong==1 && xing_gong==2) || (gan_gong==8 && xing_gong==7)){
            tian_list[0]=dipanx[3];
            tian_list[5]=dipanx[2];
            tian_list[6]=dipanx[7];
            tian_list[1]=dipanx[0];
            tian_list[8]=dipanx[5];
            tian_list[3]=dipanx[6];
            tian_list[2]=dipanx[1];
            tian_list[7]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==5) || (gan_gong==2 && xing_gong==6) || (gan_gong==7 && xing_gong==1) || (gan_gong==0 && xing_gong==8) || (gan_gong==5 && xing_gong==3) || (gan_gong==6 && xing_gong==2) || (gan_gong==1 && xing_gong==7) || (gan_gong==8 && xing_gong==0)){
            tian_list[5]=dipanx[3];
            tian_list[6]=dipanx[2];
            tian_list[1]=dipanx[7];
            tian_list[8]=dipanx[0];
            tian_list[3]=dipanx[5];
            tian_list[2]=dipanx[6];
            tian_list[7]=dipanx[1];
            tian_list[0]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==6) || (gan_gong==2 && xing_gong==1) || (gan_gong==7 && xing_gong==8) || (gan_gong==0 && xing_gong==3) || (gan_gong==5 && xing_gong==2) || (gan_gong==6 && xing_gong==7) || (gan_gong==1 && xing_gong==0) || (gan_gong==8 && xing_gong==5)){
            tian_list[6]=dipanx[3];
            tian_list[1]=dipanx[2];
            tian_list[8]=dipanx[7];
            tian_list[3]=dipanx[0];
            tian_list[2]=dipanx[5];
            tian_list[7]=dipanx[6];
            tian_list[0]=dipanx[1];
            tian_list[5]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==1) || (gan_gong==2 && xing_gong==8) || (gan_gong==7 && xing_gong==3) || (gan_gong==0 && xing_gong==2) || (gan_gong==5 && xing_gong==7) || (gan_gong==6 && xing_gong==0) || (gan_gong==1 && xing_gong==5) || (gan_gong==8 && xing_gong==6)){
            tian_list[1]=dipanx[3];
            tian_list[8]=dipanx[2];
            tian_list[3]=dipanx[7];
            tian_list[2]=dipanx[0];
            tian_list[7]=dipanx[5];
            tian_list[0]=dipanx[6];
            tian_list[5]=dipanx[1];
            tian_list[6]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        if ((gan_gong==3 && xing_gong==8) || (gan_gong==2 && xing_gong==3) || (gan_gong==7 && xing_gong==2) || (gan_gong==0 && xing_gong==7) || (gan_gong==5 && xing_gong==0) || (gan_gong==6 && xing_gong==5) || (gan_gong==1 && xing_gong==6) || (gan_gong==8 && xing_gong==1)){
            tian_list[8]=dipanx[3];
            tian_list[3]=dipanx[2];
            tian_list[2]=dipanx[7];
            tian_list[7]=dipanx[0];
            tian_list[0]=dipanx[5];
            tian_list[5]=dipanx[6];
            tian_list[6]=dipanx[1];
            tian_list[1]=dipanx[8];
            tian_list[4]=dipanx[4];
        }
        return tian_list;

    }

    // 计算年干、月干、日干、时干、节气
    private static String[] tiangandizhi(int year, int month, int date,int hour) {
        String[] nianyueriganzhi=new String[5];

        String[][] tianGanTZ = { { "庚", "辛", "壬", "癸", "甲", "乙", "丙", "丁", "戊", "己" },
                { "申", "酉", "戌", "亥", "子", "丑", "寅", "卯", "辰", "巳", "午", "未" } };
        String YearName = tianGanTZ[0][year % 10] + "" + tianGanTZ[1][year % 12];
        nianyueriganzhi[0]=YearName;
        String key_switch=YearName.substring(0,1);

        //        计算月干
        String yuegan="";
        String yuezhi="";
        String ttt=String.valueOf(year);
        ttt=ttt.substring(3,4);
        int nian_yue_w=Integer.valueOf(ttt);
        ttt=String.valueOf(month);
        String[] str=ttt.split("");
        ttt=str[str.length-1];
        int yue_w=Integer.valueOf(ttt);
        int yueganxu=(nian_yue_w+2)*2+yue_w;
        ttt=String.valueOf(yueganxu);
        str=ttt.split("");
        ttt=str[str.length-1];
        int ganxu=Integer.valueOf(ttt);
        switch (ganxu){
            case 1:
                yuegan="甲";
            case 2:
                yuegan="乙";
            case 3:
                yuegan="丙";
            case 4:
                yuegan="丁";
            case 5:
                yuegan="戊";
            case 6:
                yuegan="己";
            case 7:
                yuegan="庚";
            case 8:
                yuegan="辛";
            case 9:
                yuegan="壬";
            case 0:
                yuegan="癸";
        }

        //        以上为测试方法，暂无用
        int monthh=month-1;
        if (monthh==1) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="丙寅";
                    break;
                case "庚":
                    nianyueriganzhi[1]="戊寅";
                    break;
                case "辛":
                    nianyueriganzhi[1]="庚寅";
                    break;
                case "壬":
                    nianyueriganzhi[1]="壬寅";
                    break;
                case "癸":
                    nianyueriganzhi[1]="甲寅";
                    break;
            }

            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="丙寅";
                    break;
                case "乙":
                    nianyueriganzhi[1]="戊寅";
                    break;
                case "丙":
                    nianyueriganzhi[1]="庚寅";
                    break;
                case "丁":
                    nianyueriganzhi[1]="壬寅";
                    break;
                case "戊":
                    nianyueriganzhi[1]="甲寅";
                    break;
            }
        }
        if (monthh==2) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="丁卯";
                    break;
                case "庚":
                    nianyueriganzhi[1]="己卯";
                    break;
                case "辛":
                    nianyueriganzhi[1]="辛卯";
                    break;
                case "壬":
                    nianyueriganzhi[1]="癸卯";
                    break;
                case "癸":
                    nianyueriganzhi[1]="乙卯";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="丁卯";
                    break;
                case "乙":
                    nianyueriganzhi[1]="己卯";
                    break;
                case "丙":
                    nianyueriganzhi[1]="辛卯";
                    break;
                case "丁":
                    nianyueriganzhi[1]="癸卯";
                    break;
                case "戊":
                    nianyueriganzhi[1]="乙卯";
                    break;
            }
        }
        if (monthh==3) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="戊辰";
                    break;
                case "庚":
                    nianyueriganzhi[1]="庚辰";
                    break;
                case "辛":
                    nianyueriganzhi[1]="壬辰";
                    break;
                case "壬":
                    nianyueriganzhi[1]="甲辰";
                    break;
                case "癸":
                    nianyueriganzhi[1]="丙辰";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="戊辰";
                    break;
                case "乙":
                    nianyueriganzhi[1]="庚辰";
                    break;
                case "丙":
                    nianyueriganzhi[1]="壬辰";
                    break;
                case "丁":
                    nianyueriganzhi[1]="甲辰";
                    break;
                case "戊":
                    nianyueriganzhi[1]="丙辰";
                    break;
            }
        }
        if (monthh==4) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="己巳";
                    break;
                case "庚":
                    nianyueriganzhi[1]="辛巳";
                    break;
                case "辛":
                    nianyueriganzhi[1]="癸巳";
                    break;
                case "壬":
                    nianyueriganzhi[1]="乙巳";
                    break;
                case "癸":
                    nianyueriganzhi[1]="丁巳";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="己巳";
                    break;
                case "乙":
                    nianyueriganzhi[1]="辛巳";
                    break;
                case "丙":
                    nianyueriganzhi[1]="癸巳";
                    break;
                case "丁":
                    nianyueriganzhi[1]="乙巳";
                    break;
                case "戊":
                    nianyueriganzhi[1]="丁巳";
                    break;
            }
        }
        if (monthh==5) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="庚午";
                    break;
                case "庚":
                    nianyueriganzhi[1]="壬午";
                    break;
                case "辛":
                    nianyueriganzhi[1]="甲午";
                    break;
                case "壬":
                    nianyueriganzhi[1]="丙午";
                    break;
                case "癸":
                    nianyueriganzhi[1]="戊午";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="庚午";
                    break;
                case "乙":
                    nianyueriganzhi[1]="壬午";
                    break;
                case "丙":
                    nianyueriganzhi[1]="甲午";
                    break;
                case "丁":
                    nianyueriganzhi[1]="丙午";
                    break;
                case "戊":
                    nianyueriganzhi[1]="戊午";
                    break;
            }
        }
        if (monthh==6) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="辛未";
                    break;
                case "庚":
                    nianyueriganzhi[1]="癸未";
                    break;
                case "辛":
                    nianyueriganzhi[1]="乙未";
                    break;
                case "壬":
                    nianyueriganzhi[1]="丁未";
                    break;
                case "癸":
                    nianyueriganzhi[1]="己未";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="辛未";
                    break;
                case "乙":
                    nianyueriganzhi[1]="癸未";
                    break;
                case "丙":
                    nianyueriganzhi[1]="乙未";
                    break;
                case "丁":
                    nianyueriganzhi[1]="丁未";
                    break;
                case "戊":
                    nianyueriganzhi[1]="己未";
                    break;
            }
        }
        if (monthh==7) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="壬申";
                    break;
                case "庚":
                    nianyueriganzhi[1]="甲申";
                    break;
                case "辛":
                    nianyueriganzhi[1]="丙申";
                    break;
                case "壬":
                    nianyueriganzhi[1]="戊申";
                    break;
                case "癸":
                    nianyueriganzhi[1]="庚申";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="壬申";
                    break;
                case "乙":
                    nianyueriganzhi[1]="甲申";
                    break;
                case "丙":
                    nianyueriganzhi[1]="丙申";
                    break;
                case "丁":
                    nianyueriganzhi[1]="戊申";
                    break;
                case "戊":
                    nianyueriganzhi[1]="庚申";
                    break;
            }
        }
        if (monthh==8) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="癸酉";
                    break;
                case "庚":
                    nianyueriganzhi[1]="乙酉";
                    break;
                case "辛":
                    nianyueriganzhi[1]="丁酉";
                    break;
                case "壬":
                    nianyueriganzhi[1]="己酉";
                    break;
                case "癸":
                    nianyueriganzhi[1]="辛酉";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="癸酉";
                    break;
                case "乙":
                    nianyueriganzhi[1]="乙酉";
                    break;
                case "丙":
                    nianyueriganzhi[1]="丁酉";
                    break;
                case "丁":
                    nianyueriganzhi[1]="己酉";
                    break;
                case "戊":
                    nianyueriganzhi[1]="辛酉";
                    break;
            }
        }
        if (monthh==9) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="甲戌";
                    break;
                case "庚":
                    nianyueriganzhi[1]="丙戌";
                    break;
                case "辛":
                    nianyueriganzhi[1]="戊戌";
                    break;
                case "壬":
                    nianyueriganzhi[1]="庚戌";
                    break;
                case "癸":
                    nianyueriganzhi[1]="壬戌";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="甲戌";
                    break;
                case "乙":
                    nianyueriganzhi[1]="丙戌";
                    break;
                case "丙":
                    nianyueriganzhi[1]="戊戌";
                    break;
                case "丁":
                    nianyueriganzhi[1]="庚戌";
                    break;
                case "戊":
                    nianyueriganzhi[1]="壬戌";
                    break;
            }
        }
        if (monthh==10) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="乙亥";
                    break;
                case "庚":
                    nianyueriganzhi[1]="丁亥";
                    break;
                case "辛":
                    nianyueriganzhi[1]="己亥";
                    break;
                case "壬":
                    nianyueriganzhi[1]="辛亥";
                    break;
                case "癸":
                    nianyueriganzhi[1]="癸亥";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="乙亥";
                    break;
                case "乙":
                    nianyueriganzhi[1]="丁亥";
                    break;
                case "丙":
                    nianyueriganzhi[1]="己亥";
                    break;
                case "丁":
                    nianyueriganzhi[1]="辛亥";
                    break;
                case "戊":
                    nianyueriganzhi[1]="癸亥";
                    break;
            }
        }
        if (monthh==11) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="丙子";
                    break;
                case "庚":
                    nianyueriganzhi[1]="戊子";
                    break;
                case "辛":
                    nianyueriganzhi[1]="庚子";
                    break;
                case "壬":
                    nianyueriganzhi[1]="壬子";
                    break;
                case "癸":
                    nianyueriganzhi[1]="甲子";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="丙子";
                    break;
                case "乙":
                    nianyueriganzhi[1]="戊子";
                    break;
                case "丙":
                    nianyueriganzhi[1]="庚子";
                    break;
                case "丁":
                    nianyueriganzhi[1]="壬子";
                    break;
                case "戊":
                    nianyueriganzhi[1]="甲子";
                    break;
            }
        }
        if (monthh==12) {
            switch (key_switch) {
                case "己":
                    nianyueriganzhi[1]="丁丑";
                    break;
                case "庚":
                    nianyueriganzhi[1]="己丑";
                    break;
                case "辛":
                    nianyueriganzhi[1]="辛丑";
                    break;
                case "壬":
                    nianyueriganzhi[1]="癸丑";
                    break;
                case "癸":
                    nianyueriganzhi[1]="乙丑";
                    break;
            }
            switch (key_switch) {
                case "甲":
                    nianyueriganzhi[1]="丁丑";
                    break;
                case "乙":
                    nianyueriganzhi[1]="己丑";
                    break;
                case "丙":
                    nianyueriganzhi[1]="辛丑";
                    break;
                case "丁":
                    nianyueriganzhi[1]="癸丑";
                    break;
                case "戊":
                    nianyueriganzhi[1]="乙丑";
                    break;
            }
        }
        // 日
        String nian_str=String.valueOf(year);
        nian_str=nian_str.substring(2,4);
        Double kword= Double.valueOf(nian_str);
        Double s1=(kword*5)%60;
        Double s2=Math.floor(kword/4);
        Double dayue =0.0;
        String s4="";
        switch (month){
            case 1:
                dayue=7.0;
                break;
            case 2:
                dayue=7.0;
                break;
            case 3:
                dayue=1.0;
                break;
            case 4:
                dayue=1.0;
                break;
            case 5:
                dayue=2.0;
                break;
            case 6:
                dayue=2.0;
                break;
            case 7:
                dayue=3.0;
                break;
            case 8:
                dayue=4.0;
                break;
            case 9:
                dayue=4.0;
                break;
            case 10:
                dayue=5.0;
                break;
            case 11:
                dayue=5.0;
                break;
            case 12:
                dayue=6.0;
                break;
        }
        Double s3=s1+s2+9+Double.valueOf(date)+dayue;
        if (month%2==0) {
            s3=s3-30.0;

        }
        if (s3>60.0) {
            s3=s3-60.0;
        }
        int y = (int)Math.floor(s3);
        switch (y) {
            case 1:
                s4="甲子";
                break;
            case 2:
                s4="乙丑";
                break;
            case 3:
                s4="丙寅";
                break;
            case 4:
                s4="丁卯";
                break;
            case 5:
                s4="戊辰";
                break;
            case 6:
                s4="己巳";
                break;
            case 7:
                s4="庚午";
                break;
            case 8:
                s4="辛未";
                break;
            case 9:
                s4="壬申";
                break;
            case 10:
                s4="癸酉";
                break;
            case 11:
                s4="甲戌";
                break;
            case 12:
                s4="乙亥";
                break;
            case 13:
                s4="丙子";
                break;
            case 14:
                s4="丁丑";
                break;
            case 15:
                s4="戊寅";
                break;
            case 16:
                s4="己卯";
                break;
            case 17:
                s4="庚辰";
                break;
            case 18:
                s4="辛巳";
                break;
            case 19:
                s4="壬午";
                break;
            case 20:
                s4="癸未";
                break;
            case 21:
                s4="甲申";
                break;
            case 22:
                s4="乙酉";
                break;
            case 23:
                s4="丙戌";
                break;
            case 24:
                s4="丁亥";
                break;
            case 25:
                s4="戊子";
                break;
            case 26:
                s4="己丑";
                break;
            case 27:
                s4="庚寅";
                break;
            case 28:
                s4="辛卯";
                break;
            case 29:
                s4="壬辰";
                break;
            case 30:
                s4="癸巳";
                break;
            case 31:
                s4="甲午";
                break;
            case 32:
                s4="乙未";
                break;
            case 33:
                s4="丙申";
                break;
            case 34:
                s4="丁酉";
                break;
            case 35:
                s4="戊戌";
                break;
            case 36:
                s4="己亥";
                break;
            case 37:
                s4="庚子";
                break;
            case 38:
                s4="辛丑";
                break;
            case 39:
                s4="壬寅";
                break;
            case 40:
                s4="癸卯";
                break;
            case 41:
                s4="甲辰";
                break;
            case 42:
                s4="乙巳";
                break;
            case 43:
                s4="丙午";
                break;
            case 44:
                s4="丁未";
                break;
            case 45:
                s4="戊申";
                break;
            case 46:
                s4="己酉";
                break;
            case 47:
                s4="庚戌";
                break;
            case 48:
                s4="辛亥";
                break;
            case 49:
                s4="壬子";
                break;
            case 50:
                s4="癸丑";
                break;
            case 51:
                s4="甲寅";
                break;
            case 52:
                s4="乙卯";
                break;
            case 53:
                s4="丙辰";
                break;
            case 54:
                s4="丁巳";
                break;
            case 55:
                s4="戊午";
                break;
            case 56:
                s4="己未";
                break;
            case 57:
                s4="庚申";
                break;
            case 58:
                s4="辛酉";
                break;
            case 59:
                s4="壬戌";
                break;
            case 60:
                s4="癸亥";
                break;

        }
        // nianyueriganzhi[2]=s4;
        nianyueriganzhi[2]=rigan(year,month,date);
        //节气
        nianyueriganzhi[4]=jieqi(year,month,date);
        //计算时干
        nianyueriganzhi[3]=shigan(nianyueriganzhi[2],hour);


        //
        return nianyueriganzhi;
    }
    // 计算节气
    private static String jieqi(int year,int month,int date){
        int nian =year;
        int yue=month;
        Double ri=Double.valueOf(date);
        String nian_str=String.valueOf(nian);
        nian_str=nian_str.substring(2,4);
        Double Y=Double.valueOf(Integer.valueOf(nian_str));
        Double D=0.2422;
        Double key_ri=1000000.0;
        String jieqi="";
        if (yue==2) {
            key_ri = Y * D + 3.87 - (Y - 1) / 4;
            key_ri = Math.floor(key_ri);
            if (ri >= key_ri) {
                jieqi = "立春";
            }
            if (ri < key_ri) {
                jieqi = "大寒";
            }
        }
        if (yue==2) {
            key_ri = Y * D + 18.73 - (Y - 1) / 4;
            key_ri = Math.floor(key_ri);
            if (Math.floor(nian) == 2026) {
                key_ri = key_ri - 1;
            }
            if (ri >= key_ri) {
                jieqi = "雨水";
            }
        }
        if (yue==3){
            key_ri=Y*D+5.63-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="惊蛰";
            }
            if (ri<key_ri){
                jieqi="雨水";
            }
        }
        if (yue==3){
            key_ri=Y*D+20.646-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2084){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="春分";
            }
        }
        if (yue==4){
            key_ri=Y*D+4.81-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="清明";
            }
            if (ri<key_ri){
                jieqi="春分";
            }
        }
        if (yue==4) {
            key_ri = Y * D + 20.1 - (Y) / 4;
            key_ri = Math.floor(key_ri);
            if (ri >= key_ri) {
                jieqi = "谷雨";
            }
        }
        if (yue==5){
            key_ri=Y*D+5.52-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="立夏";
            }
            if (ri<key_ri){
                jieqi="谷雨";
            }
        }
        if (yue==5){
            key_ri=Y*D+21.04-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2008){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="小满";
            }
        }
        if (yue==6){
            key_ri=Y*D+5.678-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="芒种";
            }
            if (ri<key_ri){
                jieqi="小满";
            }
        }
        if (yue==6) {
            key_ri = Y * D + 21.37 - (Y) / 4;
            key_ri = Math.floor(key_ri);
            if (ri >= key_ri) {
                jieqi = "夏至";
            }
        }
        if (yue==7){
            key_ri=Y*D+7.108-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2016){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="小暑";
            }
            if (ri<key_ri){
                jieqi="夏至";
            }
        }
        if (yue==7){
            key_ri=Y*D+22.83-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="大暑";
            }
        }
        if (yue==8){
            key_ri=Y*D+7.5-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2002){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="立秋";
            }
            if (ri<key_ri){
                jieqi="大暑";
            }
        }
        if (yue==8){
            key_ri=Y*D+23.13-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="处暑";
            }
        }
        if (yue==9){
            key_ri=Y*D+7.646-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="白露";
            }
            if (ri<key_ri){
                jieqi="处暑";
            }
        }
        if (yue==9){
            key_ri=Y*D+23.042-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="秋分";
            }
        }
        if (yue==10){
            key_ri=Y*D+8.318-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="寒露";
            }
            if (ri<key_ri){
                jieqi="秋分";
            }
        }
        if (yue==10){
            key_ri=Y*D+23.438-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2089){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="霜降";
            }
        }
        if (yue==11){
            key_ri=Y*D+7.438-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2089){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="立冬";
            }
            if (ri<key_ri){
                jieqi="霜降";
            }
        }
        if (yue==11){
            key_ri=Y*D+22.36-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="小雪";
            }
        }
        if (yue==12){
            key_ri=Y*D+7.18-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (ri>=key_ri){
                jieqi="大雪";
            }
            if (ri<key_ri){
                jieqi="小雪";
            }
        }
        if (yue==12){
            key_ri=Y*D+21.94-(Y)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2021){
                key_ri=key_ri-1;
            }
            if (ri>=key_ri){
                jieqi="冬至";
            }
        }
        if (yue==1){
            key_ri=Y*D+5.4055-(Y-1)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2019){
                key_ri=key_ri-1;
            }
            if (ri>=key_ri){
                jieqi="小寒";
            }
            if (ri<key_ri){
                jieqi="冬至";
            }
        }
        if (yue==1){
            key_ri=Y*D+20.12-(Y-1)/4;
            key_ri=Math.floor(key_ri);
            if (Math.floor(nian)==2082){
                key_ri=key_ri+1;
            }
            if (ri>=key_ri){
                jieqi="大寒";
            }
        }
        return jieqi;
    }
    private static String quzheng(Double shuzi){
        //在此写函数
        //String a;
        //int b;
        //Double c;
        //System.out.println(snippet3);
        String temp=""+shuzi;
        String tempp="";
        String[] strs=temp.split("");
        for (int i=0;i<strs.length ;i++ ) {
            if (strs[i].equals(".")) {
                break;
            }
            tempp=tempp+strs[i];
        }
        return tempp;
    }

    private static String rigan(int year,int month,int date){
        //在此写函数
        String rigan="";
        String zhii="";
        Double y_key=1000025.0;
        Double h_key=10000202.0;
        int X=1000000;
        Double yuejishu=100000.0;
        int y=100000000;
        String s4="";
        String gan="";
        String zhi="";
        int I =1000000;
        if (month%2==0.0) {
            I=6;
        }
        if (month%2>0) {
            I=0;

        }
        if (month<3) {
            year=year-1;
            month=month+12;
        }
        String Y=String.valueOf(year);
        Y=Y.substring(2,4);
        int YY=Integer.valueOf(Y);
        if (year>=2001&&year<=2100) {
            X=21;
        }
        if (year>=1601&&year<=1700) {
            X=17;
        }

        if (year>=1801&&year<=1900) {
            X=19;
        }

        if (year>=1701&&year<=1800) {
            X=18;
        }

        if (year>=1901&&year<=2000) {
            X=20;
        }

        if (year>=2101&&year<=2200) {
            X=22;
        }

        if (year>=2201&&year<=2300) {
            X=23;
        }

        if (year>=2301&&year<=2400) {
            X=24;
        }

        if (year>=2401&&year<=2500) {
            X=25;
        }

        if (year>=2501&&year<=2600) {
            X=26;
        }
        // 月基
        if (month == 1 ) {
            yuejishu=0.0;
        }
        if (month == 2 ) {
            yuejishu=31.0;
        }
        if (month == 3 ) {
            yuejishu=-1.0;
        }
        if (month == 4 ) {
            yuejishu=30.0;
        }
        if (month == 5 ) {
            yuejishu=0.0;
        }
        if (month == 6 ) {
            yuejishu=31.0;
        }
        if (month == 7 ) {
            yuejishu=1.0;
        }
        if (month == 8 ) {
            yuejishu=32.0;
        }
        if (month == 9 ) {
            yuejishu=3.0;
        }
        if (month == 10 ) {
            yuejishu=33.0;
        }
        if (month == 11) {
            yuejishu=4.0;
        }
        if (month == 12 ) {
            yuejishu=34.0;
        }
        // 干支表
        switch (y) {
            case 1:
                s4="甲子";
                break;
            case 2:
                s4="乙丑";
                break;
            case 3:
                s4="丙寅";
                break;
            case 4:
                s4="丁卯";
                break;
            case 5:
                s4="戊辰";
                break;
            case 6:
                s4="己巳";
                break;
            case 7:
                s4="庚午";
                break;
            case 8:
                s4="辛未";
                break;
            case 9:
                s4="壬申";
                break;
            case 10:
                s4="癸酉";
                break;
            case 11:
                s4="甲戌";
                break;
            case 12:
                s4="乙亥";
                break;
            case 13:
                s4="丙子";
                break;
            case 14:
                s4="丁丑";
                break;
            case 15:
                s4="戊寅";
                break;
            case 16:
                s4="己卯";
                break;
            case 17:
                s4="庚辰";
                break;
            case 18:
                s4="辛巳";
                break;
            case 19:
                s4="壬午";
                break;
            case 20:
                s4="癸未";
                break;
            case 21:
                s4="甲申";
                break;
            case 22:
                s4="乙酉";
                break;
            case 23:
                s4="丙戌";
                break;
            case 24:
                s4="丁亥";
                break;
            case 25:
                s4="戊子";
                break;
            case 26:
                s4="己丑";
                break;
            case 27:
                s4="庚寅";
                break;
            case 28:
                s4="辛卯";
                break;
            case 29:
                s4="壬辰";
                break;
            case 30:
                s4="癸巳";
                break;
            case 31:
                s4="甲午";
                break;
            case 32:
                s4="乙未";
                break;
            case 33:
                s4="丙申";
                break;
            case 34:
                s4="丁酉";
                break;
            case 35:
                s4="戊戌";
                break;
            case 36:
                s4="己亥";
                break;
            case 37:
                s4="庚子";
                break;
            case 38:
                s4="辛丑";
                break;
            case 39:
                s4="壬寅";
                break;
            case 40:
                s4="癸卯";
                break;
            case 41:
                s4="甲辰";
                break;
            case 42:
                s4="乙巳";
                break;
            case 43:
                s4="丙午";
                break;
            case 44:
                s4="丁未";
                break;
            case 45:
                s4="戊申";
                break;
            case 46:
                s4="己酉";
                break;
            case 47:
                s4="庚戌";
                break;
            case 48:
                s4="辛亥";
                break;
            case 49:
                s4="壬子";
                break;
            case 50:
                s4="癸丑";
                break;
            case 51:
                s4="甲寅";
                break;
            case 52:
                s4="乙卯";
                break;
            case 53:
                s4="丙辰";
                break;
            case 54:
                s4="丁巳";
                break;
            case 55:
                s4="戊午";
                break;
            case 56:
                s4="己未";
                break;
            case 57:
                s4="庚申";
                break;
            case 58:
                s4="辛酉";
                break;
            case 59:
                s4="壬戌";
                break;
            case 60:
                s4="癸亥";
                break;

        }
        //
        // 计算年数

        Double G=4*(X-1)+Math.floor(X/4)+5*YY+Math.floor(YY/4)+Math.floor(3*(month+1)/5)+date-3;
        y_key=G%10;
        String str=quzheng(y_key);

        y=Integer.valueOf(str);
        switch (y) {
            case 1:
                gan="甲";
                break;
            case 2:
                gan="乙";
                break;
            case 3:
                gan="丙";
                break;
            case 4:
                gan="丁";
                break;
            case 5:
                gan="戊";
                break;
            case 6:
                gan="己";
                break;
            case 7:
                gan="庚";
                break;
            case 8:
                gan="辛";
                break;
            case 9:
                gan="壬";
                break;
            case 0:
                gan="癸";
                break;
        }
        Double H=8*(X-1)+Math.floor((X-1)/4)+5*YY+Math.floor(YY/4)+Math.floor(3*(month+1)/5)+date+7+I;
        h_key=H%12;
        str=quzheng(h_key);
        int z=Integer.valueOf(str);
        switch (z) {
            case 1:
                zhii="子";
                break;
            case 2:
                zhii="丑";
                break;
            case 3:
                zhii="寅";
                break;
            case 4:
                zhii="卯";
                break;
            case 5:
                zhii="辰";
                break;
            case 6:
                zhii="巳";
                break;
            case 7:
                zhii="午";
                break;
            case 8:
                zhii="未";
                break;
            case 9:
                zhii="申";
                break;
            case 10:
                zhii="酉";
                break;
            case 11:
                zhii="戌";
                break;
            case 12:
                zhii="亥";
                break;
        }
        // System.out.println(quzheng(198898.98760));
        return gan+zhii;
    }
    //   计算时干
    private static String shigan(String rigan,int hour){
        //在此写函数
        //String a;
        //int b;
        //Double c;
        //System.out.println(snippet3);
        String zhi="";
        String shiganzhi="";
        int key_x=3921;
        int key_y=1231;
        switch (hour) {
            case 1:
                zhi="丑";
                key_y=2;
                break;
            case 2:
                zhi="丑";
                key_y=2;
                break;
            case 3:
                zhi="寅";
                key_y=3;
                break;
            case 4:
                zhi="寅";
                key_y=3;
                break;
            case 5:
                zhi="卯";
                key_y=4;
                break;
            case 6:
                zhi="卯";
                key_y=4;
                break;
            case 7:
                zhi="辰";
                key_y=5;
                break;
            case 8:
                zhi="辰";
                key_y=5;
                break;
            case 9:
                zhi="巳";
                key_y=6;
                break;
            case 10:
                zhi="巳";
                key_y=6;
                break;
            case 11:
                zhi="午";
                key_y=7;
                break;
            case 12:
                zhi="午";
                key_y=7;
                break;
            case 13:
                zhi="未";
                key_y=8;
                break;
            case 14:
                zhi="未";
                key_y=8;
                break;
            case 15:
                zhi="申";
                key_y=9;
                break;
            case 16:
                zhi="申";
                key_y=9;
                break;
            case 17:
                zhi="酉";
                key_y=10;
                break;
            case 18:
                zhi="酉";
                key_y=10;
                break;
            case 19:
                zhi="戌";
                key_y=11;
                break;
            case 20:
                zhi="戌";
                key_y=11;
                break;
            case 21:
                zhi="亥";
                key_y=12;
                break;
            case 22:
                zhi="亥";
                key_y=12;
                break;
            case 23:
                zhi="子";
                key_y=1;
                break;
            case 24:
                zhi="子";
                key_y=1;
                break;
            case 0:
                zhi="子";
                key_y=1;
                break;
        }
        String[] str=rigan.split("");
        rigan=str[0];
        if (rigan.equals("甲")||rigan.equals("己")) {
            key_x=1;
        }
        if (rigan.equals("乙")||rigan.equals("庚")) {
            key_x=2;
        }
        if (rigan.equals("丙")||rigan.equals("辛")) {
            key_x=3;
        }
        if (rigan.equals("丁")||rigan.equals("壬")) {
            key_x=4;
        }
        if (rigan.equals("戊")||rigan.equals("癸")) {
            key_x=5;
        }
        //
        if (key_x == 1 &&key_y==1 ) {
            shiganzhi="甲子";
        }
        if (key_x == 1&&key_y==2 ) {
            shiganzhi="乙丑";
        }
        if (key_x == 1&&key_y==3 ) {
            shiganzhi="丙寅";
        }
        if (key_x == 1&&key_y==4 ) {
            shiganzhi="丁卯";
        }
        if (key_x == 1&&key_y==5 ) {
            shiganzhi="戊辰";
        }
        if (key_x == 1&&key_y==6 ) {
            shiganzhi="己巳";
        }
        if (key_x == 1&&key_y==7 ) {
            shiganzhi="庚午";
        }
        if (key_x == 1&&key_y==8 ) {
            shiganzhi="辛未";
        }
        if (key_x == 1&&key_y==9 ) {
            shiganzhi="壬申";
        }
        if (key_x == 1&&key_y==10 ) {
            shiganzhi="癸酉";
        }
        if (key_x == 1&&key_y==11 ) {
            shiganzhi="甲戌";
        }
        if (key_x == 1&&key_y==12 ) {
            shiganzhi="乙亥";
        }
        if (key_x == 2&&key_y==1 ) {
            shiganzhi="丙子";
        }
        if (key_x == 2&&key_y==2 ) {
            shiganzhi="丁丑";
        }
        if (key_x == 2&&key_y==3 ) {
            shiganzhi="戊寅";
        }
        if (key_x == 2&&key_y==4 ) {
            shiganzhi="己卯";
        }
        if (key_x == 2&&key_y==5 ) {
            shiganzhi="庚辰";
        }
        if (key_x == 2&&key_y==6 ) {
            shiganzhi="辛巳";
        }
        if (key_x == 2&&key_y==7 ) {
            shiganzhi="壬午";
        }
        if (key_x == 2&&key_y==8 ) {
            shiganzhi="癸未";
        }
        if (key_x == 2&&key_y==9 ) {
            shiganzhi="甲申";
        }
        if (key_x == 2&&key_y==10 ) {
            shiganzhi="乙酉";
        }
        if (key_x == 2&&key_y==11 ) {
            shiganzhi="丙戌";
        }
        if (key_x == 2&&key_y==12 ) {
            shiganzhi="丁亥";
        }
        if (key_x == 3&&key_y==1 ) {
            shiganzhi="戊子";
        }
        if (key_x == 3&&key_y==2 ) {
            shiganzhi="己丑";
        }
        if (key_x == 3&&key_y==3 ) {
            shiganzhi="庚寅";
        }
        if (key_x == 3&&key_y==4 ) {
            shiganzhi="辛卯";
        }
        if (key_x == 3&&key_y==5 ) {
            shiganzhi="壬辰";
        }
        if (key_x == 3&&key_y==6 ) {
            shiganzhi="癸巳";
        }
        if (key_x == 3&&key_y==7 ) {
            shiganzhi="甲午";
        }
        if (key_x == 3&&key_y==8 ) {
            shiganzhi="乙未";
        }
        if (key_x == 3&&key_y==9 ) {
            shiganzhi="丙申";
        }
        if (key_x == 3&&key_y==10 ) {
            shiganzhi="丁酉";
        }
        if (key_x == 3&&key_y==11 ) {
            shiganzhi="戊戌";
        }
        if (key_x == 3&&key_y==12 ) {
            shiganzhi="己亥";
        }
        if (key_x == 4&&key_y==1 ) {
            shiganzhi="庚子";
        }
        if (key_x == 4&&key_y==2 ) {
            shiganzhi="辛丑";
        }
        if (key_x == 4&&key_y==3 ) {
            shiganzhi="壬寅";
        }
        if (key_x == 4&&key_y==4 ) {
            shiganzhi="癸卯";
        }
        if (key_x == 4&&key_y==5 ) {
            shiganzhi="甲辰";
        }
        if (key_x == 4&&key_y==6 ) {
            shiganzhi="乙巳";
        }
        if (key_x == 4&&key_y==7 ) {
            shiganzhi="丙午";
        }
        if (key_x == 4&&key_y==8 ) {
            shiganzhi="丁未";
        }
        if (key_x == 4&&key_y==9 ) {
            shiganzhi="戊申";
        }
        if (key_x == 4&&key_y==10 ) {
            shiganzhi="己酉";
        }
        if (key_x == 4&&key_y==11 ) {
            shiganzhi="庚戌";
        }
        if (key_x == 4&&key_y==12 ) {
            shiganzhi="辛亥";
        }
        if (key_x == 5&&key_y==1 ) {
            shiganzhi="壬子";
        }
        if (key_x == 5&&key_y==2 ) {
            shiganzhi="癸丑";
        }
        if (key_x == 5&&key_y==3 ) {
            shiganzhi="甲寅";
        }
        if (key_x == 5&&key_y==4 ) {
            shiganzhi="乙卯";
        }
        if (key_x == 5&&key_y==5 ) {
            shiganzhi="丙辰";
        }
        if (key_x == 5&&key_y==6 ) {
            shiganzhi="丁巳";
        }
        if (key_x == 5&&key_y==7 ) {
            shiganzhi="戊午";
        }
        if (key_x == 5&&key_y==8 ) {
            shiganzhi="己未";
        }
        if (key_x == 5&&key_y==9 ) {
            shiganzhi="庚申";
        }
        if (key_x == 5&&key_y==10 ) {
            shiganzhi="辛酉";
        }
        if (key_x == 5&&key_y==11 ) {
            shiganzhi="壬戌";
        }
        if (key_x == 5&&key_y==12 ) {
            shiganzhi="癸亥";
        }


        //
        return shiganzhi;
    }
    //自动计算函数
    //自动计算函数
    private static String[][] zidongjisuan(){
        SimpleDateFormat Y = new SimpleDateFormat("yyyy");//设置日期格式
        SimpleDateFormat YY = new SimpleDateFormat("MM");//设置日期格式
        SimpleDateFormat D = new SimpleDateFormat("dd");//设置日期格式
        SimpleDateFormat H = new SimpleDateFormat("HH");//设置日期格式
        String  nian=Y.format(new Date());
        String yue=YY.format(new Date());
        String ri=D.format(new Date());
        String shi=H.format(new Date());
        int year=Integer.valueOf(nian);
        int month=Integer.valueOf(yue);
        int date=Integer.valueOf(ri);
        int hour=Integer.valueOf(shi);
        String[] key_i=tiangandizhi(year,month,date,hour);
        String nianganzhi=key_i[0];
        String yueganzhi=key_i[1];
        String riganzhi=key_i[2];
        String shiganzhi=key_i[3];
        String jieqi=key_i[4];
        String[] Di=dipan(shiganzhi,riganzhi,jieqi);
        String[] Tian=tianpan(shiganzhi,riganzhi,jieqi);
        String[] Men=menpan(shiganzhi,riganzhi,jieqi);
        String[] Xing=xingpan(shiganzhi,riganzhi,jieqi);
        String[] Shen=shenpan(shiganzhi,riganzhi,jieqi);
        String[][] Ju=new String[5][9];
        Ju[4]=Di;
        Ju[3]=Tian;
        Ju[2]=Men;
        Ju[1]=Xing;
        Ju[0]=Shen;
        //
        return Ju;






//            zidongjisuan
    }









//    函数结束











}

