package portfolio.moviedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.moviedb.dao.interfaces.MovieInfoDao;
import portfolio.moviedb.model.DaoParam;
import portfolio.moviedb.model.Movie;
import portfolio.moviedb.service.interfaces.Case1Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Case1ServiceImpl implements Case1Service {

    private MovieInfoDao movieInfoDao;
    /**
     * @inheritDoc
     */
    @Override
    public List<Movie> getMovies(String[] selectParams, String[] sortParams) {
        DaoParam daoParam = new DaoParam(selectParams, sortParams);
        return movieInfoDao.getSelectedAndSortedMovieList(daoParam.getSelectEnum(), daoParam.getSelectValue(), daoParam.getSortEnum(), daoParam.getSortBoolean(), daoParam.getLimit());
    }

    /**
     * @inheritDoc
     */
    @Override
    public Integer getMoviesCount(String[] selectParams, String[] sortParams) {
        DaoParam daoParam = new DaoParam(selectParams, sortParams);
        return movieInfoDao.getMovieCount(daoParam.getSelectEnum(), daoParam.getSelectValue(), daoParam.getSortEnum(), daoParam.getSortBoolean());
    }


    @Autowired
    public void setMovieInfoDao(MovieInfoDao movieInfoDao) {
        this.movieInfoDao = movieInfoDao;
    }
}
