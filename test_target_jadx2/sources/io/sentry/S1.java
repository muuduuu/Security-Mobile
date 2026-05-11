package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    private final R1 f34555a;

    /* renamed from: b, reason: collision with root package name */
    private final P1 f34556b;

    public S1(R1 r12, P1 p12) {
        this.f34555a = (R1) io.sentry.util.n.c(r12, "The SentryStackTraceFactory is required.");
        this.f34556b = (P1) io.sentry.util.n.c(p12, "The SentryOptions is required");
    }

    private io.sentry.protocol.x d(boolean z10, StackTraceElement[] stackTraceElementArr, Thread thread) {
        io.sentry.protocol.x xVar = new io.sentry.protocol.x();
        xVar.w(thread.getName());
        xVar.x(Integer.valueOf(thread.getPriority()));
        xVar.u(Long.valueOf(thread.getId()));
        xVar.s(Boolean.valueOf(thread.isDaemon()));
        xVar.z(thread.getState().name());
        xVar.q(Boolean.valueOf(z10));
        List a10 = this.f34555a.a(stackTraceElementArr);
        if (this.f34556b.isAttachStacktrace() && a10 != null && !a10.isEmpty()) {
            io.sentry.protocol.w wVar = new io.sentry.protocol.w(a10);
            wVar.e(Boolean.TRUE);
            xVar.y(wVar);
        }
        return xVar;
    }

    List a() {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return c(hashMap, null, false);
    }

    List b(List list, boolean z10) {
        return c(Thread.getAllStackTraces(), list, z10);
    }

    List c(Map map, List list, boolean z10) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            arrayList.add(d((thread == currentThread && !z10) || (list != null && list.contains(Long.valueOf(thread.getId()))), (StackTraceElement[]) entry.getValue(), (Thread) entry.getKey()));
        }
        return arrayList;
    }
}
