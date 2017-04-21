package unknowns.developer.ankit.javascript_eloquentjsbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.MyViewHolder> {

    private List<Chapter> ChaptersList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView numberTv, nameTv;

        public MyViewHolder(View view) {
            super(view);
            numberTv = (TextView) view.findViewById(R.id.number);
            nameTv = (TextView) view.findViewById(R.id.name);
        }
    }


    public ChaptersAdapter(List<Chapter> ChaptersList) {
        this.ChaptersList = ChaptersList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Chapter Chapter = ChaptersList.get(position);
        holder.numberTv.setText(Chapter.getNumber());
        holder.nameTv.setText(Chapter.getName());
    }

    @Override
    public int getItemCount() {
        return ChaptersList.size();
    }
}
