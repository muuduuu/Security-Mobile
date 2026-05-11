package com.webengage.sdk.android;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class z0 {

    /* renamed from: a, reason: collision with root package name */
    Map<String, String> f31183a;

    public z0() {
        this.f31183a = null;
        HashMap hashMap = new HashMap();
        this.f31183a = hashMap;
        hashMap.put("utm_campaign", g4.f30583D.toString());
        this.f31183a.put("utm_source", g4.f30584E.toString());
        this.f31183a.put("utm_medium", g4.f30585F.toString());
        this.f31183a.put("utm_term", g4.f30586G.toString());
        this.f31183a.put("utm_content", g4.f30587H.toString());
        this.f31183a.put("gclid", g4.f30588I.toString());
    }

    public Map<String, Object> a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (this.f31183a.containsKey(split[0]) && split.length > 1) {
                hashMap.put(this.f31183a.get(split[0]), split[1]);
            }
        }
        return hashMap;
    }
}
