package asia.leadsgen.psp.exception;


import asia.leadsgen.psp.error.SystemError;

/**
 * Created by HungDX on 22-Jan-16.
 */
public class AuthorizationException extends SystemException {

    public AuthorizationException(SystemError error) {
        super(error);
    }
}
