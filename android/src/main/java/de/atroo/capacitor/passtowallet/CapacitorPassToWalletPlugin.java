package de.atroo.capacitor.passtowallet;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorPassToWallet")
public class CapacitorPassToWalletPlugin extends Plugin {

    private CapacitorPassToWallet implementation = new CapacitorPassToWallet();


    @PluginMethod
    public void addToWallet(PluginCall call) {
        String value = call.getString("base64");

        JSObject ret = new JSObject();
        ret.put("value", implementation.addToWallet("Method not implemented on android."));
        call.resolve(ret);
    }

    @PluginMethod
    public void addMultipleToWallet(PluginCall call) {
        String value = call.getString("base64");

        JSObject ret = new JSObject();
        ret.put("value", implementation.addMultipleToWallet("Method not implemented on android."));
        call.resolve(ret);
    }

    @PluginMethod
    public void passExists(PluginCall call) {
        String value = call.getString("base64");

        JSObject ret = new JSObject();
        ret.put("value", implementation.passExists("Method not implemented on android."));
        call.resolve(ret);
    }
}
