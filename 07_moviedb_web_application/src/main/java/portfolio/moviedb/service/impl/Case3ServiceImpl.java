package portfolio.moviedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import portfolio.moviedb.dao.interfaces.PolarisingDao;
import portfolio.moviedb.dao.interfaces.PopularDao;
import portfolio.moviedb.model.Movie;
import portfolio.moviedb.service.interfaces.Case3Service;

import java.util.List;

@Service
public class Case3ServiceImpl implements Case3Service {
    private PolarisingDao polarisingDao;
    private PopularDao popularDao;
    @Override
    public List<Movie> getPolarizingMovies(String limit) {
        return polarisingDao.getPolarisingMovieList(limit);
    }

    @Override
    public List<Movie> getPopularMoviesAverage(String limit) {
        return popularDao.getPopularMovieAvgList(limit);
    }

    @Override
    public List<Movie> getPopularMoviesByTags(String limit) {
        return popularDao.getPopularMovieTagsList(limit);
    }

    @Override
    public List<Movie> getPopularMoviesByRating(String limit) {
        return popularDao.getPopularMovieRatingsList(limit);
    }

    @Autowired
    public void setPolarisingDao(PolarisingDao polarisingDao) {
        this.polarisingDao = polarisingDao;
    }

    @Autowired
    public void setPopularDao(PopularDao popularDao) {
        this.popularDao = popularDao;
    }
}
