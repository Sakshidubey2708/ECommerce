package com.bytes.tech.awizom.ecommerce.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.bytes.tech.awizom.ecommerce.R;
import com.bytes.tech.awizom.ecommerce.models.ProductModel;
import java.util.List;

public class ProductListAdapter extends  RecyclerView.Adapter<ProductListAdapter.OrderItemViewHolder> {

    private Context mCtx;
    private List<ProductModel> productModelList;
    private ProductModel propertyName;
    TextView calltext;
    private String result = "";
    private boolean isTailor = true;
    long pid = 0;

    public ProductListAdapter(Context mCtx, List<ProductModel> OrderNewOnes) {
        this.mCtx = mCtx;
        this.productModelList = OrderNewOnes;
    }

    @NonNull
    @Override
    public ProductListAdapter.OrderItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.producet_adpater, null);
        return new ProductListAdapter.OrderItemViewHolder(view, mCtx, productModelList);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductListAdapter.OrderItemViewHolder holder, int position) {
        ProductModel catagoriesModel = productModelList.get(position);
        holder.catagory_names.setText(catagoriesModel.getModelName().toString());
        holder.catagoryIDs.setText(String.valueOf(catagoriesModel.getMRP()));
    }


    @Override
    public int getItemCount() {
        return productModelList.size();
    }

    class OrderItemViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener, View.OnClickListener {

        private Context mCtx;
        private TextView catagory_names,catagoryIDs;
        private List<ProductModel> productModelList;
        private ProductModel productModel;
        private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);

        public OrderItemViewHolder(View view, Context mCtx, List<ProductModel> OrderNewOnes) {
            super(view);
            this.mCtx = mCtx;
            this.productModelList = OrderNewOnes;
            catagory_names = view.findViewById(R.id.ModelNAme);
            catagoryIDs=view.findViewById(R.id.MRP);
        }

        @Override
        public void onClick(final View v) {
            v.startAnimation(buttonClick);
        }

        @Override
        public boolean onLongClick(View v) {
            return true;
        }
    }


}


