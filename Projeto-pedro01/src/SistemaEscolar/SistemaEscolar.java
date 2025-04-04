package SistemaEscolar;

public class SistemaEscolar {
    private String nome;
    private int rg;
    private int celular;
    private String nomeMae;
    private int Fila; // Atributo privado

    public String getNome(){
        return nome;
    }
    public int getRg(){
        return rg;
    }
    public int getCelular(){
        return celular;
    }
    public String getNomeMae(){
        return nomeMae;
    }
   
    public void setNome(String nome) {
		this.nome = nome;
	}
    public void setRg(int rg) {
		this.rg = rg;
	}
    public void setCelular(int celular) {
		this.celular = celular;
	}
    public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
        private int fila; // Atributo privado
    
        // Getter
        public int getFila() {
            return fila;
        }
    
        // Setter
        public void setFila(int Fila) {
            this.fila = Fila;
        }
    
        // Método privado que verifica a posição na fila
        private String verFila() {
            if (fila <= 1500) {
                return "Você ainda está longe da fila para ser chamado.";
            } else {
                return "Você ainda está longe da fila para ser chamado.";
        // <<< Faltou fechar essa chave aqui ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        }
    }
    
        // Método público que chama o método privado
        public String verPosicao() {
            return verFila();
        }
    
    }






