package com.ds.tutorials.annotation;

public class AspectDemo {

    public static void main(String[] args)  {
        CustomerBo customerBo = new CustomerBoImpl();
        customerBo.addCustomer();
        customerBo.addCustomerAround("Dhana");
        customerBo.addCustomerReturnValue();
        try {
            customerBo.addCustomerThrowException();
        } catch (Exception e) {
        }

    }
}
