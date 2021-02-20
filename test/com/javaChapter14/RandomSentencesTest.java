package com.javaChapter14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentencesTest {
        RandomSentences generator;
        SecureRandom random;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
@Test
    void testToGetArrayOfArticles(){
        generator = new RandomSentences();
        assertNotNull(generator.getArticlesArray());
        assertEquals(5,generator.getArticlesArray().length);
}
@Test
    void testThat_ArrayOfArticlesCanBeUpdated(){
        generator = new RandomSentences();
        generator.setArticleArray(new String[]{"boy", "girl", "go", "these", "house"});
        assertEquals(5,generator.getArticlesArray().length);
        generator.setArticleArray(new String[]{"boy", "girl", "go", "these", "house","reach"});
        assertEquals(6,generator.getArticlesArray().length);
}
    @Test
    void testToGetArrayOfNoun(){
        generator = new RandomSentences();
        assertNotNull(generator.getNounArray());
        assertEquals(5,generator.getNounArray().length);
    }
    @Test
    void testThat_ArrayOfNounCanBeUpdated(){
        generator = new RandomSentences();
        generator.setNounArray(new String[]{"boy", "girl", "go", "house"});
        assertEquals(4,generator.getNounArray().length);
        generator.setNounArray(new String[]{"boy", "girl", "go", "these","house","reach"});
        assertEquals(6,generator.getNounArray().length);
    }
    @Test
    void testToGetArrayOfVerb(){
        generator = new RandomSentences();
        assertNotNull(generator.getVerbArray());
        assertEquals(5,generator.getVerbArray().length);
    }
    @Test
    void testThat_ArrayOfVerbCanBeUpdated(){
        generator = new RandomSentences();
        generator.setVerbArray(new String[]{"boy", "girl", "go","goes","these", "house"});
        assertEquals(6,generator.getVerbArray().length);
        generator.setVerbArray(new String[]{"go", "these", "house","reach"});
        assertEquals(4,generator.getVerbArray().length);
    }
    @Test
    void testToGetArrayOfPreposition(){
        generator = new RandomSentences();
        assertNotNull(generator.getPrepositionArray());
        assertEquals(5,generator.getPrepositionArray().length);
    }
    @Test
    void testThat_ArrayOfPrepositionCanBeUpdated(){
        generator = new RandomSentences();
        generator.setPrepositionArray(new String[]{"boy", "girl"});
        assertEquals(2,generator.getPrepositionArray().length);
        generator.setPrepositionArray(new String[]{"boy", "girl", "go", "these", "house","reach"});
        assertEquals(6,generator.getPrepositionArray().length);
    }
//    @Test
//    void testToGenerateSentence(){
//        generator = new RandomSentences();
//        random = new SecureRandom();
//        String sentences = generator.sentencesGeneratorAtRandom();
//        assertNotNull(sentences);
//    }

}