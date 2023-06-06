package com.example.recyclerview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.ProductAdapter;
import com.example.recyclerview.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private TextView tvMenuName;
    private RecyclerView rcvProduct;
    private String category = "Food"; //Set default category
    //private Category category = createCategory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMenuName = findViewById(R.id.tv_menu);
        rcvProduct = findViewById(R.id.rcv_items);

        //Set the text for menu
        tvMenuName.setText("Food");

        // Retrieve the data from the intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            category = extras.getString("category");
        }

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rcvProduct.setLayoutManager(gridLayoutManager);

        ProductAdapter productAdapter = new ProductAdapter(createCategory(category));
        rcvProduct.setAdapter(productAdapter);
    }

    private List<Product> createCategory(String categoryName) {

        List<Product> products = new ArrayList<>();
        if (categoryName.equalsIgnoreCase("Food")) {
            products.add(new Product(R.drawable.cat_food_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro8, "Product 8", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro8, "Product 8", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_food_pro8, "Product 8", "Lorem"));
        } else {
            products.add(new Product(R.drawable.cat_drink_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro8, "Product 8", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro9, "Product 9", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro8, "Product 8", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro9, "Product 9", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro1, "Product 1", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro2, "Product 2", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro3, "Product 3", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro4, "Product 4", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro5, "Product 5", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro6, "Product 6", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro7, "Product 7", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro8, "Product 8", "Lorem"));
            products.add(new Product(R.drawable.cat_drink_pro9, "Product 9", "Lorem"));
        }

        return products;
    }
}
