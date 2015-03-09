package com.xmpp.sample.model;

import com.xmpp.sample.model.DiscountCode;
import com.xmpp.sample.model.MicroMarket;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2014-08-29T17:36:13")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> addressline2;
    public static volatile SingularAttribute<Customer, MicroMarket> zip;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> addressline1;
    public static volatile SingularAttribute<Customer, Integer> customerId;
    public static volatile SingularAttribute<Customer, String> fax;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, Integer> creditLimit;
    public static volatile SingularAttribute<Customer, String> state;
    public static volatile SingularAttribute<Customer, DiscountCode> discountCode;
    public static volatile SingularAttribute<Customer, String> city;

}