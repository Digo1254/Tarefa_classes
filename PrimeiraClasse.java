/**
 * @author Diego Henrique Estevam
 */

public class PrimeiraClasse {


    /**
     * Metodo para adicionar valor as variaveis
     *
     * @param args
     */
    public static void main(String args[]){
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(12);
        funcionario.setNome("Diego");
        System.out.println(funcionario.getCodigo());
        System.out.println(funcionario.getNome());


    }
}
