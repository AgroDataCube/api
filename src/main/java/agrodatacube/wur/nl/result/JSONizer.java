/*
 * Copyright 2018 Wageningen Environmental Research
 *
 * For licensing information read the included LICENSE.txt file.
 *
 * Unless required by applicable law or agreed to in writing, this software
 * is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF
 * ANY KIND, either express or implied.
 */
package agrodatacube.wur.nl.result;

import com.google.gson.Gson;

/**
 *
 * @author Rande001
 */
public class JSONizer {
    
    static Gson instance = new Gson();
    
    public static String toJson(Object o) {
        return instance.toJson(o);
    }
}