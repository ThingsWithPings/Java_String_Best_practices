package com.teciezone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 3/19/2023
 */

public class LanguageStudent {

    List<String> languageList = new ArrayList<>();

    public void addLanguage(String language){
        languageList.add(language);
    }

    protected Collection<String> getLanguages() {
        return languageList;
    }
}
