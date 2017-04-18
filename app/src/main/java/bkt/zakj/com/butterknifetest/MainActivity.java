package bkt.zakj.com.butterknifetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_1)
    Button mBtn1;
    @BindView(R.id.btn_2)
    Button mBtn2;
    @BindView(R.id.btn_3)
    Button mBtn3;
    @BindView(R.id.btn_4)
    Button mBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                Toast.makeText(this, "Button1的点击事件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2:
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toast.makeText(this, "Button2的点击事件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_3:
                Toast.makeText(this, "Button3的点击事件", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_4:
                Toast.makeText(this, "Button4的点击事件", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
