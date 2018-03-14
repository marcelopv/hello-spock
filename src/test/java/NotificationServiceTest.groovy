import com.marcelo.hellospock.services.NotificationService
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class NotificationServiceTest extends Specification {

    def "Checks that user receives offer message of utility type #utilityType"(String utilityType, String message) {
        given:"An instance of notification Service"
        def service = new NotificationService()

        expect:
        service.notifyMessage(utilityType) ==  message

        where:
        utilityType     ||      message
        "DSL"           ||      "You have a DSL offer!"
        "Electricity"   ||      "You have a Electricity offer!"
        "Gas"           ||      "You have a Gas offer!"

    }

}
