class Multiplicidad {
    constructor(num1, num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    esMultiplo() {
        if (this.num1 % this.num2 === 0) {
            console.log(`${this.num1} es múltiplo de ${this.num2}`);
        } else if (this.num2 % this.num1 === 0) {
            console.log(`${this.num2} es múltiplo de ${this.num1}`);
        } else {
            console.log(`${this.num1} y ${this.num2} no son múltiplos entre sí`);
        }
    }
}

const numeros = new Multiplicidad(12, 3);
numeros.esMultiplo();