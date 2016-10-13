package appewtc.masterung.wherepbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ActivityRegister extends AppCompatActivity {
    private EditText user_idEditText, user_nameEditText, emailEditText, phoneEditText,
            passwordEditText;
    private String user_idString, user_nameString, emailString,
            phoneString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_register);

        bindWidget();
    }
    private void bindWidget() {
        user_idEditText = (EditText) findViewById(R.id.editText4);
        user_nameEditText = (EditText) findViewById(R.id.editText5);
        emailEditText = (EditText) findViewById(R.id.editText6);
        emailEditText = (EditText) findViewById(R.id.editText7);
        passwordEditText = (EditText) findViewById(R.id.editText8);
    }
    public void clickSignUpSign(View view){
        user_idString = user_idEditText.getText().toString().trim();
        user_nameString = user_nameEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        uploadValuetoServer();

    }
    private void uploadValuetoServer() {
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = new FormEncodingBuilder()
                .add("isAdd","true")
                .add("user_name",user_nameString)
                .add("email",emailString)
                .add("Phone",phoneString)
                .add("Password",passwordString)
                .build();
        Request.Builder builder = new Request.Builder();
        Request request = builder.url("http://swiftcodingthai.com/pbru/php_add_user.php")
                .post(requestBody).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                finish();
            }
        });

    } // uploadValue

}

