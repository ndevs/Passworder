
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
         
    package pl.passworder.object.database; 
    
    /*
     * Class
     *
     * @name
     *     DefaultDatabase
     *
     * @package
     *     pl.passworder.object.database
     */

    import com.google.gson.Gson;
    import com.google.gson.JsonObject;
    import pl.passworder.syntax.database.Database;
    import pl.passworder.syntax.database.DatabaseDecoder;
    import pl.passworder.syntax.database.DatabaseEncoder;

    import java.nio.file.Path;
    import java.util.concurrent.ThreadPoolExecutor;

    public class DefaultDatabase implements Database {

        private Path path;
        private Gson gson;
        private JsonObject object;
        private DatabaseEncoder encoder;
        private DatabaseDecoder decoder;
        private ThreadPoolExecutor executor;

        public DefaultDatabase(Path var0, Gson var1, JsonObject var2, DatabaseEncoder var3, DatabaseDecoder var4, ThreadPoolExecutor var5) {
            this.path = var0;
            this.gson = var1;
            this.object = var2;
            this.encoder = var3;
            this.decoder = var4;
            this.executor = var5;
        }

        @Override
        public DatabaseEncoder getEncoder() {
            return this.encoder;
        }

        @Override
        public DatabaseDecoder getDecoder() {
            return this.decoder;
        }

        @Override
        public ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override
        public void writeObject(String var0, Object var1) {
//
//            String[] obj0 = var0.split("\\.");
//            for(int i=0; i < obj0.length; i++) {
//                System.out.println(obj0[i]);
//            }

        }

        @Override
        public void removeObject(String var0) {

        }

        @Override
        public boolean checkObject(String var0) {
//            String[] obj0 = var0.split("\\.");
//            boolean obj1 = false;
//            for(int i=0; i<obj0.length; i++) {
//                if(object.has(obj0[i])) {
//                    obj1 = true;
//                }
//
//
//            }
            return false;
        }

        @Override
        public <T> T readObject(String var0, Class<T> var1) {
            return null;
        }

        @Override
        public void load() throws Exception {

        }

        @Override
        public void save() throws Exception {

        }
    }
