package com.standket.ble_android_central_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // DECLARATIONS:

    // v-- activty_main.xml User Interface Elements ------------------v
    //
    Button btnDeviceSearch;          // To launch "ble_search" activity
    // ^--------------------------------------------------------------^

    // CONSTRUCTION / INITIALIZATION:

    // v-- Program Entry Point ---------------------------------------v
    // MainActivity Initializer...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // v-- Access the search button in activty_main.xml-----------v
        //
        btnDeviceSearch = (Button) findViewById(R.id.btnDeviceSearch);
        btnDeviceSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBleSearch();
            }
        });
        // ^----------------------------------------------------------^
    }
    // ^--------------------------------------------------------------^

    // MEMBER FUNCTIONS
    // v-- Executed when btnDeviceSearch is pressed in activity_main.xml --v
    //
    public void openBleSearch(){
        Intent intent = new Intent(this, ble_search.class);
        startActivity(intent);
    }
    // ^-------------------------------------------------------------------^
}