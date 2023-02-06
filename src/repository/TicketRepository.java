package repository;

import model.Ticket;
import model.VehicleType;

public interface TicketRepository {

    Ticket save(Ticket ticket);
    Ticket get(int ticketId);


}


/*
    Assume, DTO contains username and password as well
    we don't need password for business logic, so after validation, authentication and authorization, on controller layer,
    we only transfer the required data to the service layer.

    Don't send the exact DTO that came in API call to the service,
    either send params or create a new object to transfer the required attributes.
 */

/*
    1. validation -> proper uniform, dress, copy in school  || In coding, check whether the input data is correct or not.
    2. Authentication -> checking whether you are a student or not || letting you enter the system
    3. Authorization -> allowing you to attend facilities | letting you perform some actions.
 */