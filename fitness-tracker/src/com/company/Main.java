package com.company;

/*Приложение позволяет указать вид тренировки: отжимание, скакалка, приседания.
Доступны команды: начать тренировку (запускается таймер тренировки),
закончить тренировку (таймер останавливается).
За отработанное время высчитывается количество потраченных калорий по формуле K*t=cal, где K - количество калорий в час,
затрачиваемое на определенный вид тренировки, t - время, засеченное трекером. От запуска к запуску программы данные должны
сохраняться и общее количество калорий - суммироваться.
Персистенция данных приложения с помощью ObjectOutputStream +5 баллов или JAXB + 10 баллов
Поддержка нескольких профилей пользователей приложением + 5 баллов
 */

import javax.naming.InvalidNameException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InvalidNameException, ClassNotFoundException {
        AppWorkout app = new AppWorkout ();
        app.run();
    }

}

