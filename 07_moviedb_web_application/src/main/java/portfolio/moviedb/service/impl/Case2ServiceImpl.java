package portfolio.moviedb.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.moviedb.dao.interfaces.SearchingReportDao;
import portfolio.moviedb.model.Report;
import portfolio.moviedb.service.interfaces.Case2Service;

import java.util.List;

@Service
public class Case2ServiceImpl implements Case2Service {
    SearchingReportDao searchingReportDao;

    @Override
    public List<Report> getReports(String movieId) {
        return searchingReportDao.getReport(Integer.parseInt(movieId));
    }

    @Autowired
    public void setSearchingReportDao(SearchingReportDao searchingReportDao) {
        this.searchingReportDao = searchingReportDao;
    }

}
