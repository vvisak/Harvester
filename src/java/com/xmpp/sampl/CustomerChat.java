/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xmpp.sampl;

import com.kenai.jabberwocky.framework.To;
import com.kenai.jabberwocky.framework.message.Body;
import com.kenai.jabberwocky.framework.message.Message;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.xmpp.sample.model.Customer;

/**
 *
 * @author Visak
 */
@RequestScoped
@Message
@To("query@(_domain_)")
public class CustomerChat {
    
    @PersistenceContext EntityManager em;
    
    @Body("(body)")
    public List<Object> handleQuery(@Named("(body)") String id){
        List<Object> result = new LinkedList<Object>();
        int custId=0;
        try {
            custId=Integer.parseInt(id.trim());
        } catch (Exception e) {
            result.add("Exception: "+e.getMessage());
            return result;
        }
        Customer customer=em.find(Customer.class, custId);
        if(customer==null){
            result.add("Customer not found: "+custId);
        }else{
            result.add(customer.toString());
            result.add(customer);
        }
        
        return result;
    }
    
}
