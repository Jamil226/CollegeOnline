package com.jamil.college.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jamil.college.R;
import com.jamil.college.models.NewsModel;
import com.jamil.college.utils.ApiUrls;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter
        extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final LayoutInflater mInflater;
    Context context;

    private List<NewsModel> mData =  new ArrayList<>();

    public NewsAdapter(Context context, List<NewsModel> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.snipped_news,
                viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsAdapter.ViewHolder holder,
                                 final int i) {
        holder.newsTitle.setText(mData.get(i).getNewsTitle());
        holder.newsDetails.setText(mData.get(i).getNewsDescription());
        holder.postBy.setText(mData.get(i).getNewsPostBy());
        holder.postedOn.setText(mData.get(i).getNewsDate());

        String url = ApiUrls.BASE_IMAGE_URL + mData.get(i).getNewsLink();
        // URL = "https://gpgcs.edu.pk/dean/upload/Screenshot 2024-05-13 161433_1715599192.png"

        Glide.with(context).load(url).placeholder(R.drawable.image_default).into(holder.newsImage);
        
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView newsImage;
        TextView newsTitle, postBy, postedOn, newsDetails;
        CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.tv_news_title);
            postBy = itemView.findViewById(R.id.tv_news_post_by);
            postedOn = itemView.findViewById(R.id.tv_news_posted_on);
            newsImage = itemView.findViewById(R.id.iv_news_image);
            newsDetails = itemView.findViewById(R.id.tv_news_details);
            cardView = itemView.findViewById(R.id.cv_news);
        }
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

}
