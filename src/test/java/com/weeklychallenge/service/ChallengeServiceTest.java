package com.weeklychallenge.service;

import com.weeklychallenge.application.model.ChallengeEntity;
import com.weeklychallenge.repository.ChallengeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ChallengeServiceTest {

    @Mock
    private ChallengeRepository repository;

    @InjectMocks
    private ChallengeService service;

    //  Casos de teste:
//  sucesso -> conseguiu encontrar corretamente tds os registros
//  erro -> nao conseguiu pegar algum caso por n motivo
    @Test
    void getAllProducts() {
        repository.findAll();
    }

    //  Casos de teste:
//  sucesso -> conseguiu criar corretamente um novo produto
//  erro -> nao conseguiu criar um produto pq faltou algo no body
    @Test
    void createProduct() {
        ChallengeEntity request = new ChallengeEntity();
        request.setName("Test");
        request.setPrice(100.00);
        request.setDescription("Test description");

        ChallengeEntity save = repository.save(new ChallengeEntity());
        ChallengeEntity product = service.createProduct(save);

//        Assert
//        assertThat(repository.save(request), true);
        assertThat(product, not(nullValue()));
    }
}