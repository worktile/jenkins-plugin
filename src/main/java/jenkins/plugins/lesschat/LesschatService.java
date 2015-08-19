package jenkins.plugins.lesschat;

public interface LesschatService {
    boolean publish(String message);

    boolean publish(String message, String color);
}
