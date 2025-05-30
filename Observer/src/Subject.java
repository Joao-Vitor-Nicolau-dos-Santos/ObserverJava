public interface Subject {
    public void register(Observer observer);
    public void cancel(Observer observer);
    public void sendNotifications();
}
