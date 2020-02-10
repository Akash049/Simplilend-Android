package com.simplielend.simplilend.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.Holders.Active_loan_holder;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class Active_loan_adapter extends RecyclerView.Adapter<Active_loan_holder> {

    Context c;
    ArrayList<Activeloan> activeloans;

    public Active_loan_adapter(Context c, ArrayList<Activeloan> activeloans) {
        this.c = c;
        this.activeloans = activeloans;
    }

    @NonNull
    @Override
    public Active_loan_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.active_loan_item,parent,false);
        return new Active_loan_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Active_loan_holder holder, int position) {
        holder.name.setText(activeloans.get(position).getName());
        holder.status_email.setText(activeloans.get(position).getStatus_email());
        holder.status_mobile.setText(activeloans.get(position).getStatus_mobile());
        holder.purpose.setText(activeloans.get(position).getPurpose());
        holder.approved_amount.setText(activeloans.get(position).getApproved_amount());
        holder.approved_tenure.setText(activeloans.get(position).getApproved_tenure());
        holder.img.setImageResource(activeloans.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return activeloans.size();
    }
}
