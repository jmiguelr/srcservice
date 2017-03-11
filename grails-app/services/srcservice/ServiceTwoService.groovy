package srcservice

import grails.transaction.Transactional

@Transactional
class ServiceTwoService {

    String serviceMethod( String anotherVar) {
        return "Hi, Im in serviceTwo with ${anotherVar}"
    }
}
