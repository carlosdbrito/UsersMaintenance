package almeidabrito.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class UserNotFoundExceptionMapper implements ExceptionMapper<UserNotFoundException> {
    @Override
    public Response toResponse(UserNotFoundException exception) {
        //return Response.status(Response.Status.NOT_FOUND.getStatusCode(), reasonPhrase: "User not found!").build();
        //return Response.status(Response.Status.NOT_FOUND.getStatusCode()).build();
        return Response.status(Response.Status.NOT_FOUND)
                .entity("User not found!")
                .build();

    }
}
