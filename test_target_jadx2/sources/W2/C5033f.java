package w2;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5033f {

    /* renamed from: a, reason: collision with root package name */
    private final List f44286a = new ArrayList();

    /* renamed from: w2.f$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Class f44287a;

        /* renamed from: b, reason: collision with root package name */
        final Class f44288b;

        /* renamed from: c, reason: collision with root package name */
        final InterfaceC5032e f44289c;

        a(Class cls, Class cls2, InterfaceC5032e interfaceC5032e) {
            this.f44287a = cls;
            this.f44288b = cls2;
            this.f44289c = interfaceC5032e;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f44287a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f44288b);
        }
    }

    public synchronized InterfaceC5032e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C5034g.b();
        }
        for (a aVar : this.f44286a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f44289c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f44286a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f44288b)) {
                arrayList.add(aVar.f44288b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, InterfaceC5032e interfaceC5032e) {
        this.f44286a.add(new a(cls, cls2, interfaceC5032e));
    }
}
