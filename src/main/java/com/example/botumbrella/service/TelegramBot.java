package com.example.botumbrella.service;

import com.example.botumbrella.config.BotConfig;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    final BotConfig config;

    public TelegramBot(BotConfig config) {
        this.config = config;
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getBotToken();
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {

            String messageText = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            //System.out.println(update.getMessage());

            messageText = messageText.toLowerCase();

            switch (messageText) {
                case "!т6":
                    answerCommand(chatId, messageText);
                    break;
                case "!т8":
                    answerCommand(chatId, messageText);
                    break;
                case "!т11":
                    answerCommand(chatId, messageText);
                    break;
                case "!т12":
                    answerCommand(chatId, messageText);
                    break;
                case "!т13":
                    answerCommand(chatId, messageText);
                    break;
                case "!т14":
                    answerCommand(chatId, messageText);
                    break;
                case "!т15":
                    answerCommand(chatId, messageText);
                    break;
                case "!т16":
                    answerCommand(chatId, messageText);
                    break;
                case "!т17":
                    answerCommand(chatId, messageText);
                    break;
                case "!факс":
                    answerCommand(chatId, messageText);
                    break;
                case "!метро":
                    answerCommand(chatId, messageText);
                    break;
                    case "!петы":
                    answerCommand(chatId, messageText);
                    break;
            }
        }
    }

    private void answerCommand(Long chatId, String msg) {
        String answ = "q";
        switch (msg) {
            case "!т6":
                answ = "Без ограничений по уровню:\n" +
                        "⚪️6 ⌚️Часы Rolex (+12\uD83C\uDF93, +3\uD83D\uDD28) /buy_left6 > 1399 \uD83D\uDCB5\n" +
                        "⚪️6 \uD83D\uDCF1Nokia 3310 (+12\uD83D\uDD28, +3\uD83C\uDF93) /buy_right6 > 1399 \uD83D\uDCB5\n" +
                        "\n" +
                        "С 15 уровня:\n" +
                        "⚪️6 \uD83D\uDC5EБерцы (+13\uD83D\uDD28, +8\uD83D\uDC3F, +3\uD83C\uDF93) /buy_legs6 > 2849,\uD83D\uDCB5\n" +
                        "⚪️6 \uD83D\uDD76VR шлем (+13\uD83C\uDF93, +8\uD83D\uDC22, +3\uD83D\uDD28) /buy_head6 > 2849 \uD83D\uDCB5\n" +
                        "\n" +
                        "С 25 уровня:\n" +
                        "⚪️6 \uD83D\uDC54Костюм Berlini (+22\uD83D\uDC22, +6\uD83C\uDF93) /buy_chest6\n" +
                        "⚪️6 \uD83D\uDC55Тельняшка (+22\uD83D\uDC3F, +6\uD83D\uDD28) buy_torso6";
                break;
            case "!т8":
                answ = "С 29 уровня:\n" +
                        "\uD83D\uDD3510 \uD83D\uDCF1Hooli phone (+22\uD83D\uDD28, +9\uD83C\uDF93)\n" +
                        "/buy_right8 > 4 449 \uD83D\uDCB5\n" +
                        "\uD83D\uDD3510 ⌚️Umbrolex (+22\uD83C\uDF93, +9\uD83D\uDD28)\n" +
                        "/buy_left8 > 4 449 \uD83D\uDCB5\n" +
                        "\n" +
                        "С 30 уровня:\n" +
                        "\uD83D\uDD3510 \uD83D\uDC5EГолограмма ноги (+23\uD83D\uDD28, +14\uD83D\uDC3F, +9\uD83C\uDF93) /buy_legs8 > 8 819 \uD83D\uDCB5\n" +
                        "\uD83D\uDD3510 \uD83D\uDD76Шапка-ушанка (+23\uD83C\uDF93, +14\uD83D\uDC22, +9\uD83D\uDD28) /buy_head8 > 8 819 \uD83D\uDCB5\n" +
                        "\n" +
                        "С 31 уровня:\n" +
                        "\uD83D\uDD3510 \uD83D\uDC55Кофта АнтиХайп (+36\uD83D\uDC3F, +12\uD83D\uDD28) /buy_chest8 > 9 999 \uD83D\uDCB5\n" +
                        "\uD83D\uDD3510 \uD83D\uDC54Телепузо (+36\uD83D\uDC22, +12\uD83C\uDF93) /buy_torso8 > 9 999 \uD83D\uDCB5";
                break;
            case "!т11":
                answ = "\uD83C\uDF1EСет Летний, тир 11\n" +
                        "\n" +
                        "С 35 уровня\n" +
                        "\uD83D\uDCBBS-убноут (+15\uD83C\uDF93, +15\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DS=πR^2 (+15\uD83D\uDD28, +15\uD83D\uDC22)\n" +
                        "\n" +
                        "С 38 уровня\n" +
                        "\uD83D\uDCF1S-март (+29\uD83D\uDD28, +15\uD83C\uDF93)\n" +
                        "⌚️S-ейчас (+29\uD83C\uDF93, +15\uD83D\uDD28)\n" +
                        "\n" +
                        "С 39 уровня\n" +
                        "\uD83D\uDD76S-глаз (+27\uD83C\uDF93, +17\uD83D\uDC22, +10\uD83D\uDD28)\n" +
                        "\uD83D\uDC5ES-ланцы (+27\uD83D\uDD28, +17\uD83D\uDC3F, +10\uD83C\uDF93)\n" +
                        "\n" +
                        "С 40 уровня\n" +
                        "\uD83D\uDC55S-орочка (+43\uD83D\uDC3F, +15\uD83D\uDD28)\n" +
                        "\uD83D\uDC54S-витшот (+43\uD83D\uDC22, +15\uD83C\uDF93)\n" +
                        "\n" +
                        "Бонусы:\n" +
                        "Вторая попытка найти биржевиков ночью, если не сработала первая.\n" +
                        "+5% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+10% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке.\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т12":
                answ = "\uD83C\uDF42Сет Осень, тир 12\n" +
                        "\n" +
                        "С 39 уровня \n" +
                        "\uD83D\uDCBBMAC-адрес ноута (+20\uD83C\uDF93, +20\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DBat Ring (+20\uD83D\uDD28, +20\uD83D\uDC22)\n" +
                        "\n" +
                        "С 41 уровня \n" +
                        "\uD83D\uDCF1Tullp Phone (+33\uD83D\uDD28, +17\uD83C\uDF93)\n" +
                        "⌚️U-Time (+33\uD83C\uDF93, +17\uD83D\uDD28)\n" +
                        "\n" +
                        "С 42 уровня \n" +
                        "\uD83D\uDD76Линзы-Hooliнзы (+30\uD83C\uDF93, +19\uD83D\uDC22, +11\uD83D\uDD28)\n" +
                        "\uD83D\uDC5ERise of RoBoots (+30\uD83D\uDD28, +19\uD83D\uDC3F, +11\uD83C\uDF93)\n" +
                        "\n" +
                        "С 43 уровня \n" +
                        "\uD83D\uDC55Arc Reactor (+48\uD83D\uDC3F, +17\uD83D\uDD28)\n" +
                        "\uD83D\uDC54πджак (+48\uD83D\uDC22, +17\uD83C\uDF93)\n" +
                        "\n" +
                        "Бонусы:\n" +
                        "Шанс вернуть потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+5% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+10% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке.\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т13":
                answ = "Сет Снежный, тир 13\n" +
                        "\n" +
                        "С 42уровня\n" +
                        "\uD83D\uDCBBWinPP (+25\uD83C\uDF93, +25\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DПечать Ангела (+25\uD83D\uDD28, +25\uD83D\uDC22)\n" +
                        "\n" +
                        "С 44 уровня \n" +
                        "⌚️Z-Watch (+37\uD83C\uDF93,  +19\uD83D\uDD28)\n" +
                        "\uD83D\uDCF1Z-Phone (+37\uD83C\uDF93,  +19\uD83D\uDD28)\n" +
                        "\n" +
                        "С 45 уровня\n" +
                        "\uD83D\uDD76Концепт VRшлема (+33\uD83D\uDD28,  21\uD83D\uDC22,  12\uD83C\uDF93)\n" +
                        "\uD83D\uDC5EПодкаблучники (+33\uD83D\uDD28,  21\uD83D\uDC3F,  12\uD83C\uDF93)\n" +
                        "\n" +
                        "с 46 уровня\n" +
                        "\uD83D\uDC55SWитер от Мамы (+53\uD83D\uDC3F, +19\uD83D\uDD28)\n" +
                        "\uD83D\uDC54Форма мешка (+53\uD83D\uDC22, +19\uD83C\uDF93)\n" +
                        "\n" +
                        "Шанс вернуть 1 потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+8% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+15% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке.\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т14":
                answ = "\uD83D\uDC37Сет Свинтус, тир 14\n" +
                        "\n" +
                        "С 45 уровня \n" +
                        "\uD83D\uDCBBПевноут (+30\uD83C\uDF93, +30\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DМоя прелесть (+30\uD83D\uDD28, +30\uD83D\uDC22)\n" +
                        "\n" +
                        "С 47 уровня \n" +
                        "\uD83D\uDCF1GiftPhone (+41\uD83D\uDD28, +21\uD83C\uDF93)\n" +
                        "⌚️Drink Time (+41\uD83C\uDF93, +21\uD83D\uDD28)\n" +
                        "\n" +
                        "С 48 уровня \n" +
                        "\uD83D\uDD76Головограмма (+36\uD83C\uDF93, +23\uD83D\uDC22, +13\uD83D\uDD28)\n" +
                        "\uD83D\uDC5EBat-Galoshi (+36\uD83D\uDD28, +23\uD83D\uDC3F, +13\uD83C\uDF93)\n" +
                        "\n" +
                        "С 49 уровня \n" +
                        "\uD83D\uDC55Сердце Джарвиса (+58\uD83D\uDC3F, +21\uD83D\uDD28)\n" +
                        "\uD83D\uDC54Ягодный o-shhirt (+58\uD83D\uDC22, +21\uD83C\uDF93)\n" +
                        "\n" +
                        "Бонусы:\n" +
                        "Шанс вернуть всю потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+12% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+20% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т15":
                answ = "\uD83C\uDD98Сет 2020, тир 15\n" +
                        "\n" +
                        "С 45 уровня \n" +
                        "\uD83D\uDCBBБлокНотик (+35\uD83C\uDF93, +35\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DRing of PPower (+35\uD83D\uDD28, +35\uD83D\uDC22)\n" +
                        "\n" +
                        "С 47 уровня \n" +
                        "\uD83D\uDCF1CoVirusPhone (+45\uD83D\uDD28, +23\uD83C\uDF93)\n" +
                        "⌚️Chtozatime (+45\uD83C\uDF93, +23\uD83D\uDD28)\n" +
                        "\n" +
                        "С 48 уровня \n" +
                        "\uD83D\uDD76ХулятОчки (+39\uD83C\uDF93, +25\uD83D\uDC22, +14\uD83D\uDD28)\n" +
                        "\uD83D\uDC5EЛапки в Тапке (+39\uD83D\uDD28, +25\uD83D\uDC3F, +14\uD83C\uDF93)\n" +
                        "\n" +
                        "С 49 уровня\n" +
                        "\uD83D\uDC55Jill'етка (+63\uD83D\uDC3F, +23\uD83D\uDD28)\n" +
                        "\uD83D\uDC54ДождеWeak (+63\uD83D\uDC22, +23\uD83C\uDF93)\n" +
                        "\n" +
                        "Бонусы:\n" +
                        "+15%\uD83D\uDCA1 к получаемому Опыту.\n" +
                        "Шанс вернуть всю потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+12% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+20% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т16":
                answ = "\uD83C\uDF38Сет Весенний, тир 16\n" +
                        "\n" +
                        "С 48 уровня \n" +
                        "\uD83D\uDCBBWhyNote (+40\uD83C\uDF93, +40\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DRing of NaN (+40\uD83D\uDD28, +40\uD83D\uDC22)\n" +
                        "\n" +
                        "С 50 уровня \n" +
                        "\uD83D\uDCF1Пепейджер (+49\uD83D\uDD28, +25\uD83C\uDF93)\n" +
                        "⌚️Time to Win (+49\uD83C\uDF93, +25\uD83D\uDD28)\n" +
                        "\n" +
                        "С 51 уровня \n" +
                        "\uD83D\uDD76Робоглазки (+42\uD83C\uDF93, +27\uD83D\uDC22, +15\uD83D\uDD28)\n" +
                        "\uD83D\uDC5E NaNoBoots (+42\uD83D\uDD28, +27\uD83D\uDC3F, +15\uD83C\uDF93)\n" +
                        "\n" +
                        "С 52 уровня\n" +
                        "\uD83D\uDC55AlwaysInTop (+68\uD83D\uDC3F, +25\uD83D\uDD28)\n" +
                        "\uD83D\uDC54WayneStyle (+68\uD83D\uDC22, +25\uD83C\uDF93)\n" +
                        "\n" +
                        "Бонусы:  :\n" +
                        "+15% к получаемому Опыту.\n" +
                        "Шанс вернуть всю потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+12% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+20% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке.\n" +
                        "+15% шанс получить в 2 раза больше \uD83D\uDD29Сырья при переработке ⚙️.\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!т17":
                answ = "\uD83D\uDDF3Сет Логистик, тир 17\n" +
                        "\n" +
                        "С  51 уровня\n" +
                        "\uD83D\uDCBBЕ-нотик (+45\uD83C\uDF93, +45\uD83D\uDC3F)\n" +
                        "\uD83D\uDC8DКольцо Теней (+45\uD83D\uDD28, +45\uD83D\uDC22)\n" +
                        "\n" +
                        "С 53 уровня\n" +
                        "⌚️ItsTimeToStop (+53\uD83C\uDF93, +27\uD83D\uDD28)\n" +
                        "\uD83D\uDCF1Чёртов смартфон (+53\uD83D\uDD28, +27\uD83C\uDF93)\n" +
                        "\n" +
                        "С 54 уровня\n" +
                        "\uD83D\uDD76Толпызики (+45\uD83C\uDF93, +29\uD83D\uDC22, +16\uD83D\uDD28)\n" +
                        "\uD83D\uDC5EМезозавры (+45\uD83D\uDD28, +29\uD83D\uDC3F, +16\uD83C\uDF93)\n" +
                        "\n" +
                        "С 55 уровня\n" +
                        "\uD83D\uDC54ТелоGRAYка (+73\uD83D\uDC22, +27\uD83C\uDF93)\n" +
                        "\uD83D\uDC55RedQueenTop (+73\uD83D\uDC3F, +27\uD83D\uDD28)\n" +
                        "\n" +
                        "Бонусы:\n" +
                        "+15% к получаемому Опыту.\n" +
                        "Шанс вернуть всю потраченную \uD83D\uDD25Мотивацию при провале действий.\n" +
                        "+12% к шансу сохранить ресурсы при прокачке пета.\n" +
                        "+20% к шансу найти \uD83D\uDD29Сырьё на работе и прогулке.\n" +
                        "+15% шанс получить в 2 раза больше \uD83D\uDD29Сырья при переработке ⚙️.\n" +
                        "Шанс получить \uD83D\uDDF3Малый контейнер при ⛏Добыче и \uD83D\uDD28Крафте (себе и другим).\n" +
                        "\n" +
                        "Инженер: ☂️ /order_983207594 \uD83D\uDCBB\uD83D\uDC8D⌚️\uD83D\uDCF1\n" +
                        "Ткач: ☂️ @Andrey_Fr /order_220785143 \uD83D\uDD76\uD83D\uDC5E\uD83D\uDC55\uD83D\uDC54\n";
                break;
            case "!факс":
                answ = "\uD83D\uDCE0 SW факs с 5 уровня за 10 дней\n" +
                        "\n" +
                        "Инструкция по сборке.\n" +
                        "1. Потрать всю \uD83D\uDD25 Мотивацию на \uD83D\uDCBBРаботу /job или \uD83D\uDEB6Прогулку /walk\n" +
                        "\n" +
                        "2.Активируй сбор \uD83D\uDCE0 SW факs'а командами:\n" +
                        "Инвентарь /inv \n" +
                        "Артефакты /artefacts\n" +
                        "Факс /artr_fax\n" +
                        "Начать сборку.\n" +
                        "\n" +
                        "3. Следующие 10 дней всю \uD83D\uDD25 Мотивацию тратишь только на \uD83D\uDCBBРаботу /job.\n" +
                        "Не допускай заполнение \uD83D\uDD25 Мотивацию  до твоего максимума (\"горения\" мотивации). В противном случае ты теряешь потенциальные единицы мотивации, которые могли бы быть у тебя при наличии места под них. \n" +
                        "\n" +
                        "4. Пользуйся отложенными сообщениями (\"отложками\"). Если зажать кнопку отправки сообщения – тебе предложат отправить его с задержкой и указать время. На работу можно пойти командой /job, значит надо слить моту в 0 и далее просто откладывать смс с текстом /job с интервалом в 5-6 минут и час попеременно. \n" +
                        "Пример: https://t.me/c/1125878998/485613\n" +
                        "Среди нюансов:\n" +
                        "1) лучше первый интервал брать в 6 минут, чтобы персонаж точно успел вернуться с предыдущего похода. \n" +
                        "2) за 5 минут до битвы команда не сработает, т.к. нужно готовиться к битве. \n" +
                        "3) команда не сработает, если повысишь уровень, но не распределишь очки. \n" +
                        "\n" +
                        "Что даёт?\n" +
                        "\uD83D\uDCE0 SW факs даёт шанс удвоить доход на работе.\n" +
                        "На 100 уровне факs-а получаешь +4⚙️ при срабатывании.\n" +
                        "————————————";
                break;
            case "!метро":
                answ = "Краткий гайд по Метро \n" +
                        "\n" +
                        "Офис > Метро > Вход\n" +
                        "При входе тратиться 2 мотивации. \n" +
                        "\n" +
                        "1. В первую очередь в первый раз тебе нужно набрать \uD83D\uDD73 Жетонов, на которые можно покупать бафы для метро. \n" +
                        "Так же тебе важно знать, что в первый раз нельзя открывать \uD83D\uDCE6Сундуки и драться с \uD83D\uDC68 Продаванами. Они могут потрать твою \uD83D\uDD0B Выносливость до 0%, а в этом случае тебе придется покинуть метро принудительно. В следующие разы на \uD83D\uDD73 Жетоны ты сможешь купить ❤️ Аптечек и пополнять свою выносливать не выходя из метро. 1 ❤️ Аптечка пополняет 50 единиц \uD83D\uDD0B Выносливости.\n" +
                        "Так же тебе стоит знать, что, если ты покидаешь метро принудительно, то ты теряешь половину найденого, по этому стоит поискать \uD83D\uDEAAВыход, он находится внизу. \n" +
                        "\n" +
                        "2. Ждём 16 часов\n" +
                        "\n" +
                        "3. Идём прихватив с собой ❤️Аптечки(обязательно) и \uD83C\uDFC3Быстрый шаг. (если хватит \uD83D\uDD73)\n" +
                        "по пути открывая \uD83D\uDCE6Сундуки и ломая лица\uD83D\uDC68Продаванов, так же продолжай собирать \uD83D\uDD73 Жетоны \n" +
                        "\n" +
                        "4. Дальше проходим метро с бафами: \n" +
                        "     \uD83C\uDFC3Быстрый шаг за 20\uD83D\uDD73\n" +
                        "     ❤️Аптечки за 20\uD83D\uDD73\n" +
                        "\n" +
                        "И помни: за 15 мин до битвы тебя выкинут из метро забрав 2/3 от найденного.";
                break;
            case "!петы":
                answ = " Рекомендация по прокачке в плане порядковой очереди:\n" +
                        "1) \uD83D\uDD0BВыносливость - 50\n" +
                        "2) \uD83C\uDF40Удача - 50\n" +
                        "3) ❤️Преданность - 50 / \uD83D\uDD27Профи - 75\n" +
                        "5) \uD83D\uDC53Интеллект (По желанию )\n" +
                        "6) \uD83C\uDF40Удача - 150\n" +
                        "7) \uD83D\uDD27Профи  / ❤️Преданность - 150\n" +
                        "9) \uD83C\uDF40Удача - 300\n" +
                        "10) ❤️Преданность - 300 / \uD83D\uDD27Профи\n" +
                        "10) \uD83D\uDD0BВыносливость - 300\n" +
                        "11) \uD83D\uDC53Интеллект - 300";
                break;
        }
        ;


        sendMessage(chatId, answ);
    }

    private void sendMessage(Long chatId, String textSend) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(textSend);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            System.out.println(e);
        }

    }

}