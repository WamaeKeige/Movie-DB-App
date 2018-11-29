package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.awake.moviedb.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import model.Movie;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private List<Movie> movies;
    private int rowLayout;
    private Context context;
    private String POSTER_PATH = "https://image.tmdb.org/t/p/w400";


    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        public ImageView thumbnail;
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView vote_average, overview,subtitle;

        public MovieViewHolder(View v) {
            super(v);
            moviesLayout =(LinearLayout)v.findViewById(R.id.movielayout);
            movieTitle = (TextView)v.findViewById(R.id.txttitle);
            subtitle = (TextView)v.findViewById(R.id.txtsubtitle);
            vote_average = (TextView)v.findViewById(R.id.txtrating);
            overview = (TextView)v.findViewById(R.id.txtdescription);
            thumbnail = (ImageView) v.findViewById(R.id.posterimg);
        }
    }
    public MoviesAdapter(List<Movie>movies, int rowLayout, Context context){
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @NonNull
    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        holder.movieTitle.setText(movies.get(position).getTitle());
        holder.overview.setText(movies.get(position).getOverview());
        holder.vote_average.setText(movies.get(position).getVote_average());
        holder.subtitle.setText(movies.get(position).getOriginal_title());
        //load poster image with picasso
        Movie movie = movies.get(position);
        Picasso.get().load(POSTER_PATH + movies.get(position).getPoster_path()).into(holder.thumbnail);
                //.error(R.drawable.ic_launcher_background)
                //.placeholder(R.drawable.ic_launcher_background)
               // .into(holder.thumbnail);


    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
