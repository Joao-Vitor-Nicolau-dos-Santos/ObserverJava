public class App {
    public static void main(String[] args) {
        PedidoSubject pedidoSubject = new PedidoSubject();

        Observer zap = new ZapObserver();
        Observer contabilidade = new ContabilidadeObserver();
        Observer email = new EmailObserver();
        Observer estoque = new EstoqueObserver();

        Pedido p1 = new Pedido();
        p1.setCodigo("2");
        p1.setCliente("João");
        p1.setValor(150.0);


        Pedido p2 = new Pedido();
        p2.setCodigo("1");
        p2.setCliente("Jonas");
        p2.setValor(125.0);

        pedidoSubject.orderChange(p1);
        pedidoSubject.orderChange(p2);

        pedidoSubject.register(zap);
        pedidoSubject.register(contabilidade);
        pedidoSubject.register(email);
        pedidoSubject.register(estoque);

        pedidoSubject.cancel(contabilidade);
        
        p2.setValor(250.0);
        pedidoSubject.orderChange(p2);
    }
}
