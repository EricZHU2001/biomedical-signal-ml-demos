package portfolio.moviedb.dao.interfaces;

import java.util.HashMap;
import java.util.List;
import portfolio.moviedb.model.Movie;

public interface PolarisingDao {
    List<Movie> getPolarisingMovieList(String limit);
}