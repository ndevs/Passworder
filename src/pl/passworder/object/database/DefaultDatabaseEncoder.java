
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
     
    package pl.passworder.object.database; 
    
    /*
     * Class
     *
     * @name
     *     DefaultDatabaseEncoder
     *
     * @package
     *     pl.passworder.object.database
     */

    import pl.passworder.syntax.database.DatabaseEncoder;

    class DefaultDatabaseEncoder implements DatabaseEncoder {

        @Override
        public byte[] encode(byte[] var0) throws Exception {
            return new byte[0];
        }
    }