package library.ravishankar.requestresponsemodule.factory;

/**
 * @author Chandni Patel
 * @since 02/12/2016
 */

import android.content.Context;

import java.util.Map;

import library.ravishankar.requestresponsemodule.R;
import library.ravishankar.requestresponsemodule.callbacks.ConnectionListener;
import library.ravishankar.requestresponsemodule.managers.RequestManager;
import library.ravishankar.requestresponsemodule.utils.Util;


public class ConnectionFactory extends ConnectRequest {


    public ConnectionFactory(Context context,String requestUrl,
                             ConnectionListener connectionListener) {
        super();
        mConnectionListener = connectionListener;
        this.mContext = context;
        this.mRequestUrl = requestUrl;
    }

    public void setPostParams(Map<String, String> postParams) {
        this.mPostParams = postParams;
    }

    public void setHeaderParams(Map<String, String> headerParams) {
        this.mHeaderParams = headerParams;
    }

    public void createConnection(int tag) {
        if(Util.isInternetAvailable(mContext)) {
            Connector connector = null;
            connector = new RequestManager(mContext, mConnectionListener, mRequestUrl, tag);
            if (mPostParams != null) {
                connector.setPostParams(mPostParams);
                connector.setHeaderParams(mHeaderParams);
            }
            connector.connect();
        } else {
            mConnectionListener.onError(ResponseResults.NO_INTERNET, tag, mContext.getString(R.string.error_no_internet));
        }
    }
}
