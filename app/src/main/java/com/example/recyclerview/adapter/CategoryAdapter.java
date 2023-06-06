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
import com.example.recyclerview.R;
import com.example.recyclerview.model.Category;

import java.util.List;

@SuppressWarnings("unused")
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private final List<Category> mListCategory;

    public CategoryAdapter(List<Category> mListCategory) {
        this.mListCategory = mListCategory;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mListCategory.get(position);

        //if(null) => do nothing
        if (category == null) {
            return;
        }

        //else: bind data to the holder

        holder.imageView.setImageResource(category.getImg());
        holder.textView.setText(category.getName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) v.getContext();
                Intent i = new Intent(mainActivity, ProductActivity.class);
                String categoryName = holder.textView.getText().toString();
                i.putExtra("category", categoryName);
                mainActivity.startActivity(i);
            }
        });
    }

    //Return number of item
    @Override
    public int getItemCount() {
        return mListCategory != null ? mListCategory.size() : 0;
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_item);
            textView = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
