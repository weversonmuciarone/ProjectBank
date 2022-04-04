
package nubank;
public class Nubank {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
            p1.setNumConta(1);
            p1.setDono("Weverson");
            p1.abrirConta("cc");

        ContaBanco p2 = new ContaBanco();
            p2.setNumConta(2);
            p2.abrirConta("cp");

            

            p1.estadoAtual();
            p2.estadoAtual();

        
        
            
    }
    
}
