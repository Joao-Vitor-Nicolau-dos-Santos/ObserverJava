public class EmailObserver implements Observer {
    @Override
    public void processOrder(Pedido pedido) {
        System.out.println("Email: Pedido " + pedido.getCodigo() + " do cliente " + pedido.getCliente() + " no valor de R$" + pedido.getValor() + " foi processado.");
    }
}
