package baseball;

public class GameManager {
    private MessageManager messageManager = new MessageManager();
    private Data data = new Data();
    private GameProcessor gameProcessor = new GameProcessor();

    public void proceedIntro() {
        messageManager.showIntro();
        data.setUserInput(messageManager.getUserInput());

        gameProcessor.IllegalArgumentException(data);
    }

    public void proceedMainGame() {
        messageManager.showAnswer(data, gameProcessor, messageManager);
    }

}
