
package com.soap.client.generated;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "CountriesPort", targetNamespace = "http://countries")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountriesPort {


    /**
     * 
     * @param getCountryRequest
     * @return
     *     returns com.soap.client.generated.GetCountryResponse
     */
    @WebMethod
    @WebResult(name = "getCountryResponse", targetNamespace = "http://countries", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
        @WebParam(name = "getCountryRequest", targetNamespace = "http://countries", partName = "getCountryRequest")
        GetCountryRequest getCountryRequest);

}