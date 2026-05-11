package io.sentry;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: io.sentry.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3409f0 extends io.sentry.vendor.gson.stream.a {
    public C3409f0(Reader reader) {
        super(reader);
    }

    public static Date z0(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            return AbstractC3420j.e(str);
        } catch (Exception e10) {
            iLogger.b(K1.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", e10);
            try {
                return AbstractC3420j.f(str);
            } catch (Exception e11) {
                iLogger.b(K1.ERROR, "Error when deserializing millis timestamp format.", e11);
                return null;
            }
        }
    }

    public Boolean A0() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(n());
        }
        t();
        return null;
    }

    public Date O0(ILogger iLogger) {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return z0(x(), iLogger);
        }
        t();
        return null;
    }

    public Double Z0() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(o());
        }
        t();
        return null;
    }

    public Float a1() {
        return Float.valueOf((float) o());
    }

    public Float g1() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return a1();
        }
        t();
        return null;
    }

    public Integer i1() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(p());
        }
        t();
        return null;
    }

    public List l1(ILogger iLogger, Z z10) {
        if (z() == io.sentry.vendor.gson.stream.b.NULL) {
            t();
            return null;
        }
        a();
        ArrayList arrayList = new ArrayList();
        do {
            try {
                arrayList.add(z10.a(this, iLogger));
            } catch (Exception e10) {
                iLogger.b(K1.ERROR, "Failed to deserialize object in list.", e10);
            }
        } while (z() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        f();
        return arrayList;
    }

    public Long m1() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(q());
        }
        t();
        return null;
    }

    public Map o1(ILogger iLogger, Z z10) {
        if (z() == io.sentry.vendor.gson.stream.b.NULL) {
            t();
            return null;
        }
        b();
        HashMap hashMap = new HashMap();
        while (true) {
            try {
                hashMap.put(r(), z10.a(this, iLogger));
            } catch (Exception e10) {
                iLogger.b(K1.ERROR, "Failed to deserialize object in map.", e10);
            }
            if (z() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && z() != io.sentry.vendor.gson.stream.b.NAME) {
                g();
                return hashMap;
            }
        }
    }

    public Object t1() {
        return new C3406e0().e(this);
    }

    public Object v1(ILogger iLogger, Z z10) {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return z10.a(this, iLogger);
        }
        t();
        return null;
    }

    public String x1() {
        if (z() != io.sentry.vendor.gson.stream.b.NULL) {
            return x();
        }
        t();
        return null;
    }

    public TimeZone y1(ILogger iLogger) {
        if (z() == io.sentry.vendor.gson.stream.b.NULL) {
            t();
            return null;
        }
        try {
            return TimeZone.getTimeZone(x());
        } catch (Exception e10) {
            iLogger.b(K1.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    public void z1(ILogger iLogger, Map map, String str) {
        try {
            map.put(str, t1());
        } catch (Exception e10) {
            iLogger.a(K1.ERROR, e10, "Error deserializing unknown key: %s", str);
        }
    }
}
