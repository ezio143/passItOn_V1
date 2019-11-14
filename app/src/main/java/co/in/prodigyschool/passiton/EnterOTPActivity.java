package co.in.prodigyschool.passiton;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EnterOTPActivity extends AppCompatActivity {
    String userPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_otp);
        final EditText otpField = (EditText) findViewById(R.id.editTextOtp);
        userPhoneNumber = getIntent().getStringExtra("USER_MOB");

    }
}
