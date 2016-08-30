
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

    import com.google.gson.JsonObject;
    import pl.passworder.object.database.DefaultDatabase;
    import pl.passworder.syntax.database.Database;

    public class Main {

        public static void main(String[] var0) {


            int t = 1;
            System.out.println(t);

            Database database = new DefaultDatabase(null, null, null, null, null, null);
            database.writeObject("tak.było.nie.zmyślam", null);


            JsonObject object = new JsonObject();
            object.getAsJsonObject("było");
        }
    }
