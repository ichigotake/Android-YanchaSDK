package net.ichigotake.yancha.sdk.api;

public class DemoApiServer implements ApiServer {

    private final ServerHost serverHost;

    public DemoApiServer() {
        this.serverHost = new DemoApiServerHost();
    }

    @Override
    public ServerHost getServerHost() {
        return serverHost;
    }

    @Override
    public LoginApi getLoginApi() {
        return new DemoLoginApi(getServerHost());
    }

    @Override
    public ServiceApi getServiceApi() {
        return new DemoServiceApi(getServerHost());
    }

}
