package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final List f35082a;

    public c(List list) {
        this.f35082a = list;
    }

    @Override // io.sentry.config.f
    public String a(String str) {
        Iterator it = this.f35082a.iterator();
        while (it.hasNext()) {
            String a10 = ((f) it.next()).a(str);
            if (a10 != null) {
                return a10;
            }
        }
        return null;
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f35082a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((f) it.next()).getMap(str));
        }
        return concurrentHashMap;
    }
}
