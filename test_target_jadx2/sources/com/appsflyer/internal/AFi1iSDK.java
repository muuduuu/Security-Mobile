package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1iSDK implements AFi1kSDK {
    private PluginInfo getMediationNetwork = new PluginInfo(Plugin.NATIVE, "6.17.5", null, 4, null);

    @Override // com.appsflyer.internal.AFi1kSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        Map<String, Object> l10 = kotlin.collections.G.l(lc.t.a("platform", this.getMediationNetwork.getPlugin().getPluginName()), lc.t.a("version", this.getMediationNetwork.getVersion()));
        if (!this.getMediationNetwork.getAdditionalParams().isEmpty()) {
            l10.put("extras", this.getMediationNetwork.getAdditionalParams());
        }
        return l10;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getMediationNetwork = pluginInfo;
    }
}
