/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glg203.webservice;

import glg203.model.Temps;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rosmord
 */
@WebService(serviceName = "TempsService")
public class TempsService {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "getTemps")
    public Temps getTemps() {
        return new Temps();
    }
}
