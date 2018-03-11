package io.nuls.main;

import io.nuls.api.client.utils.RestFulUtils;
import io.nuls.api.server.ApiApplication;
import io.nuls.api.server.constant.RpcConstant;
import io.nuls.api.server.utils.PropertiesUtils;
import io.nuls.api.server.utils.StringUtils;

public enum Main {
    MAIN;

    private String ip;
    private String port;
    private String moduleUrl;
    private ApiApplication entry;

    public synchronized void init() {
        this.ip = PropertiesUtils.readProperty(RpcConstant.CFG_RPC_SERVER_IP);
        this.port = PropertiesUtils.readProperty(RpcConstant.CFG_RPC_SERVER_PORT);
        this.moduleUrl = PropertiesUtils.readProperty(RpcConstant.CFG_RPC_SERVER_URL);
        this.entry = ApiApplication.ENTRY;
    }

    public void startUp() {
        String serverUri;
        if (StringUtils.isBlank(ip) || StringUtils.isBlank(port)) {
            serverUri = entry.start(RpcConstant.DEFAULT_IP, RpcConstant.DEFAULT_PORT, RpcConstant.DEFAULT_URL);
        } else {
            serverUri = entry.start(ip, Integer.parseInt(port), moduleUrl);
        }
        RestFulUtils.getInstance().init(serverUri);
    }

    public static void main(String[] args) {
        Main.MAIN.init();
        Main.MAIN.startUp();
    }
}
