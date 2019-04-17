package com.testproject2;

import com.testproject2.service.NewServiceClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        NewServiceClass nwServiceClass = new NewServiceClass();        

        System.out.println( "Service class: " + nwServiceClass.getServiceLayer() );
    }
}
