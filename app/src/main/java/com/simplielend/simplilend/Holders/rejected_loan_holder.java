package com.simplielend.simplilend.Holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.R;

public class rejected_loan_holder extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView rej_name;
    public TextView rej_email;
    public TextView rej_number;
    public TextView rej_purpose;
    public TextView requested_amount;
    public TextView requested_tenure;
    public TextView comment;


    public rejected_loan_holder(@NonNull View itemView) {
        super(itemView);
        this.img=itemView.findViewById(R.id.img);
        this.rej_name=itemView.findViewById(R.id.rej_name);
        this.rej_email=itemView.findViewById(R.id.rej_email);
        this.rej_number=itemView.findViewById(R.id.rej_number);
        this.rej_purpose=itemView.findViewById(R.id.rej_purpose);
        this.requested_amount=itemView.findViewById(R.id.requested_amount);
        this.requested_tenure=itemView.findViewById(R.id.requested_tenure);
        this.comment=itemView.findViewById(R.id.comment);

    }
}
