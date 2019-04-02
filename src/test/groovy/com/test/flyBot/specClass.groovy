
package com.test.flyBot.helper.requestor

import com.test.flyBot.helper.requestor


import com.test.flybot.util.utils
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import org.junit.Rule
import org.junit.rules.TestName
import spock.lang.Specification
import spock.lang.Unroll

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import static com.test.flybot.util.utils.generateBankAccountNumber

class specClass extends Specification  {

    @Rule
    TestName testName = new TestName()

    final Logger logger = LoggerFactory.getLogger(specClass.class)
    def jsonSlurper = new JsonSlurper()

    static def scenarioCount = 1
    static def scenarioSerial = scenarioCount


    def setup() {
        logger.info("\n\n================================== Scenario (Sync) - " + testName.methodName + " =======================================\n")
        ++scenarioCount
        scenarioSerial = scenarioCount
    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Austria"() {
        given: "a valid bank account of Austria is provided"
        logger.info ("----------------------------a valid bank account of Austria is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Austria")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.responseBase.statusline.statusCode == responseStatus
        logger.info("Expected responseCode is 200")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        200 | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Germany"() {
        given: "a valid bank account of Germany is provided"
        logger.info ("----------------------------a valid bank account of Germany is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Germany")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.responseBase.statusline.statusCode == responseStatus
        logger.info("Expected responseCode is 200")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        200 | scenarioSerial
    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Switzerland"() {
        given: "a valid bank account of Switzerland is provided"
        logger.info ("----------------------------a valid bank account of Switzerland is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Switzerland")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.responseBase.statusline.statusCode == responseStatus
        logger.info("Expected responseCode is 200")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        200 | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Finland"() {
        given: "a valid bank account of Finland is provided"
        logger.info ("----------------------------a valid bank account of Finland is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Finland")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.responseBase.statusline.statusCode == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        200 | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Sweden"() {
        given: "a valid bank account of Sweden is provided"
        logger.info ("----------------------------a valid bank account of Sweden is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Sweden")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.data.riskCheckMessages.get(0).code == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        "200.909" | scenarioSerial
    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Norway"() {
        given: "a valid bank account of Norway is provided"
        logger.info ("----------------------------a valid bank account of Norway is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Norway")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.data.riskCheckMessages.get(0).code == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        "200.909" | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of Denmark"() {
        given: "a valid bank account of Denmark is provided"
        logger.info ("----------------------------a valid bank account of Denmark is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Denmark")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.data.riskCheckMessages.get(0).code == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        "200.909" | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with a valid bank account of non supported countries"() {
        given: "a valid bank account of non supported country is provided"
        logger.info ("----------------------------a valid bank account of non supported country is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Bulgaria")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString())

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.data.riskCheckMessages.get(0).code == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        "200.909" | scenarioSerial

    }

    @Unroll
    def " (#scenarioSerial) Request is made with an invalid bank account"() {
        given: "an invalid bank account is provided"
        logger.info ("----------------------------an invalid bank account is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Bulgaria")

        logger.info ("Bank Account: "+bankAccount.toString())
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.requestToApi(bankAccount.toString()+"156")

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response.data))
        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.data.riskCheckMessages.get(0).code == responseStatus
        logger.info("Expected responseCode is 200.909")
        logger.info("This is the response " + response.responseBase.statusline.statusCode)
        logger.info("Response is expected")

        where: "a set of other parameters"
        responseStatus | scenarioSerial
        "200.909" | scenarioSerial

    }

    @Unroll
    def "Request is made with short (<7) length"() {
        given: "an invalid bank account is provided"
        logger.info ("----------------------------an invalid bank account is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Bulgaria")

        logger.info ("Bank Account: "+bankAccount.toString().substring(0,6))
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.invalidRequestToApi(bankAccount.toString().substring(0,6))

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response))
//        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.message == "Authorization has been denied for this request."
        logger.info("Expected response is \"Authorization has been denied for this request.\"")
        logger.info("This is the response " + JsonOutput.toJson(response))
        logger.info("Response is expected")

    }

    @Unroll
    def "Request is made with long (>34) length"() {
        given: "an invalid bank account is provided"
        logger.info ("----------------------------an invalid bank account is provided----------------------------")
        def bankAccount = generateBankAccountNumber("Bulgaria")

        logger.info ("Bank Account: "+bankAccount.toString()+"000011236444546464")
        when: " We check for a bank account validation"
        logger.info ("We check for a bank account validation")
        def response = requestor.invalidRequestToApi(bankAccount.toString()+"000011236444546464000011236444546464")

//        def responseJson = JsonOutput.toJson(response)
        logger.info("This is the response " + JsonOutput.toJson(response))
//        logger.info("This is the response Code " + response.responseBase.statusline.statusCode)

        then: "we check if the response is correct or not"
        logger.info("we check if the response is correct or not")
        response.message == "Authorization has been denied for this request."
        logger.info("Expected response is \"Authorization has been denied for this request.\"")
        logger.info("This is the response " + JsonOutput.toJson(response))
        logger.info("Response is expected")
    }



}
