package com.example.jcruz.mockito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    private Warehouse warehouse;
    private EditText productEditText;
    private EditText quantityEditText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        warehouse = new Warehouse();
        productEditText = (EditText)findViewById(R.id.product);
        quantityEditText = (EditText)findViewById(R.id.quantity);
    }

    public void placeOrder(View view) {
        String product = productEditText.getText().toString();
        int quantity = Integer.parseInt(quantityEditText.getText().toString());
        Presenter order = new Presenter (product, quantity);
        order.fill(warehouse);
        String message= order.isFilled();

        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }


}

