package com.code.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * ʹ��InstanceState����ͻָ�����
 * @Description: ʹ��InstanceState����ͻָ�����

 * @File: MyTestCodeActivity.java

 * @Package com.code.test

 * @Author Hanyonglu

 * @Date 2012-03-28 ����04:53:15

 * @Version V1.0
 */
public class MainActivity extends Activity {
	private String message = "";
	private EditText text = null;
	private Button button = null;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (EditText) findViewById(R.id.editText1);
        button = (Button) findViewById(R.id.btnSave);
        
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "����", Toast.LENGTH_SHORT).show();
            }
        });
    }
 
    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
 
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("message", text.getText().toString());
        savedInstanceState.putString("phaha","haha");
    }
 
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        message = savedInstanceState.getString("message");
  
    }
}