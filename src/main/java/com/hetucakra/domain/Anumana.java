package com.hetucakra.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "anumana")
public class Anumana {

    private final String valuePredicadoDaHipoteseDoExSimilarUm = "Verdade";
    private final String valuePredicadoDaHipoteseDoExDissimilarUm = "Falsidade";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Hipótese
    private String sujeitoHipotese;
    private String predicadoHipotese;

    //Justificativa
    private String sujeitoJustificativa;
    private String predicadoJustificativa;

    //Exemplo Similar Um
    private String sujeitoExemploSimilarUm;
    private String predicadoDaHipoteseDoExSimilarUm;
    private String predicadoDaJustificativaDoExSimilarUm;
    private String valuePredicadoDaJustificativaDoExSimilarUm;

    //Exemplo Similar Dois
    private String sujeitoExemploSimilarDois;
    private String predicadoDaHipoteseDoExSimilarDois;
    private String haUmExemploSimilarDistinto;

    //Exemplo Dissimilar Um
    private String sujeitoExemploDissimilarUm;
    private String predicadoDaHipoteseDoExDissimilarUm;
    private String predicadoDaJustificativaDoExDissimilarUm;
    private String valuePredicadoDaJustificativaDoExDissimilarUm;

    //Exemplo Dissimilar Dois
    private String sujeitoExemploDissimilarDois;
    private String predicadoDaHipoteseDoExDissimilarDois;
    private String haUmExemploDissimilarDistinto;
}
