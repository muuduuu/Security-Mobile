package io.sentry.clientreport;

import io.sentry.EnumC3417i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35065a;

    public a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (e eVar : e.values()) {
            for (EnumC3417i enumC3417i : EnumC3417i.values()) {
                concurrentHashMap.put(new c(eVar.getReason(), enumC3417i.getCategory()), new AtomicLong(0L));
            }
        }
        this.f35065a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.h
    public List a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f35065a.entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long valueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new f(((c) entry.getKey()).b(), ((c) entry.getKey()).a(), valueOf));
            }
        }
        return arrayList;
    }

    @Override // io.sentry.clientreport.h
    public void b(c cVar, Long l10) {
        AtomicLong atomicLong = (AtomicLong) this.f35065a.get(cVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }
}
