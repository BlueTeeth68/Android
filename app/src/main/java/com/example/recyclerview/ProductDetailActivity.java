package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    private TextView tvMenu;
    private ImageView imgItem;
    private TextView tvItemName;
    private TextView tvItemDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);

        tvMenu = findViewById(R.id.tv_menu);
        imgItem= findViewById(R.id.img_item);
        tvItemName = findViewById(R.id.tv_item_name);
        tvItemDescription = findViewById(R.id.tv_item_description);

        // Retrieve the data from the intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvItemName.setText(extras.getString("name"));
            tvItemDescription.setText(extras.getString("description"));
            imgItem.setImageResource(extras.getInt("image"));
        }
        tvMenu.setText("Product");
    }
}
