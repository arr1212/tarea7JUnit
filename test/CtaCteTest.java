import static org.junit.jupiter.api.Assertions.*;

public class CtaCteTest {

    public CtaCte unaCuenta = new CtaCte();

    @org.junit.jupiter.api.Test
    void depositoTest() {
        int dinero = 150000;
        int result = unaCuenta.deposito (dinero);
        assertTrue(result>dinero);
    }

    @org.junit.jupiter.api.Test
    void depositoNegativoTest() {
        int dinero = -150000;
        int saldo = unaCuenta.consultaSaldo();
        int result = unaCuenta.deposito (dinero);
        assertTrue(saldo==result);
    }

    @org.junit.jupiter.api.Test
    void extraccionTest() {
        int dinero = -150000;
        boolean result = unaCuenta.extraccion (dinero);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void extraccionMayorSaldoTest() {
        int dinero = unaCuenta.consultaSaldo()+10;
        boolean result = unaCuenta.extraccion (dinero);
        assertFalse(result);
    }
}
