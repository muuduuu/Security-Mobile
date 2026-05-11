package androidx.camera.core.impl;

import A.AbstractC0700h0;
import A.C0696f0;
import A.C0716t;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14424a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f14425b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Set f14426c = new HashSet();

    public LinkedHashSet a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f14424a) {
            linkedHashSet = new LinkedHashSet(this.f14425b.values());
        }
        return linkedHashSet;
    }

    public void b(F f10) {
        synchronized (this.f14424a) {
            try {
                for (String str : f10.a()) {
                    AbstractC0700h0.a("CameraRepository", "Added camera: " + str);
                    this.f14425b.put(str, f10.b(str));
                }
            } catch (C0716t e10) {
                throw new C0696f0(e10);
            }
        }
    }
}
