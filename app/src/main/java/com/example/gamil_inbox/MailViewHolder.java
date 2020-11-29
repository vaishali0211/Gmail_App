
package com.example.gamil_inbox;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MailViewHolder extends RecyclerView.ViewHolder{
    public View mLayout;
    TextView mIcon;
TextView mSender;
TextView mDetails;
TextView mEmailDetails;
TextView mEmailTitle;
TextView mEmailTime;
ImageView mFavorite;
    public MailViewHolder(@NonNull View itemView) {
        super(itemView);

        mIcon=itemView.findViewById(R.id.tvIcon);
        mDetails=itemView.findViewById(R.id.tvEmailDetails);
        mEmailTime=itemView.findViewById(R.id.tvEmailTime);
        mEmailTitle=itemView.findViewById(R.id.tvEmailTitle);
        mFavorite=itemView.findViewById(R.id.ivFavorite);
        mSender=itemView.findViewById(R.id.tvEmailSender);

    }

}
