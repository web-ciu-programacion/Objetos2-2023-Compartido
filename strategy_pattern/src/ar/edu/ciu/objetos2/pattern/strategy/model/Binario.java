package ar.edu.ciu.objetos2.pattern.strategy.model;

/*
 * Concrete Strategy
 */
public class Binario implements Strategy {

	@Override
	public int producto(int num1, int num2) {
		int resultadoBinario = 0;
		for (int i = 0; i < num2; i++) {
			resultadoBinario = this.sumaBinaria(this.toBinary(num1), resultadoBinario);
		}
		return this.toDecimal(resultadoBinario);
	}

	private int sumaBinaria(int numeroBinario1, int numeroBinario2) {
        int x = 0;
        int Carry_Forward = 0;
        int[] Binary_Sum = new int[10];

        while (numeroBinario1 != 0 || numeroBinario2 != 0) {
            Binary_Sum[x++] = (int)((numeroBinario1 % 10 + numeroBinario2 % 10 + Carry_Forward) % 2);
            Carry_Forward = (int)((numeroBinario1 % 10 + numeroBinario2 % 10 + Carry_Forward) / 2);
            numeroBinario1 = numeroBinario1 / 10;
            numeroBinario2 = numeroBinario2 / 10;
        }
        if (Carry_Forward != 0) {
            Binary_Sum[x++] = Carry_Forward;
        }
		StringBuilder result = new StringBuilder();
        while (x >= 0) {
        	result.append(String.valueOf(Binary_Sum[x--]));
        }
        return Integer.valueOf(result.toString());
	}

	private int toBinary(int decimal) {
		if (decimal <= 0) {
			return 0;
		}

		StringBuilder binario = new StringBuilder();
		while (decimal > 0) {
			short residuo = (short) (decimal % 2);
			decimal = decimal / 2;
			binario.insert(0, String.valueOf(residuo));
		}
		return Integer.valueOf(binario.toString());
	}

	private int toDecimal(int binario) {
		int exponente = 0;
		int decimal = 0;
		int digito = 0;
		while (binario != 0) {
			digito = binario % 10;
			decimal = decimal + digito * (int) Math.pow(2, exponente);
			exponente++;
			binario = binario / 10;
		}
		return decimal;
	}
}
