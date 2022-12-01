package com.ades.ade_sinta_f55121062aplikasi_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SearchView searchView;
//    private List<BooksData> booksDataList;
    private BooksAdapter booksAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        searchView =findViewById(R.id.searchView);
//        searchView.clearFocus();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                filterList(newText);
//                return true;
//            }
//        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        booksDataList = new ArrayList<>();

        BooksData[] booksData = new BooksData[]{
                new BooksData("Sebuah Seni Untuk Bersikap Bodo Amat","13 September 2016",R.drawable.senibersikapbodoamat),
                new BooksData("Atomic Habits","16 September 2019",R.drawable.atomichabits),
                new BooksData("Filosofi Teras","26 November 2018",R.drawable.filosofiteras),
                new BooksData("Psychology Of Money","8 September 2020",R.drawable.psychologyofmoney),
                new BooksData("Mindset","28 Feb 2006",R.drawable.mindset),
                new BooksData("How To Respect Myself","Maret 2020",R.drawable.howtorespect),
                new BooksData("Who The Hell Are You?","Desember 2020",R.drawable.whothehellareu),
        };

        booksAdapter = new BooksAdapter(booksData,MainActivity.this);
        recyclerView.setAdapter(booksAdapter);
    }

//    private void filterList(String text) {
//        List<BooksData> filteredList = new ArrayList<>();
//        for (BooksData booksData : booksDataList){
//            if(booksData.getBooksName().toLowerCase().contains(text.toLowerCase())){
//                filteredList.add(booksData);
//            }
//        }
//        if(filteredList.isEmpty()){
//            Toast.makeText(this, "Data Tidak Ditemukan", Toast.LENGTH_SHORT).show();
//        }else{
//            booksAdapter.setFilteredList(filteredList);
//        }
//    }
}
