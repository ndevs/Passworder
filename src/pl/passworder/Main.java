
    /*
     * File Header
     *
     * @project
     *      Passworder
     *
     * @copyright
     *      Copyright (c) 2016, Mr_Nestea
     *
     * @license
     *      Licensed under The MIT License
     *      For full copyright and license information, please see the ( LICENSE.txt )
     *      Redistributions of files must retain the above copyright notice.
     */

    package pl.passworder;

    /*
     * Class
     *
     * @name
     *     Main
     *
     * @package
     *     pl.passworder
     */

    import javafx.application.Application;
    import javafx.stage.Stage;

    import java.io.IOException;

    public class Main extends Application {

        public static void main(String[] var0) {
            launch(var0);
        }

        @Override
        public void start(Stage var0) throws IOException {

        }
    }

    //TODO: stworzyć jakąś klase odpowiadającą za ogarnianie konfiguracji, opcje itp itd, będzie on odpowiadać również za 'instalacje' stworzenie wszystkich plików itp itd
    //TODO: stworzyć jakiś główny obiekt trzymający wszystkie dane

    //TODO: Generatory do haseł: liczbowy, randomowy

    //TODO: Trzymać 'iv' do dekodowania i kodowania w rejestrze windowsowym, tak samo jak info czy program poprawnie działa :D
    //TODO: stworzyć opcje eksportowania i importowania ustawień i haseł z pliku

    //TODO: Kopiowanie haseł za pomocą skrótów klawiszowych, odpala sie okienko z lista wszystkich haseł, klikniecie na hasło spowoduje skopiowanie i zamknięcie okna
    //TODO: Kopiowanie haseł w szybki sposób, np. z danej grupy, skrót klawiszowy + liczba od 0 do 9


    //


    //configuration = ogarnia config programu, wszystkie opcje itp itd
    //database = zakodowana baza danych, ogarnia hasła itp itd
