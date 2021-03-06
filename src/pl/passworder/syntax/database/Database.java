
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

    public interface Database {

        void load() throws Exception;

        void save() throws Exception;

    }
