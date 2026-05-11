package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    private final List f35164d;

    public a(List list, ILogger iLogger) {
        super(iLogger);
        this.f35164d = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        TreeMap treeMap = new TreeMap();
        Iterator it = this.f35164d.iterator();
        while (it.hasNext()) {
            Map a10 = ((b) it.next()).a();
            if (a10 != null) {
                treeMap.putAll(a10);
            }
        }
        return treeMap;
    }
}
