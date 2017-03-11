package srcservice

/**
 * Handcrafted by jmiguel on 11/03/17
 */

class SourcePogo {
    def serviceTwoService

    String goForIt( String aVariable) {
        return serviceTwoService.serviceMethod( aVariable )
    }
}
