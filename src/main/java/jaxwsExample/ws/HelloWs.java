package jaxwsExample.ws;

import ejbs.EjbTest;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWs {

    public String sayHello(String name) {
        return "From ejb: ";
    }
}