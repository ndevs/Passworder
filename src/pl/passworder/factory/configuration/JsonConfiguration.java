
    /*
     * File Header
     * 
     * @project
     *      Passworder
     *
     * @copyright
     *      Copyright (c) 2016, Kluczownik
     *
     * @license
     *      Licensed under The MIT License
     *      For full copyright and license information, please see the ( LICENSE.txt )
     *      Redistributions of files must retain the above copyright notice.
     */
     
    package pl.passworder.factory.configuration; 
    
    /*
     * Class
     *
     * @name
     *     JsonConfiguration
     *
     * @package
     *     pl.passworder.factory.configuration
     */

    import pl.passworder.syntax.configuration.Configuration;

    public class JsonConfiguration implements Configuration {

        @Override
        public void setOption(String var0, Object var1) {
            
        }

        @Override
        public void removeOption(String var0) {

        }

        @Override
        public boolean checkOption(String var0) {
            return false;
        }

        @Override
        public <T> T getOption(String var0, Class<T> var1) {
            return null;
        }

        @Override
        public void load() throws Exception {

        }

        @Override
        public void save() throws Exception {

        }
    }