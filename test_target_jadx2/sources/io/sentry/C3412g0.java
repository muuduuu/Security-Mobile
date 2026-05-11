package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3412g0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3418i0 f35134a;

    public C3412g0(int i10) {
        this.f35134a = new C3418i0(i10);
    }

    private void b(A0 a02, ILogger iLogger, Collection collection) {
        a02.l();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(a02, iLogger, it.next());
        }
        a02.j();
    }

    private void c(A0 a02, ILogger iLogger, Date date) {
        try {
            a02.b(AbstractC3420j.g(date));
        } catch (Exception e10) {
            iLogger.b(K1.ERROR, "Error when serializing Date", e10);
            a02.i();
        }
    }

    private void d(A0 a02, ILogger iLogger, Map map) {
        a02.f();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                a02.k((String) obj);
                a(a02, iLogger, map.get(obj));
            }
        }
        a02.d();
    }

    private void e(A0 a02, ILogger iLogger, TimeZone timeZone) {
        try {
            a02.b(timeZone.getID());
        } catch (Exception e10) {
            iLogger.b(K1.ERROR, "Error when serializing TimeZone", e10);
            a02.i();
        }
    }

    public void a(A0 a02, ILogger iLogger, Object obj) {
        if (obj == null) {
            a02.i();
            return;
        }
        if (obj instanceof Character) {
            a02.b(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            a02.b((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            a02.c(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            a02.e((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(a02, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(a02, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof InterfaceC3421j0) {
            ((InterfaceC3421j0) obj).serialize(a02, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(a02, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(a02, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(a02, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            a02.b(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(a02, iLogger, io.sentry.util.k.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            a02.c(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            a02.b(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            a02.b(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            a02.b(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            a02.b(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(a02, iLogger, io.sentry.util.k.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            a02.b(obj.toString());
            return;
        }
        try {
            a(a02, iLogger, this.f35134a.d(obj, iLogger));
        } catch (Exception e10) {
            iLogger.b(K1.ERROR, "Failed serializing unknown object.", e10);
            a02.b("[OBJECT]");
        }
    }
}
