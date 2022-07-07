package com.hetucakra.service;

import com.hetucakra.domain.posicoes.Posicao;
import com.hetucakra.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class RetornaPosicoesService {

    public Posicao retornaPosicaoUm(){
        var posicaoUm = new Posicao();
        posicaoUm.setNome(Constants.POSICAO_UM);
        posicaoUm.setDescricao(Constants.POSICAO_UM_FOL);
        posicaoUm.setValido(Constants.POSICAO_UM_VALIDO);
        posicaoUm.setPosicaoNaRoda(Constants.POSICAO_UM_POSICAO_RODA);
        return posicaoUm;
    }

    public Posicao retornaPosicaoDois(){
        var posicaoDois = new Posicao();
        posicaoDois.setNome(Constants.POSICAO_DOIS);
        posicaoDois.setDescricao(Constants.POSICAO_DOIS_FOL);
        posicaoDois.setValido(Constants.POSICAO_DOIS_VALIDO);
        posicaoDois.setPosicaoNaRoda(Constants.POSICAO_DOIS_POSICAO_RODA);
        return posicaoDois;
    }

    public Posicao retornaPosicaoTres(){
        var posicaoTres = new Posicao();
        posicaoTres.setNome(Constants.POSICAO_TRES);
        posicaoTres.setDescricao(Constants.POSICAO_TRES_FOL);
        posicaoTres.setValido(Constants.POSICAO_TRES_VALIDO);
        posicaoTres.setPosicaoNaRoda(Constants.POSICAO_TRES_POSICAO_RODA);
        return posicaoTres;
    }

    public Posicao retornaPosicaoQuatro(){
        var posicaoQuatro = new Posicao();
        posicaoQuatro.setNome(Constants.POSICAO_QUATRO);
        posicaoQuatro.setDescricao(Constants.POSICAO_QUATRO_FOL);
        posicaoQuatro.setValido(Constants.POSICAO_QUATRO_VALIDO);
        posicaoQuatro.setPosicaoNaRoda(Constants.POSICAO_QUATRO_POSICAO_RODA);
        return posicaoQuatro;
    }

    public Posicao retornaPosicaoCinco(){
        var posicaoCinco = new Posicao();
        posicaoCinco.setNome(Constants.POSICAO_CINCO);
        posicaoCinco.setDescricao(Constants.POSICAO_CINCO_FOL);
        posicaoCinco.setValido(Constants.POSICAO_CINCO_VALIDO);
        posicaoCinco.setPosicaoNaRoda(Constants.POSICAO_CINCO_POSICAO_RODA);
        return posicaoCinco;
    }

    public Posicao retornaPosicaoSeis(){
        var posicaoSeis = new Posicao();
        posicaoSeis.setNome(Constants.POSICAO_SEIS);
        posicaoSeis.setDescricao(Constants.POSICAO_SEIS_FOL);
        posicaoSeis.setValido(Constants.POSICAO_SEIS_VALIDO);
        posicaoSeis.setPosicaoNaRoda(Constants.POSICAO_SEIS_POSICAO_RODA);
        return posicaoSeis;
    }

    public Posicao retornaPosicaoSete(){
        var posicaoSete = new Posicao();
        posicaoSete.setNome(Constants.POSICAO_SETE);
        posicaoSete.setDescricao(Constants.POSICAO_SETE_FOL);
        posicaoSete.setValido(Constants.POSICAO_SETE_VALIDO);
        posicaoSete.setPosicaoNaRoda(Constants.POSICAO_SETE_POSICAO_RODA);
        return posicaoSete;
    }

    public Posicao retornaPosicaoOito(){
        var posicaoOito = new Posicao();
        posicaoOito.setNome(Constants.POSICAO_OITO);
        posicaoOito.setDescricao(Constants.POSICAO_OITO_FOL);
        posicaoOito.setValido(Constants.POSICAO_OITO_VALIDO);
        posicaoOito.setPosicaoNaRoda(Constants.POSICAO_OITO_POSICAO_RODA);
        return posicaoOito;
    }

    public Posicao retornaPosicaoNove(){
        var posicaoNove = new Posicao();
        posicaoNove.setNome(Constants.POSICAO_NOVE);
        posicaoNove.setDescricao(Constants.POSICAO_NOVE_FOL);
        posicaoNove.setValido(Constants.POSICAO_NOVE_VALIDO);
        posicaoNove.setPosicaoNaRoda(Constants.POSICAO_NOVE_POSICAO_RODA);
        return posicaoNove;
    }
}
