import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;

public class Bot {

    private final TelegramBot bot = new TelegramBot("5458596407:AAEAeS33POzejMgsE65CxQ6uPM8m4EEV1a0");
    public void serve() {

        bot.setUpdatesListener(updates -> {
            updates.forEach(this::process);
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

        }

    private void process(Update update) {
        Message message = update.message();
        CallbackQuery callbackQuery = update.callbackQuery();

        BaseRequest request = null;

        if (message != null) {
            if (message.text().toLowerCase().equals("погладить кота")) {
                long chatId = message.chat().id();
                System.out.println(chatId);
                request = new SendMessage(chatId, new RandomDo().answer1());
            }
        }

        if (request != null) bot.execute(request);

    }
}


