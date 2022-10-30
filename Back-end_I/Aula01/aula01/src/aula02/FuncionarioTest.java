package aula02;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void Calculos(){
        Funcionario funcionario = new Efetivo("Lucas", "Ferreira","1234567890",10000.0,1.0,5000.0);
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Issao", "Takeuchi","123456789",1000,40);
        funcionario.pagamentoSalario();
    }

}
