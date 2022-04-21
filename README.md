# Configure the app
Open the OpenTokConfig file and configure the API_KEY, SESSION_ID, and TOKEN variables. You can obtain these values from your TokBox account.

# (Optional) Deploy a back end web service
For a production application, the SESSION_ID and TOKEN values must be generated by your app server application and passed to the client, because:

credentials would expire after a certain amount of time
credentials are lined to given session (all users would be connected to the same room)
To quickly deploy a pre-built server click at one of the Heroku buttons below. You'll be sent to Heroku's website and prompted for your OpenTok API Key and API Secret — you can obtain these values on your project page in your TokBox account. If you don't have a Heroku account, you'll need to sign up (it's free).

PHP server	Node.js server
Deploy	Deploy
Repository	Repository
Note: You can also build your server from scratch using one of the server SDKs.

After deploying the server open the ServerConfig file in this project and configure the CHAT_SERVER_URL with your domain to fetch credentials from the server:
```java
public static final String CHAT_SERVER_URL = "https://YOURAPPNAME.herokuapp.com";
```
Note that this application will ignore credentials in the OpenTokConfig file when CHAT_SERVER_URL contains a valid URL.

This is the code responsible for retrieving the credentials from web server:
```java
private void getSession() {
    Log.i(TAG, "getSession");

    Call<GetSessionResponse> call = apiService.getSession();

    call.enqueue(new Callback<GetSessionResponse>() {
        @Override
        public void onResponse(Call<GetSessionResponse> call, Response<GetSessionResponse> response) {
            GetSessionResponse body = response.body();
            initializeSession(body.apiKey, body.sessionId, body.token);
        }

        @Override
        public void onFailure(Call<GetSessionResponse> call, Throwable t) {
            throw new RuntimeException(t.getMessage());
        }
    });
}
```
