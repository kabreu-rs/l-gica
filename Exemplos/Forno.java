public class Forno {

    int volume;
    int tensao;
    int potencia;
    int largura;
    int altura;
    int profundidade;
    boolean ligado = false;
    int temperatura;
    int timer;

    // int tick
    Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade) {

        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        // this.timer = timer;
    }

    int volume() {
        return this.volume;
    }

    int tensao() {
        return this.tensao;
    }

    int potencia() {
        return this.potencia;
    }

    int largura() {
        return this.largura;
    }

    int altura() {
        return this.altura;
    }

    int profundidade() {
        return this.profundidade;
    }

    int temperatura() {
        return this.temperatura;
    }

    boolean ligado() {
        return this.ligado;
    }

    void aumentarTemperatura() {
        if (temperatura() == 200) {
            temperatura += 20;
        } else if (temperatura() == 220) {
            temperatura += 30;
        } else if (temperatura() < 300) {
            temperatura += 50;
            ligado = true;
        }
    }

    void diminuirTemperatura() {
        if (temperatura() == 250) {
            temperatura -= 30;
        } else if (temperatura() == 220) {
            temperatura -= 20;
        } else if (temperatura() > 0) {
            temperatura -= 50;
        }
        if (temperatura == 0) {
            ligado = false;
        }

    }

    void setTimer(int tempo) {
        if (tempo == 0) {
            if (tempo == 0 && tempo <= 120) {
                this.ligado = false;
                temperatura = 0;
            }
        }

    }

    void  tick () {
        if (timer >  0 ) {
            if (timer -1 == 0) {
                this.ligado = false;
                temperatura = 0;                        
            }
            timer = timer - 1;
        } else{

        } else if (timer <= 0) {
            this.ligado = false;
            temperatura = 0;            
        }
        
    }    
    
}
