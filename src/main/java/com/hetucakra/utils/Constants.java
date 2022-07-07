package com.hetucakra.utils;

public class Constants {

    private Constants() {
    }

    public static final String FALHA = "Falha";

    public static final String NENHUMA_DAS_POSICOES = "Não encontrou combinação com nenhuma das posições disponíveis";


    public static final String POSICAO_UM = "Posição Um";

    public static final String POSICAO_UM_FOL = "Muito geral. FOL: ∀x(Cx->Tx) & ∀x(~Cx->Tx)";

    public static final Boolean POSICAO_UM_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_UM_POSICAO_RODA = 1;


    public static final String POSICAO_DOIS = "Posição Dois";

    public static final String POSICAO_DOIS_FOL = "FOL: ∀x(Cx->Tx) & ~∃x(~Cx&Tx)";

    public static final Boolean POSICAO_DOIS_VALIDO = Boolean.TRUE;

    public static final Integer POSICAO_DOIS_POSICAO_RODA = 2;


    public static final String POSICAO_TRES = "Posição Três";

    public static final String POSICAO_TRES_FOL = "Muito geral. FOL: ∀x(Cx->Tx) & ∃x(~Cx&Tx)";

    public static final Boolean POSICAO_TRES_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_TRES_POSICAO_RODA = 3;


    public static final String POSICAO_QUATRO = "Posição Quatro";

    public static final String POSICAO_QUATRO_FOL = "Conceitualmente paradoxal. FOL: ~∃x(Cx&Tx) & ∀x(~Cx->Tx)";

    public static final Boolean POSICAO_QUATRO_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_QUATRO_POSICAO_RODA = 4;


    public static final String POSICAO_CINCO = "Posição Cinco";

    public static final String POSICAO_CINCO_FOL = "Muito restrito. FOL: ~∃x(Cx&Tx) & ~∃x(~Cx&Tx)";

    public static final Boolean POSICAO_CINCO_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_CINCO_POSICAO_RODA = 5;


    public static final String POSICAO_SEIS = "Posição Seis";

    public static final String POSICAO_SEIS_FOL = "Conceitualmente paradoxal. FOL: ~∃x(Cx&Tx) & ∃x(~Cx&Tx)";

    public static final Boolean POSICAO_SEIS_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_SEIS_POSICAO_RODA = 6;


    public static final String POSICAO_SETE = "Posição Sete";

    public static final String POSICAO_SETE_FOL = "Muito geral. FOL: ∃x(Cx&Tx) & ∀x(~Cx->Tx)";

    public static final Boolean POSICAO_SETE_VALIDO =  Boolean.FALSE;

    public static final Integer POSICAO_SETE_POSICAO_RODA = 7;


    public static final String POSICAO_OITO = "Posição Oito";

    public static final String POSICAO_OITO_FOL = "Válido. FOL: ∃x(Cx&Tx) & ~∃x(~Cx&Tx)";

    public static final Boolean POSICAO_OITO_VALIDO = Boolean.TRUE;

    public static final Integer POSICAO_OITO_POSICAO_RODA = 8;


    public static final String POSICAO_NOVE = "Posição Nove";

    public static final String POSICAO_NOVE_FOL = "Muito geral. FOL: ∃x(Cx&Tx) & ∃x(~Cx&Tx)";

    public static final Boolean POSICAO_NOVE_VALIDO = Boolean.FALSE;

    public static final Integer POSICAO_NOVE_POSICAO_RODA = 9;


    public static final String LOG_PATTERN = "anumana={}";
}
