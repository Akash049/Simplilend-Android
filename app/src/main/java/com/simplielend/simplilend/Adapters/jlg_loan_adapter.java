package com.simplielend.simplilend.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.Holders.shg_loans_holder;
import com.simplielend.simplilend.Models.shgloans;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class jlg_loan_adapter extends RecyclerView.Adapter<shg_loans_holder> {

    Context c;
    ArrayList<shgloans> shgloans;

    public jlg_loan_adapter(Context c, ArrayList<com.simplielend.simplilend.Models.shgloans> shgloans) {
        this.c = c;
        this.shgloans = shgloans;
    }

    @NonNull
    @Override
    public shg_loans_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.jlg_list_item,parent,false);
        return new shg_loans_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull shg_loans_holder holder, int position) {
        holder.tenures.setText(shgloans.get(position).getTenures());
        holder.purposes.setText(shgloans.get(position).getPurposes());
        holder.amounts.setText(shgloans.get(position).getAmounts());
        holder.interests.setText(shgloans.get(position).getInterests());
        holder.p1.setText(shgloans.get(position).getP1());
        holder.p2.setText(shgloans.get(position).getP2());
        holder.p3.setText(shgloans.get(position).getP3());
        holder.p4.setText(shgloans.get(position).getP4());


    }

    @Override
    public int getItemCount() {
        return shgloans.size();
    }
}
