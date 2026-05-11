package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a f20318b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f20319a = new HashMap();

    class a implements e.a {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Object f20320a;

        b(Object obj) {
            this.f20320a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f20320a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            D2.k.d(obj);
            aVar = (e.a) this.f20319a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f20319a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f20318b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f20319a.put(aVar.a(), aVar);
    }
}
