package com.example.administrator.my0320day2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
  //  CheckBox cb;
    static String uerName;
    static String passWord;
    static String path = "/data/data/com.example.administrator.my0320day2_2/myqq.txt";
    Map<String,String> getData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.qqNumber);
        et2 = (EditText) findViewById(R.id.qqPassword);
      //  cb = (CheckBox) findViewById(R.id.);
        try {
            getData=inputData();
        } catch (IOException e) {
            e.printStackTrace();
        }
/*        try {uerName = String.format("%s",et1.getText());
            passWord = String.format("%s",et2.getText());
        }catch (Exception e){
            uerName = "";
            passWord = "";
        }*/
        if(!getData.isEmpty()) {
            uerName = (String)getData.get("number");
            passWord = (String)getData.get("passworld");
            et1.setText(uerName);
            et2.setText(passWord);
        }
    }

    public void login(View view) {
        uerName = String.format("%s",et1.getText());
        passWord = String.format("%s",et2.getText());
        try {
            saveData(uerName,passWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveData(String uerName,String passWord) throws IOException {
        String total = uerName + "####" + passWord;
        FileOutputStream out = new FileOutputStream(path);
        out.write(total.getBytes());
        out.flush();
        out.close();
    }
    public static Map<String,String>  inputData() throws IOException {
        FileInputStream in = new FileInputStream(path);
        String total = uerName + "####" + passWord;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String text = reader.readLine();
        if(!TextUtils.isEmpty(text)) {
            String[] split = text.split("##");
            Map<String, String> userInfoMap = new HashMap<String, String>();
            userInfoMap.put("number", split[0]);
            userInfoMap.put("password", split[1]);
            return userInfoMap;
        } else{
            return null;
        }
    }
}
