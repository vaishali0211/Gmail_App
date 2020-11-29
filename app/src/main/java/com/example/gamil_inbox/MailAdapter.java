
package com.example.gamil_inbox;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MailAdapter extends RecyclerView.Adapter<MailViewHolder> {
private List mEmailData;
private Context mContext;
private Layout mLayout;
public MailAdapter(Context mContext, EmailData mEmailData){
//    this.mEmailData= mEmailData;
    this.mContext=mContext;
}


    @NonNull
    @Override
    public MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_mail_item,parent,false);
        return new MailViewHolder(view);


    }


    @Override
    public void onBindViewHolder(@NonNull MailViewHolder holder, int position) {

        holder.mSender.setText(mEmailData.get(position).toString());
        holder.mEmailTitle.setText(mEmailData.get(position).toString());
        holder.mEmailDetails.setText(mEmailData.get(position).toString());
        holder.mEmailTime.setText(mEmailData.get(position).toString());

        holder.mIcon.setText(mEmailData.get(position).toString().substring(0, 1));

        holder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("sender", holder.mSender.getText().toString());
                mIntent.putExtra("title", holder.mEmailTitle.getText().toString());
                mIntent.putExtra("details", holder.mEmailDetails.getText().toString());
                mIntent.putExtra("time", holder.mEmailTime.getText().toString());
                mIntent.putExtra("icon", holder.mIcon.getText().toString());
                mIntent.putExtra("colorIcon",true);
                mContext.startActivity(mIntent);
            }
        });

        holder.mFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.mFavorite.getColorFilter() !=null){
                    holder.mFavorite.clearColorFilter();
                }else {
                    holder.mFavorite.setColorFilter(ContextCompat.getColor(mContext,R.color.colorPrimary));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mEmailData.size();
    }
}
