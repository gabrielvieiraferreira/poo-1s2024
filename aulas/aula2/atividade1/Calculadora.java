package aulas.aula2.atividade1;

public class Calculadora {
    Double nmbA;
    Double nmbB;

    Double somar() {
        return nmbA + nmbB;
    }

    Double subtrair() {
        return nmbA - nmbB;
    }

    Double multiplicar() {
        return nmbA * nmbB;
    }

    Double dividir() {
        return nmbA / nmbB;
    }

    Boolean verificarNmrPrimo(int nmb){
        return nmb % 2 == 1;
    }
}

