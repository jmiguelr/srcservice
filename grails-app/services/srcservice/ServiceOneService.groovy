package srcservice

import grails.transaction.Transactional

@Transactional
class ServiceOneService {

    SourcePogo sourcePogo
    def serviceMethod() {
        return sourcePogo.goForIt("Value from serviceOne")

    }
}
