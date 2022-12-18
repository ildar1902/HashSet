package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    private void addAuto(Transport t) {
        transportQueue.offer(t);
        System.out.println(t.getBrand() + " " + t.getModel() + " добавлен в очередь");
    }

    public void add(Car car) {
        addAuto(car);
            }

    public void add(Truck truck) {
        addAuto(truck);
    }

    public void service() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            System.out.println(transport.getBrand() + " " + transport.getModel() + " - техосмотр пройден!");
        } else {
            System.out.println("Очередь пуста!");
        }
    }

}
