package lesson12;

public class Meizu implements Photo,Phone {
    @Override
    public void call() {
        System.out.println("Meizu осуществляет звонок...");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Meizu отправляет смс...");

    }

    @Override
    public void doPhoto() {
        System.out.println("Делаем фото...");

    }

    @Override
    public void doVideo() {
        System.out.println("Делаем видео...");

    }
}
