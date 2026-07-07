package portfolio.moviedb.dao.interfaces;

import java.util.HashMap;
import java.util.List;
import portfolio.moviedb.model.Movie;

public interface PopularDao {
    //order by ratings
    List<Movie> getPopularMovieAvgList(String limit);
    //order by number of tags
    List<Movie> getPopularMovieTagsList(String limit);
    //order by number of ratings
    List<Movie> getPopularMovieRatingsList(String limit);
}