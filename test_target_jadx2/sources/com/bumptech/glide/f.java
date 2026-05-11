package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20244a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f20245a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f20244a = Collections.unmodifiableMap(new HashMap(aVar.f20245a));
    }

    public boolean a(Class cls) {
        return this.f20244a.containsKey(cls);
    }
}
