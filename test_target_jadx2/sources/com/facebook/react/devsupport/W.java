package com.facebook.react.devsupport;

import java.util.HashMap;
import java.util.Map;
import pe.C3877e;
import pe.C3880h;
import pe.InterfaceC3879g;

/* loaded from: classes.dex */
class W {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3879g f21552a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21553b;

    /* renamed from: c, reason: collision with root package name */
    private long f21554c;

    public interface a {
        void a(Map map, long j10, long j11);

        void b(Map map, C3877e c3877e, boolean z10);
    }

    public W(InterfaceC3879g interfaceC3879g, String str) {
        this.f21552a = interfaceC3879g;
        this.f21553b = str;
    }

    private void a(C3877e c3877e, boolean z10, a aVar) {
        long O10 = c3877e.O(C3880h.n("\r\n\r\n"));
        if (O10 == -1) {
            aVar.b(null, c3877e, z10);
            return;
        }
        C3877e c3877e2 = new C3877e();
        C3877e c3877e3 = new C3877e();
        c3877e.b2(c3877e2, O10);
        c3877e.skip(r0.L());
        c3877e.J1(c3877e3);
        aVar.b(c(c3877e2), c3877e3, z10);
    }

    private void b(Map map, long j10, boolean z10, a aVar) {
        if (map == null || aVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f21554c > 16 || z10) {
            this.f21554c = currentTimeMillis;
            aVar.a(map, j10, map.get("Content-Length") != null ? Long.parseLong((String) map.get("Content-Length")) : 0L);
        }
    }

    private Map c(C3877e c3877e) {
        HashMap hashMap = new HashMap();
        for (String str : c3877e.F1().split("\r\n")) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    public boolean d(a aVar) {
        boolean z10;
        long j10;
        C3880h n10 = C3880h.n("\r\n--" + this.f21553b + "\r\n");
        C3880h n11 = C3880h.n("\r\n--" + this.f21553b + "--\r\n");
        C3880h n12 = C3880h.n("\r\n\r\n");
        C3877e c3877e = new C3877e();
        long j11 = 0L;
        long j12 = 0L;
        long j13 = 0L;
        Map map = null;
        while (true) {
            long max = Math.max(j11 - n11.L(), j12);
            long s10 = c3877e.s(n10, max);
            if (s10 == -1) {
                s10 = c3877e.s(n11, max);
                z10 = true;
            } else {
                z10 = false;
            }
            if (s10 == -1) {
                long size = c3877e.size();
                if (map == null) {
                    long s11 = c3877e.s(n12, max);
                    if (s11 >= 0) {
                        this.f21552a.b2(c3877e, s11);
                        C3877e c3877e2 = new C3877e();
                        j10 = j12;
                        c3877e.l(c3877e2, max, s11 - max);
                        j13 = c3877e2.size() + n12.L();
                        map = c(c3877e2);
                    } else {
                        j10 = j12;
                    }
                } else {
                    j10 = j12;
                    b(map, c3877e.size() - j13, false, aVar);
                }
                if (this.f21552a.b2(c3877e, 4096) <= 0) {
                    return false;
                }
                j11 = size;
                j12 = j10;
            } else {
                long j14 = j12;
                long j15 = s10 - j14;
                if (j14 > 0) {
                    C3877e c3877e3 = new C3877e();
                    c3877e.skip(j14);
                    c3877e.b2(c3877e3, j15);
                    b(map, c3877e3.size() - j13, true, aVar);
                    a(c3877e3, z10, aVar);
                    j13 = 0;
                    map = null;
                } else {
                    c3877e.skip(s10);
                }
                if (z10) {
                    return true;
                }
                j12 = n10.L();
                j11 = j12;
            }
        }
    }
}
