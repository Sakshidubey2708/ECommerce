package com.bytes.tech.awizom.ecommerce.activity;

import android.app.ActivityOptions;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.bytes.tech.awizom.ecommerce.R;
import com.bytes.tech.awizom.ecommerce.adapter.MainCatagoryAdapter;
import com.bytes.tech.awizom.ecommerce.adapter.SubCatagoryAdapter;
import com.bytes.tech.awizom.ecommerce.configure.AppConfig;
import com.bytes.tech.awizom.ecommerce.configure.HelperApi;
import com.bytes.tech.awizom.ecommerce.models.CatagoriesModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class ViewSubCatagory  extends AppCompatActivity {


    RecyclerView recyclerView;
    private String result = "";
    List<CatagoriesModel> catagoriesModels;
    SubCatagoryAdapter subCatagoryAdapter;
    SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_list_layout);

        initview();
    }

    private void initview() {

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Categories");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityOptions options = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.slide_in, R.anim.slide_out);
                onBackPressed();
            }
        });
        toolbar.setSubtitleTextAppearance(getApplicationContext(), R.style.styleA);
        toolbar.setTitleTextAppearance(getApplicationContext(), R.style.styleA);
        toolbar.setTitleTextColor(Color.WHITE);

        recyclerView = findViewById(R.id.recyclerView);
        mSwipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                // Refresh items
                getMainCatagories();
            }
        });
        getMainCatagories();

    }

    private void getMainCatagories() {


        try {
            mSwipeRefreshLayout.setRefreshing(true);
            result = new HelperApi.GetAllSubCategoriesList().execute().get();
            if (result.isEmpty()) {
                mSwipeRefreshLayout.setRefreshing(false);
            } else {

                if (result.isEmpty()) {
                    mSwipeRefreshLayout.setRefreshing(false);
                } else {
                    /*   Toast.makeText(getApplicationContext(),result+"",Toast.LENGTH_LONG).show();*/
                    Gson gson = new Gson();
                    Type listType = new TypeToken<List<CatagoriesModel>>() {
                    }.getType();
                    catagoriesModels = new Gson().fromJson(result, listType);
                    Log.d("Error", catagoriesModels.toString());
                    SubCatagoryAdapter subCatagoryAdapter= new SubCatagoryAdapter(ViewSubCatagory.this, catagoriesModels);
                    recyclerView.setAdapter(subCatagoryAdapter);
                    mSwipeRefreshLayout.setRefreshing(false);
                }

            }
        } catch (Exception e) {
            mSwipeRefreshLayout.setRefreshing(false);
            e.printStackTrace();

        }
    }



}
