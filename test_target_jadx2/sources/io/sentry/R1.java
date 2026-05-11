package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    private final P1 f34550a;

    public R1(P1 p12) {
        this.f34550a = p12;
    }

    public List a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.v vVar = new io.sentry.protocol.v();
                    vVar.t(b(className));
                    vVar.w(className);
                    vVar.s(stackTraceElement.getMethodName());
                    vVar.r(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        vVar.u(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    vVar.x(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(vVar);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f34550a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f34550a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
