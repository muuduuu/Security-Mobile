package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m8.InterfaceC3657a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private final A8.b f28447a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28448b = Collections.synchronizedMap(new HashMap());

    public y(A8.b bVar) {
        this.f28447a = bVar;
    }

    public void a(String str, g gVar) {
        JSONObject optJSONObject;
        InterfaceC3657a interfaceC3657a = (InterfaceC3657a) this.f28447a.get();
        if (interfaceC3657a == null) {
            return;
        }
        JSONObject i10 = gVar.i();
        if (i10.length() < 1) {
            return;
        }
        JSONObject g10 = gVar.g();
        if (g10.length() >= 1 && (optJSONObject = i10.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f28448b) {
                try {
                    if (optString.equals(this.f28448b.get(str))) {
                        return;
                    }
                    this.f28448b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", g10.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    interfaceC3657a.c("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    interfaceC3657a.c("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
