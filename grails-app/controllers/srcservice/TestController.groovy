package srcservice

class TestController {

    ServiceOneService serviceOneService
    def index() {
        String returnValue = serviceOneService.serviceMethod()
        render text: returnValue 
    }
}
