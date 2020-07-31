package br.com.wmarvyn.newloteria.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;



@Entity
public class Lotofacil implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer concurso;


   //@NotEmpty(message ="Preenchimento obrigatorio")
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date dataSorteio;
    private Integer bola1;
    private Integer bola2;
    private Integer bola3;
    private Integer bola4;
    private Integer bola5;
    private Integer bola6;
    private Integer bola7;
    private Integer bola8;
    private Integer bola9;
    private Integer bola10;
    private Integer bola11;
    private Integer bola12;
    private Integer bola13;
    private Integer bola14;
    private Integer bola15;
    private Integer ganh15Numeros;
    private Integer ganh14Numeros;
    private Integer ganh13Numeros;
    private Integer ganh12Numeros;
    private Integer ganh11Numeros;

    public Lotofacil(){
    }

    public Lotofacil(Integer concurso, Date dataSorteio, Integer bola1, Integer bola2, Integer bola3, Integer bola4, Integer bola5, Integer bola6, Integer bola7, Integer bola8, Integer bola9, Integer bola10, Integer bola11, Integer bola12, Integer bola13, Integer bola14, Integer bola15, Integer ganh15Numeros, Integer ganh14Numeros, Integer ganh13Numeros, Integer ganh12Numeros, Integer ganh11Numeros) {
        this.concurso = concurso;
        this.dataSorteio = dataSorteio;
        this.bola1 = bola1;
        this.bola2 = bola2;
        this.bola3 = bola3;
        this.bola4 = bola4;
        this.bola5 = bola5;
        this.bola6 = bola6;
        this.bola7 = bola7;
        this.bola8 = bola8;
        this.bola9 = bola9;
        this.bola10 = bola10;
        this.bola11 = bola11;
        this.bola12 = bola12;
        this.bola13 = bola13;
        this.bola14 = bola14;
        this.bola15 = bola15;
        this.ganh15Numeros = ganh15Numeros;
        this.ganh14Numeros = ganh14Numeros;
        this.ganh13Numeros = ganh13Numeros;
        this.ganh12Numeros = ganh12Numeros;
        this.ganh11Numeros = ganh11Numeros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConcurso() {
        return concurso;
    }

    public void setConcurso(Integer concurso) {
        this.concurso = concurso;
    }

    public Date getDataSorteio() {
        return dataSorteio;
    }

    public void setDataSorteio(Date dataSorteio) {
        this.dataSorteio = dataSorteio;
    }

    public Integer getBola1() {
        return bola1;
    }

    public void setBola1(Integer bola1) {
        this.bola1 = bola1;
    }

    public Integer getBola2() {
        return bola2;
    }

    public void setBola2(Integer bola2) {
        this.bola2 = bola2;
    }

    public Integer getBola3() {
        return bola3;
    }

    public void setBola3(Integer bola3) {
        this.bola3 = bola3;
    }

    public Integer getBola4() {
        return bola4;
    }

    public void setBola4(Integer bola4) {
        this.bola4 = bola4;
    }

    public Integer getBola5() {
        return bola5;
    }

    public void setBola5(Integer bola5) {
        this.bola5 = bola5;
    }

    public Integer getBola6() {
        return bola6;
    }

    public void setBola6(Integer bola6) {
        this.bola6 = bola6;
    }

    public Integer getBola7() {
        return bola7;
    }

    public void setBola7(Integer bola7) {
        this.bola7 = bola7;
    }

    public Integer getBola8() {
        return bola8;
    }

    public void setBola8(Integer bola8) {
        this.bola8 = bola8;
    }

    public Integer getBola9() {
        return bola9;
    }

    public void setBola9(Integer bola9) {
        this.bola9 = bola9;
    }

    public Integer getBola10() {
        return bola10;
    }

    public void setBola10(Integer bola10) {
        this.bola10 = bola10;
    }

    public Integer getBola11() {
        return bola11;
    }

    public void setBola11(Integer bola11) {
        this.bola11 = bola11;
    }

    public Integer getBola12() {
        return bola12;
    }

    public void setBola12(Integer bola12) {
        this.bola12 = bola12;
    }

    public Integer getBola13() {
        return bola13;
    }

    public void setBola13(Integer bola13) {
        this.bola13 = bola13;
    }

    public Integer getBola14() {
        return bola14;
    }

    public void setBola14(Integer bola14) {
        this.bola14 = bola14;
    }

    public Integer getBola15() {
        return bola15;
    }

    public void setBola15(Integer bola15) {
        this.bola15 = bola15;
    }

    public Integer getGanh15Numeros() {
        return ganh15Numeros;
    }

    public void setGanh15Numeros(Integer ganh15Numeros) {
        this.ganh15Numeros = ganh15Numeros;
    }

    public Integer getGanh14Numeros() {
        return ganh14Numeros;
    }

    public void setGanh14Numeros(Integer ganh14Numeros) {
        this.ganh14Numeros = ganh14Numeros;
    }

    public Integer getGanh13Numeros() {
        return ganh13Numeros;
    }

    public void setGanh13Numeros(Integer ganh13Numeros) {
        this.ganh13Numeros = ganh13Numeros;
    }

    public Integer getGanh12Numeros() {
        return ganh12Numeros;
    }

    public void setGanh12Numeros(Integer ganh12Numeros) {
        this.ganh12Numeros = ganh12Numeros;
    }

    public Integer getGanh11Numeros() {
        return ganh11Numeros;
    }

    public void setGanh11Numeros(Integer ganh11Numeros) {
        this.ganh11Numeros = ganh11Numeros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lotofacil lotofacil = (Lotofacil) o;
        return id.equals(lotofacil.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}