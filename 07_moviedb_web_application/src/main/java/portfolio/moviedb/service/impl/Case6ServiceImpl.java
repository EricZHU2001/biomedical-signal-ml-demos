package portfolio.moviedb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.moviedb.dao.interfaces.PersonalityByTagsDao;
import portfolio.moviedb.model.Personality;
import portfolio.moviedb.service.interfaces.Case6Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
@Service
public class Case6ServiceImpl implements Case6Service {

    private PersonalityByTagsDao personalityByTagsDao;
    private boolean isInitialized =false;

    @Override
    public void initialize() {
        if(!isInitialized){
            personalityByTagsDao.initialize();
            isInitialized = true;
        }
    }

    @Override
    public List<String> getTagsByFirstLetter(char letter) {
        return personalityByTagsDao.getTagsByInitialLetter(letter);
    }

    @Override
    public HashMap<String, Personality> getPersonalitiesByTags(String[] tags) {
        return personalityByTagsDao.getPersonalitiesByTags( Arrays.asList(tags));
    }

    @Override
    public Personality getAllTagsAveragePersonality() {
        return personalityByTagsDao.getAllTagsAveragePersonality();
    }

    @Autowired
    public void setPersonalityByTagsDao(PersonalityByTagsDao personalityByTagsDao) {
        this.personalityByTagsDao = personalityByTagsDao;
    }
}
