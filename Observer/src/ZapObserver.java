public class ZapObserver implements Observer{
    @Override
    public void processOrder(Pedido pedido) {
        //Comunica com o Zap
        System.out.println("Zap: Pedido " + pedido.getCodigo() + " do cliente " + pedido.getCliente() + " no valor de R$" + pedido.getValor() + " foi processado.");
    }
}
