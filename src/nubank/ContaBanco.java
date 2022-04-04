package nubank;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
        
    }
    public void estadoAtual(){
        System.out.println("-----------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
}

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)) {
            this.setSaldo(50);
        } else if ("cp".equals(t)) {
            this.setSaldo(150);
        }
            System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada, por favor retire seu dinheiro no valor de " + this.getSaldo() + " reais.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em Débito, por favor acerte seu débito para que possamos fechar sua conta.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("ERRO! Impossivel depositar, sua conta consta como Fechada.");
        }
    }

    public void sacar(float vs) {
        if (this.getStatus()) {
            if (this.getSaldo() >= vs) {
                this.setSaldo(this.getSaldo() - vs);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar. Sua conta encontra se fechada.");
        }
    }

    public void pagarMensal() {
        int v = 0;
    if ("cc".equals(this.getTipo())){
        v = 12;
    } else if ("cp".equals(this.getTipo())){
        v = 20;
}
    if (this.getStatus()){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Pagamento da mensalidade realizado com sucesso da conta de " + this.getDono());
}   else {
        System.out.println("Impossivel pagar de uma conta fechada");
}
}
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

}
