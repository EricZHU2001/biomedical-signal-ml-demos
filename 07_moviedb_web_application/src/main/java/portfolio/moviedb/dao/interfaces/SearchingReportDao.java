package portfolio.moviedb.dao.interfaces;

import portfolio.moviedb.model.Report;

import java.util.List;

public interface SearchingReportDao {
    List<Report> getReport(int movieId);
}
