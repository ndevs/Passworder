
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
         
    package pl.passworder.syntax.database; 
    
    /*
     * Interface
     *
     * @name
     *     Database
     *
     * @package
     *     pl.passworder.syntax.database
     */

    import java.util.concurrent.ThreadPoolExecutor;

    public interface Database {

        DatabaseEncoder getEncoder();

        DatabaseDecoder getDecoder();

        ThreadPoolExecutor getExecutor();

        //

        void writeObject(String var0, Object var1);

        void removeObject(String var0);

        boolean checkObject(String var0);

        <T> T readObject(String var0, Class<T> var1);

        //

        void load() throws Exception;

        void save() throws Exception;

    }
