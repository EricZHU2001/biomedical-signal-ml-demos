package portfolio.moviedb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import portfolio.moviedb.model.Movie;
import portfolio.moviedb.model.Report;
import portfolio.moviedb.service.interfaces.Case2Service;

import java.util.List;

@Controller
public class Case2Controller {
    private Case2Service case2Service;

    @RequestMapping("/getReportsById/{movieId}/{movieName}/{movieRating}.do")
    public String getReportsById(Model model,
                                 @PathVariable("movieId") String movieId,
                                 @PathVariable("movieName") String movieName,
                                 @PathVariable("movieRating") String movieRating){
        List<Report> reports =  case2Service.getReports(movieId);
        model.addAttribute("reports", reports);
        model.addAttribute("movieId", movieId);
        model.addAttribute("movieName", movieName);
        model.addAttribute("movieRating", movieRating);
        return "report";
    }

    @Autowired
    public void setCase2Service(Case2Service case2Service) {
        this.case2Service = case2Service;
    }

}
