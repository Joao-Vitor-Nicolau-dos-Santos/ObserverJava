import java.util.ArrayList;
import java.util.List;

public class PedidoSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private Pedido pedido;

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void cancel(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void sendNotifications() {
        for (Observer observer : this.observerList) {
            observer.processOrder(pedido);
        }
    }

    public void orderChange(Pedido pedido) {
        this.pedido = pedido;
        this.sendNotifications();
    }
}
