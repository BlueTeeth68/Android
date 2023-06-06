package com.example.recyclerview.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.MainActivity;
import com.example.recyclerview.ProductActivity;
import com.example.recyclerview.ProductDetailActivity;
import com.example.recyclerview.R;
import com.example.recyclerview.model.Product;

import java.util.List;

@SuppressWarnings("unused")
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final List<Product> mListProduct;

    public ProductAdapter(List<Product> mListProduct) {
        this.mListProduct = mListProduct;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = mListProduct.get(position);

        //if(null) => do nothing
        if (product == null) {
            return;
        }

        //else: bind data to the holder

        holder.image.setImageResource(product.getImg());
        holder.description.setText(product.getDescription());
        holder.name.setText(product.getName());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProductActivity activity = (ProductActivity) v.getContext();
                Intent i = new Intent(activity, ProductDetailActivity.class);
                String productName = holder.name.getText().toString();
                String productDes = holder.description.getText().toString();
                int image = v.getId();
                i.putExtra("category", image);
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListProduct != null ? mListProduct.size() : 0;
    }


    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView description;
        private final TextView name;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.img_item);
            description = itemView.findViewById(R.id.tv_item_description);
            name = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
