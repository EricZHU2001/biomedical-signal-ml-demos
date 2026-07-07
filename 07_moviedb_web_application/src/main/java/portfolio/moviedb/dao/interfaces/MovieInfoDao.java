package portfolio.moviedb.dao.interfaces;

import portfolio.moviedb.model.Movie;

import java.util.List;

public interface MovieInfoDao {
    Movie getMovieInfoByMovieId(int movieId);
    List<Movie> getSelectedAndSortedMovieList(List<Integer> selectEnum, List<String> selectValue, List<Integer> sortEnum, List<Boolean> sortBoolean, String limitValue);
    Integer getMovieCount(List<Integer> selectEnum, List<String> selectValue, List<Integer> sortEnum, List<Boolean> sortBoolean);
}
