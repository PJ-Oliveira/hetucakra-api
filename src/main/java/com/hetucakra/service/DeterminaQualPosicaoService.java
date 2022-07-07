package com.hetucakra.service;

import com.hetucakra.domain.Anumana;
import com.hetucakra.domain.valores.ValoresLogicos;
import com.hetucakra.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class DeterminaQualPosicaoService {

    public Boolean determinaSePosicaoUm(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }

        return result;
    }

    public Boolean determinaSePosicaoDois(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }

        return result;
    }

    public Boolean determinaSePosicaoTres(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && (anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)

                || (anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)))


                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.VERDADE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean determinaSePosicaoQuatro(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean validaSePosicaoCinco(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean validaSePosicaoSeis(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.INEXISTENTE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && (anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)
                || anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE))

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.VERDADE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean validaSePosicaoSete(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && (anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                || anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE))

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.VERDADE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean validaSePosicaoOito(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && (anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                || anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE))

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.VERDADE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.INEXISTENTE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public Boolean validaSePosicaoNove(Anumana anumana) {
        var result = Boolean.valueOf(false);
        if (anumana.getValuePredicadoDaHipoteseDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                && (anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.VERDADE)
                || anumana.getValuePredicadoDaJustificativaDoExSimilarUm().equals(ValoresLogicos.FALSIDADE))

                && anumana.getHaUmExemploSimilarDistinto().equals(ValoresLogicos.VERDADE)

                && anumana.getValuePredicadoDaHipoteseDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE)
                && (anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.VERDADE)
                || anumana.getValuePredicadoDaJustificativaDoExDissimilarUm().equals(ValoresLogicos.FALSIDADE))

                && anumana.getHaUmExemploDissimilarDistinto().equals(ValoresLogicos.VERDADE)
        ) {
            result = Boolean.TRUE;
        }
        return result;
    }

    public String paraTestesCasoFalhe(){
        return Constants.NENHUMA_DAS_POSICOES;
    }


}
