package portfolio.moviedb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import portfolio.moviedb.model.Movie;
import portfolio.moviedb.service.interfaces.Case3Service;

import java.util.List;

@Controller
public class Case3Controller {
    private Case3Service case3Service;

    @ResponseBody
    @RequestMapping("getPopularMoviesByAvgRating/{limitStart}/{limitLength}.do")
    public List<Movie> getPopularMoviesByAvgRating(@PathVariable("limitStart") String limitStart,
                                                   @PathVariable("limitLength") String limitLength){
        return case3Service.getPopularMoviesAverage(limitStart + ", " + limitLength);
    }

    @ResponseBody
    @RequestMapping("getPopularMoviesByCountRating/{limitStart}/{limitLength}.do")
    public List<Movie> getPopularMoviesByCountRating(@PathVariable("limitStart") String limitStart,
                                                     @PathVariable("limitLength") String limitLength){
        return case3Service.getPopularMoviesByRating(limitStart + ", " + limitLength);
    }

    @ResponseBody
    @RequestMapping("getPopularMoviesByCountTags/{limitStart}/{limitLength}.do")
    public List<Movie> getPopularMoviesByCountTags(@PathVariable("limitStart") String limitStart,
                                                   @PathVariable("limitLength") String limitLength){
        return case3Service.getPopularMoviesByTags(limitStart + ", " + limitLength);
    }

    @ResponseBody
    @RequestMapping("getPolarizingMovies/{limitStart}/{limitLength}.do")
    public List<Movie> getPolarizingMovies(@PathVariable("limitStart") String limitStart,
                                           @PathVariable("limitLength") String limitLength){
        return case3Service.getPolarizingMovies(limitStart + ", " + limitLength);
    }

    @Autowired
    public void setCase3Service(Case3Service case3Service) {
        this.case3Service = case3Service;
    }
}
