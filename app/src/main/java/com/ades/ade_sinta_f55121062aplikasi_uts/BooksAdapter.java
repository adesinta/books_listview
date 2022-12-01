package com.ades.ade_sinta_f55121062aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {
//    private List<BooksData> booksDataList;
//    public BooksAdapter(List<BooksData> booksDataList){ this.booksDataList = booksDataList; }
    BooksData[] booksData;
    Context context;

    public BooksAdapter(BooksData[] booksData, MainActivity activity) {
        this.booksData = booksData;
        this.context = activity;
    }
//    public void setFilteredList(List<BooksData> filteredList){
//        this.booksDataList = filteredList;
//        notifyDataSetChanged();
//    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.books_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final BooksData booksDataList = booksData[position];
        holder.textViewName.setText(booksDataList.getBooksName());
        holder.textViewDate.setText(booksDataList.getBooksDate());
        holder.booksImage.setImageResource(booksDataList.getBooksImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, booksDataList.getBooksName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return booksData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView booksImage;
        TextView textViewName;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            booksImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDate = itemView.findViewById(R.id.textdate);

        }
    }

}

