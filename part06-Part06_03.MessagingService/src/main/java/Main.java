
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService newMS = new MessagingService();

        Message message1 = new Message("Manu", "Hola");

        newMS.add(message1);

        for (Message m : newMS.getMessages()) {
            System.out.println(m);
        }

        Message message2 = new Message("Arrebo", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat ma1");
        Message message3 = new Message("Arrebo", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat ma12");

        newMS.add(message2);
        
        for (Message m : newMS.getMessages()) {
            System.out.println(m);
        }
        newMS.add(message3);
        
        for (Message m : newMS.getMessages()) {
            System.out.println(m);
        }
    }
}
