package com.hetucakra.service;

import com.hetucakra.domain.Anumana;
import com.hetucakra.domain.posicoes.Posicao;
import com.hetucakra.repository.AnumanaRepository;
import com.hetucakra.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.TRUE;


@Service
@Slf4j
public class AnumanaService {

    @Autowired
    private RetornaPosicoesService retornaPosicao;

    @Autowired
    private DeterminaQualPosicaoService validaTipoDePosicao;

    @Autowired
    private AnumanaRepository anumanaRepository;

    public Object retornaPosicao(Anumana anumana) {

        anumanaRepository.save(anumana);

        var posicaoUm = this.retornaPosicao.retornaPosicaoUm();

        if (this.validaTipoDePosicao.determinaSePosicaoUm(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoUm;
        }

        var posicaoDois = this.retornaPosicao.retornaPosicaoDois();

        if (this.validaTipoDePosicao.determinaSePosicaoDois(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoDois;
        }


        var posicaoTres = this.retornaPosicao.retornaPosicaoTres();

        if (this.validaTipoDePosicao.determinaSePosicaoTres(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoTres;
        }


        var posicaoQuatro = this.retornaPosicao.retornaPosicaoQuatro();

        if (this.validaTipoDePosicao.determinaSePosicaoQuatro(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoQuatro;
        }

        var posicaoCinco = this.retornaPosicao.retornaPosicaoCinco();

        if (this.validaTipoDePosicao.validaSePosicaoCinco(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoCinco;
        }

        var posicaoSeis = this.retornaPosicao.retornaPosicaoSeis();

        if (this.validaTipoDePosicao.validaSePosicaoSeis(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoSeis;
        }

        var posicaoSete = this.retornaPosicao.retornaPosicaoSete();

        if (this.validaTipoDePosicao.validaSePosicaoSete(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoSete;
        }

        var posicaoOito = this.retornaPosicao.retornaPosicaoOito();

        if (this.validaTipoDePosicao.validaSePosicaoOito(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoOito;
        }

        var posicaoNove = this.retornaPosicao.retornaPosicaoNove();

        if (this.validaTipoDePosicao.validaSePosicaoNove(anumana).equals(TRUE)) {
            log.info(Constants.LOG_PATTERN, anumana);
            return posicaoNove;
        }

        log.warn(Constants.FALHA);

        return this.validaTipoDePosicao.paraTestesCasoFalhe();
    }

    public List<Anumana> listAll() {
        return anumanaRepository.findAll();
    }

}
