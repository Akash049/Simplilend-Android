package com.simplielend.simplilend.Holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.R;

public class Active_loan_holder extends RecyclerView.ViewHolder {

    public ImageView img;
    public TextView name;
    public TextView status_email;
    public TextView status_mobile;
    public TextView purpose;
    public TextView approved_amount;
    public TextView approved_tenure;


    public Active_loan_holder(@NonNull View itemView) {
        super(itemView);
        this.img=itemView.findViewById(R.id.img);
        this.name=itemView.findViewById(R.id.name);
        this.status_email=itemView.findViewById(R.id.status_email);
        this.status_mobile=itemView.findViewById(R.id.status_mobile);
        this.purpose=itemView.findViewById(R.id.purpose);
        this.approved_amount=itemView.findViewById(R.id.approved_amount);
        this.approved_tenure=itemView.findViewById(R.id.approved_tenure);

    }
}
