package com.hetucakra.domain.posicoes;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Posicao {

    private String nome;
    private String descricao;
    private Boolean valido;
    private Integer posicaoNaRoda;

}
