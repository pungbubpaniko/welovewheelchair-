package appewtc.masterung.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShopWheelChairActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_wheel_chair);
    }// main method
    public void clickBackShopWheelChair (View view){
        finish();
    }

} /// main class
