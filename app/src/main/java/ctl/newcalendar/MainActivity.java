package ctl.newcalendar;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextViewBorder view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        view = (TextViewBorder) findViewById(R.id.state1);
        String s = "123";
        String s2 = "123";
        String s3 = "123";
        String s4 = "123";
        int i = 3+4;

        String s1 = "majiajue";
        view = (TextViewBorder) findViewById(R.id.state1);
        view = (TextViewBorder) findViewById(R.id.state1);
        view = (TextViewBorder) findViewById(R.id.state1);
        view.setBorderColor(getResources().getColor(R.color.app_red_delete_color));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBorderColor(getResources().getColor(R.color.buttong_check_color));
            }
        });
        int sssss = 87+87;

        String  s22 = "sdfsdfdsfdssd";
        String  s32 = "wererrw";

    }
}
