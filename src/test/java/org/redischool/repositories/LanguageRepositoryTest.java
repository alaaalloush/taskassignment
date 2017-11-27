package org.redischool.repositories;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redischool.models.Language;
import org.redischool.models.LanguageNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class LanguageRepositoryTest {

    @Autowired
    private LanguageRepository languageRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldSuccessfullySaveALanguage(){
        UUID id = UUID.randomUUID();
        Language expected = languageRepository.save(Language.builder()
                .id(id)
                .languageNames(LanguageNames.DE)
                .build());
        Language language = languageRepository.findOne(id);
        assertEquals(expected, language);
    }

}