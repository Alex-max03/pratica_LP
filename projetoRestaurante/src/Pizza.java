public class Pizza {
    public String nome;
    public Double valor;
    public Boolean possuiBorda;

    public Double calcularValor(Boolean possuiBorda){
        if(possuiBorda) {
            return valor + 5.00;
        }
        return valor;
        }
        public String BuscarNome(){
        return nome;

    }
}
