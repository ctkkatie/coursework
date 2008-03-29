/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cuhk.csc4180.jStreamClient.LibHTTP;

import java.util.*;

/**
 *
 * @author hguan5
 */
public class HttpHeader {
    private Hashtable<String, String> m_headers;
    
    
    public HttpHeader(){
        m_headers = new Hashtable<String, String>();
    }
    
    public void add(String field, String value){
        m_headers.put(field, value);
    }
    
    public String retrieve(String field){
        return (String)m_headers.get(field);
    }
    
    @Override
    public String toString(){
        String str = null;
        String output = new String();
        for(Object obj: m_headers.keySet()){
            str = (String)obj;
            output += str + ": " + (String)m_headers.get(obj) + "\n";
        }
        return output;
    }

}