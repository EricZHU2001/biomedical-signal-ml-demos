package portfolio.moviedb.service.interfaces;

import org.springframework.stereotype.Service;
import portfolio.moviedb.model.Report;

import java.util.List;


public interface Case2Service {
    /**
     *
     * @param movieId the id of the movie
     * @return a list of reports of the movie
     */
    List<Report> getReports(String movieId);
}
