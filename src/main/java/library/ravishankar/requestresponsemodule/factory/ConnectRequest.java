package library.ravishankar.requestresponsemodule.factory;

import android.content.Context;

import java.util.Map;

import library.ravishankar.requestresponsemodule.callbacks.ConnectionListener;


/**
 * @author Ravishankar Ahirwar
 * @since 21/01/2017.
 * @version 1.0
 */

public class ConnectRequest {
    protected Context mContext;
    protected String mRequestUrl;
    protected Map<String, String> mHeaderParams;
    protected Map<String, String> mPostParams;
    protected ConnectionListener mConnectionListener;
}
