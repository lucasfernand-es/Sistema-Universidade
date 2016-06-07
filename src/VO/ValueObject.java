/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author lucasfernandes
 */
public abstract class ValueObject {
    
    
    protected String message;

    public abstract long getId();

    public abstract void setId(long id);

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
}
