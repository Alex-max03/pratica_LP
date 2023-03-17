import javax.swing.*;

public class Restaurante {

    public static void main(String[] args) {
        String opcao=JOptionPane.showInputDialog(null,"informe o seu pedido: \n,1 hamburguer \n , 2 pizza \n , 3 sair!");
        if(opcao.equals("1")) {
            String nome = JOptionPane.showInputDialog("informe qual sera o seu hamburguer:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do hamburguer: "));

            String artesanal = JOptionPane.showInputDialog("voce deseja hamburguer artesanal? s-sim\n n-nao ");
            boolean HamburguerArtesanal;
            if (artesanal.equals("s")) {
                HamburguerArtesanal = true;
            } else {
                HamburguerArtesanal = false;
            }
            Hamburguer H = new Hamburguer();

            H.nome = nome;
            H.valor = valor;
            double valorTotal = H.calcularValor(HamburguerArtesanal);
            JOptionPane.showInputDialog(null, "pedido" + valorTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);

        }
        else if (opcao.equals("2")){
            String nome=JOptionPane.showInputDialog("informe o nome da pizza");
            double valor =Double.parseDouble( JOptionPane.showInputDialog("informe o valor da pizza"));

            String borda=JOptionPane.showInputDialog("voce deseja borda? s-sim\n n-nao");
            boolean bordaParaCalculo;
            if(borda.equals("s")){
                bordaParaCalculo = true;
            }
            else {
                bordaParaCalculo = false;
            }
            Pizza p = new Pizza();
            p.nome = nome;
            p.valor = valor;


            double valorTotal= p.calcularValor(bordaParaCalculo);
            JOptionPane.showInputDialog(null,"pedido" + valorTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);
        }




        }
    }









