package com.javaChapter14;

import java.security.SecureRandom;

public class RandomSentences {

    private String[] articles = { "the", "a", "one", "some","any"};
    private String[] noun = {"boy", "girl", "dog", "town" , "car"};
    private String[] verb = {"drove", "jumped", "ran", "walked","skipped"};
    private String[] preposition = {"to", "from", "over", "under","on"};

    public String[] getArticlesArray() {
        return articles;
    }

    public void setArticleArray(String[] newArticles) {
        this.articles = newArticles;
    }

    public String[] getNounArray() {
        return  noun;
    }

    public void setNounArray(String[] newNouns) {
        this.noun = newNouns;
    }

    public String[] getVerbArray() {
        return verb;
    }

    public void setVerbArray(String[] newVerbs) {
        this.verb = newVerbs;
    }

    public String[] getPrepositionArray() {
        return preposition;
    }

    public void setPrepositionArray(String[] newPreposition) {
        this.preposition = newPreposition;
    }

//    public String sentencesGeneratorAtRandom() {
//        SecureRandom random = new SecureRandom();
//        StringBuilder builder = new StringBuilder();
//        builder.append(articles);
//        builder.append(" ");
//        int wordIndex = random.nextInt(6);
//        articles = articles[wordIndex];
//
//    }
}
