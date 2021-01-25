package com.tondz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Thông báo");
                alert.setMessage("Bạn có muốn sang activity 3 không?");
                alert.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        openMainActivity3();
                    }
                });
                alert.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alert.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alert.show();
            }
        });
    }

    public void openActivity2(View view) {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Thông báo");
        alert.setMessage("Bạn có muốn sang activity 2 không?");
        alert.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                open();
            }
        });
        alert.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alert.show();
    }
    public void open(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openMainActivity3(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}