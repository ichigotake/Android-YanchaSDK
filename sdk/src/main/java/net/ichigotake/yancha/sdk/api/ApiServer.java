package net.ichigotake.yancha.sdk.api;

public interface ApiServer {

    ServerHost getServerHost();

    LoginApi getLoginApi();

    ServiceApi getServiceApi();
}
