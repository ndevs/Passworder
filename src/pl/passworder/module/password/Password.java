
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
         
    package pl.passworder.module.password; 
    
    /*
     * Class
     *
     * @name
     *     Password
     *
     * @package
     *     pl.passworder.module.password
     */

    import java.util.Map;

    public class Password {

        private transient long id;
        private String name;
        private long created;
        private long modified;
        private String description;
        private Map<String, Object> fields;

    }
