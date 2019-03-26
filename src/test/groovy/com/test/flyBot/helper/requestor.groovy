package com.test.flyBot.helper

import com.test.flyBot.ExceptionHelper
import com.test.flybot.util.Constants
import com.test.flybot.util.HeaderBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovyx.net.http.RESTClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class requestor {

    private static Logger logger = LoggerFactory.getLogger(requestor.class)

    static def restClient = new RESTClient(Constants.base_url)
    static def jsonSlurper = new JsonSlurper()

    static def contentType = "application/json"
    static def request

    static def requestToApi(String bankAccount) {
        def response
        try {


            def correlationHeader = new HeaderBuilder().addXAuthToken().build()
            def path = Constants.endPoint
             request = [
                    "bankAccount": bankAccount,


            ]
            logger.info("\nRequest URL: " + restClient.getUri().toString() + path + "\nRequest data : " + JsonOutput.toJson(request))





            response = restClient.post(
                    headers: correlationHeader,
                    path: path,
                    requestContentType: contentType,
                    body: request
            )
            logger.info("\nRequest header "+correlationHeader.toString())

//            logger.info("Response data  : " + JsonOutput.toJson(response.data))
        return response
//        return JsonOutput.toJson(response.data)
        }
        catch (Exception ex) {
            return ExceptionHelper.handleException(ex)

        }
    }

    static def invalidRequestToApi(String bankAccount) {
        def response
        try {


            def correlationHeader = new HeaderBuilder().addinvalidXAuthToken().build()
            def path = Constants.endPoint
            request = [
                    "bankAccount": bankAccount,


            ]
            logger.info("\nRequest URL: " + restClient.getUri().toString() + path + "\nRequest data : " + JsonOutput.toJson(request))





            response = restClient.post(
                    headers: correlationHeader,
                    path: path,
                    requestContentType: contentType,
                    body: request
            )
            logger.info("\nRequest header "+correlationHeader.toString())

//            logger.info("Response data  : " + JsonOutput.toJson(response.data))
            return response
//        return JsonOutput.toJson(response.data)
        }
        catch (Exception ex) {
            return ExceptionHelper.handleException(ex)

        }
    }
}
