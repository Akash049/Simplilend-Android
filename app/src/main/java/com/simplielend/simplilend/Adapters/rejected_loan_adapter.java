package com.simplielend.simplilend.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.Holders.rejected_loan_holder;
import com.simplielend.simplilend.Models.Activeloan;
import com.simplielend.simplilend.Models.rejectedloan;
import com.simplielend.simplilend.R;

import java.util.ArrayList;

public class rejected_loan_adapter extends RecyclerView.Adapter<rejected_loan_holder> {

    Context c;
    ArrayList<rejectedloan> rejectedloans;

    public rejected_loan_adapter(Context c, ArrayList<rejectedloan> rejectedloans) {
        this.c = c;
        this.rejectedloans = rejectedloans;
    }

    @NonNull
    @Override
    public rejected_loan_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rejected_loan_item,parent,false);
        return new rejected_loan_holder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull rejected_loan_holder holder, int position) {

        holder.rej_name.setText(rejectedloans.get(position).getRej_name());
        holder.rej_email.setText(rejectedloans.get(position).getRej_email());
        holder.rej_number.setText(rejectedloans.get(position).getRej_number());
        holder.rej_purpose.setText(rejectedloans.get(position).getRej_purpose());
        holder.comment.setText(rejectedloans.get(position).getComment());
        holder.requested_amount.setText(rejectedloans.get(position).getRequested_amount());
        holder.requested_tenure.setText(rejectedloans.get(position).getRequested_tenure());
        holder.img.setImageResource(rejectedloans.get(position).getImg());
        holder.loan_type.setText(rejectedloans.get(position).getLoan_type());



    }

    @Override
    public int getItemCount() {
        return rejectedloans.size();
    }
}
