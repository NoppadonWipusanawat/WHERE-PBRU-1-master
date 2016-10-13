package appewtc.masterung.wherepbru;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    private MyManage myManage;
    private String strURL = "http://swiftcodingthai.com/pbru/get_user.php";
    private String strLogo = "http://swiftcodingthai.com/pbru/Image/logo_pbru.png";
    private ImageView imageView;
    private EditText user_nameEditext,passwordEditext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }
    public void buttomonClick(View v) {
        Intent nextPage = new Intent(MainActivity.this, Main1Activity.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
    public void buttomonClick1(View v) {
        Intent nextPage = new Intent(MainActivity.this, ActivityRegister.class);
        nextPage.putExtra("PARAM", "Every man fight his own wars");
        startActivity(nextPage);
    }
}
