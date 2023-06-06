package com.example.recyclerview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.CategoryAdapter;
import com.example.recyclerview.model.Category;
import com.example.recyclerview.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvCategory;
    private RecyclerView recyclerViewCategory;

    private List<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCategory = findViewById(R.id.tv_menu);
        recyclerViewCategory = findViewById(R.id.rcv_items);

        //Set the text for menu
        tvCategory.setText("Category");
        //Init data
        this.categories = createCategory();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewCategory.setLayoutManager(gridLayoutManager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(categories);
        recyclerViewCategory.setAdapter(categoryAdapter);
    }

    private List<Category> createCategory() {
        List<Category> categories = new ArrayList<>();
        Category category1 = new Category("Food", R.drawable.cat_food);
        Category category2 = new Category("Drink", R.drawable.cat_drink);
        categories.add(category1);
        categories.add(category2);

        List<Product> products = new ArrayList<>();
        products.add(new Product(R.drawable.cat_food_pro1, "Product 1", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro2, "Product 2", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro3, "Product 3", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro4, "Product 4", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro5, "Product 5", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro6, "Product 6", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro7, "Product 7", "Lorem"));
        products.add(new Product(R.drawable.cat_food_pro8, "Product 8", "Lorem"));
        category1.setProducts(products);

        products = new ArrayList<>();
        products.add(new Product(R.drawable.cat_drink_pro1, "Product 1", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro2, "Product 2", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro3, "Product 3", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro4, "Product 4", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro5, "Product 5", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro6, "Product 6", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro7, "Product 7", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro8, "Product 8", "Lorem"));
        products.add(new Product(R.drawable.cat_drink_pro9, "Product 9", "Lorem"));
        category2.setProducts(products);

        return categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}