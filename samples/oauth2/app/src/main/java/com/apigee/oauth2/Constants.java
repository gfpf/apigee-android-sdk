package com.apigee.oauth2;

/**
 * Created by ApigeeCorporation on 11/20/14.
 */
public final class Constants {

    public static final String ORG_ID = "rwalsh";
    public static final String APP_ID = "sdk.demo";

    public static final int kAuthorizationCodeRequestCode = 1;
    public static final int kImplicitRequestCode = 1;

    public static final String kPasswordTokenStorageId = "passStorageId";
    public static final String kClientCredentialsTokenStorageId = "clientCredsStorageId";
    public static final String kAuthorizationCodeTokenStorageId = "authCodeStorageId";
    public static final String kImplicitTokenStorageId = "implStorageId";

    public static final String kAuthorizationCodeGrantType = "code";
    public static final String kImplicitGrantType = "token";

    public static final String kApigeePasswordGrantUsername = "OAuthTestUser";
    public static final String kApigeePasswordGrantPassword = "Password1";
    public static final String kApigeePasswordGrantTokenURLFormat = "https://api.usergrid.com/%s/%s/token";
    public static final String kApigeePasswordGrantUserInfoURLFormat = "https://api.usergrid.com/%s/%s/users/%s";

    public static final String kApigeeClientCredentialsClientID = "lwjcjHK78Dl9eqqICFqYMZGqvxvGP2Uq";
    public static final String kApigeeClientCredentialsClientSecret = "VnEjVv6aANiGFUct";
    public static final String kApigeeClientCredentialsGrantTokenURLFormat = "https://%s-test.apigee.net/oauth/client_credential/accesstoken";
    public static final String kApigeeClientCredentialsWeatherInfoURLFormat = "https://%s-test.apigee.net/v0/weather/forecastrss?w=12797282";

    public static final String kFacebookClientID = "199268823468140";
    public static final String kFacebookClientSecret = "5437288538aa70ac5032d7ab7987e866";
    public static final String kFacebookPostMessage = "Hello World";

    public static final String kFacebookAuthorizeURL = "https://graph.facebook.com/oauth/authorize";
    public static final String kFacebookTokenURL = "https://graph.facebook.com/oauth/access_token";
    public static final String kFacebookGetEmailURL = "https://graph.facebook.com/me?fields=email";
    public static final String kFacebookPostOnWallURL = "https://graph.facebook.com/me/feed";
    public static final String kFacebookRedirectURL = "http://blahblah.com/";
}
