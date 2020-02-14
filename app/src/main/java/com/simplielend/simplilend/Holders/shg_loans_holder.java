package com.simplielend.simplilend.Holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simplielend.simplilend.R;

public class shg_loans_holder extends RecyclerView.ViewHolder {

    public TextView tenures,purposes,p1,p2,p3,p4,amounts,interests,dates;


    public shg_loans_holder(@NonNull View itemView) {
        super(itemView);

        this.dates=itemView.findViewById(R.id.dates);
        this.interests=itemView.findViewById(R.id.interests);
        this.tenures=itemView.findViewById(R.id.tenures);
        this.purposes=itemView.findViewById(R.id.purposes);
        this.amounts=itemView.findViewById(R.id.amounts);
        this.p1=itemView.findViewById(R.id.p1);
        this.p2=itemView.findViewById(R.id.p2);
        this.p3=itemView.findViewById(R.id.p3);
        this.p4=itemView.findViewById(R.id.p4);



    }
}
