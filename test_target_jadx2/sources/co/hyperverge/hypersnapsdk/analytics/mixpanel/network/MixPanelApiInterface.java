package co.hyperverge.hypersnapsdk.analytics.mixpanel.network;

import De.InterfaceC0818b;
import Fe.k;
import Fe.o;
import Fe.t;

@Deprecated
/* loaded from: classes.dex */
public interface MixPanelApiInterface {
    @k({"Accept: text/plain", "Content-Type: application/x-www-form-urlencoded"})
    @o("#past-events-batch")
    InterfaceC0818b<Object> postEvents(@t("data") String str);
}
