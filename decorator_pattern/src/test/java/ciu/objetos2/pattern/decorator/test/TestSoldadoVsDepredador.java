package ciu.objetos2.pattern.decorator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ciu.objetos2.pattern.decorator.model.ArmaduraEnemigo;
import ciu.objetos2.pattern.decorator.model.CascoEnemigo;
import ciu.objetos2.pattern.decorator.model.DepredadorEnemigo;
import ciu.objetos2.pattern.decorator.model.Enemigo;
import ciu.objetos2.pattern.decorator.model.Soldado;

public class TestSoldadoVsDepredador {

    @DisplayName("Test Enemigo a secas")
    @Test
	public void testEnemigo() {
    	Soldado destrozaitor = new Soldado();
    	Enemigo depredador = new DepredadorEnemigo();
    	assertEquals(100, destrozaitor.atacar(depredador));
	}

    @DisplayName("Test Enemigo con casco")
    @Test
	public void testEnemigoConCasco() {
    	Soldado destrozaitor = new Soldado();
    	Enemigo depredadorBase = new DepredadorEnemigo();
    	Enemigo depredadorConCasco = new CascoEnemigo(depredadorBase);
    	assertEquals(80, destrozaitor.atacar(depredadorConCasco));
	}

    @DisplayName("Test Enemigo con armadura")
    @Test
	public void testEnemigoConArmadura() {
    	Soldado destrozaitor = new Soldado();
    	Enemigo depredadorBase = new DepredadorEnemigo();
    	Enemigo depredadorConArmadura = new ArmaduraEnemigo(depredadorBase);
    	assertEquals(60, destrozaitor.atacar(depredadorConArmadura));
	}

    @DisplayName("Test Enemigo con casco y armadura")
    @Test
	public void testEnemigoConCascoYArmadura() {
    	Soldado destrozaitor = new Soldado();
    	Enemigo depredadorBase = new DepredadorEnemigo();
    	Enemigo depredadorConArmadura = new ArmaduraEnemigo(depredadorBase);
    	Enemigo depredadorConCascoYArmadura = new CascoEnemigo(depredadorConArmadura);
    	assertEquals(40, destrozaitor.atacar(depredadorConCascoYArmadura));
	}
}