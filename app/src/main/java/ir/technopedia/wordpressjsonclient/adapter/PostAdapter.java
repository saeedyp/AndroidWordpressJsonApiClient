package ir.technopedia.wordpressjsonclient.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.technopedia.wordpressjsonclient.Model.PostModel;
import ir.technopedia.wordpressjsonclient.R;

/**
 * Created by TheLoneWolf on 9/3/2016.
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.DataObjectHolder> {

    List<PostModel> mDataset;
    Context context;

    public PostAdapter(Context context, List<PostModel> myDataset) {
        this.mDataset = myDataset;
        this.context = context;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_post, parent, false);
        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.title.setText(mDataset.get(position).title);
        holder.category.setText(mDataset.get(position).categories.get(0));
        int count = mDataset.get(position).comment_count;
        if (!mDataset.get(position).comment_status.equals("open") && !(mDataset.get(position).comment_count > 0)) {
            holder.comments.setVisibility(View.GONE);
        } else {
            holder.comments.setVisibility(View.VISIBLE);
            String countText = (count == 1 || count == 0) ? count + " Comment" : count + " Comments";
            holder.comments.setText(countText);
        }

        Picasso.with(context)
                .load(mDataset.get(position).img)
                .placeholder(R.drawable.placeholder)
                .into(holder.img);
    }

    public void addItem(PostModel dataObj, int index) {
        mDataset.add(dataObj);
        notifyItemInserted(index);
    }

    public void update(List<PostModel> list) {
        mDataset = list;
        notifyDataSetChanged();
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder {

        TextView title, comments, category;
        ImageView img;

        public DataObjectHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            comments = (TextView) itemView.findViewById(R.id.comment_count);
            category = (TextView) itemView.findViewById(R.id.category);
            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}