
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
         
    package pl.passworder.syntax.configuration; 
    
    /*
     * Interface
     *
     * @name
     *     ConfigurationFactory
     *
     * @package
     *     pl.passworder.syntax.configuration
     */

    public interface Configuration {

        void setOption(String var0, Object var1);

        void removeOption(String var0);

        boolean checkOption(String var0);

        <T> T getOption(String var0, Class<T> var1);

        //

        void load() throws Exception;

        void save() throws Exception;

    }
