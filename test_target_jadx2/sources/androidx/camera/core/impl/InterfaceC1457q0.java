package androidx.camera.core.impl;

import A.AbstractC0685a;
import android.util.Size;
import androidx.camera.core.impl.V;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1457q0 extends Q0 {

    /* renamed from: n, reason: collision with root package name */
    public static final V.a f14675n = V.a.a("camerax.core.imageOutput.targetAspectRatio", AbstractC0685a.class);

    /* renamed from: o, reason: collision with root package name */
    public static final V.a f14676o;

    /* renamed from: p, reason: collision with root package name */
    public static final V.a f14677p;

    /* renamed from: q, reason: collision with root package name */
    public static final V.a f14678q;

    /* renamed from: r, reason: collision with root package name */
    public static final V.a f14679r;

    /* renamed from: s, reason: collision with root package name */
    public static final V.a f14680s;

    /* renamed from: t, reason: collision with root package name */
    public static final V.a f14681t;

    /* renamed from: u, reason: collision with root package name */
    public static final V.a f14682u;

    /* renamed from: v, reason: collision with root package name */
    public static final V.a f14683v;

    /* renamed from: w, reason: collision with root package name */
    public static final V.a f14684w;

    /* renamed from: androidx.camera.core.impl.q0$a */
    public interface a {
        Object a(Size size);

        Object d(int i10);
    }

    static {
        Class cls = Integer.TYPE;
        f14676o = V.a.a("camerax.core.imageOutput.targetRotation", cls);
        f14677p = V.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f14678q = V.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f14679r = V.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f14680s = V.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f14681t = V.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f14682u = V.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f14683v = V.a.a("camerax.core.imageOutput.resolutionSelector", P.c.class);
        f14684w = V.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void E(InterfaceC1457q0 interfaceC1457q0) {
        boolean K10 = interfaceC1457q0.K();
        boolean z10 = interfaceC1457q0.A(null) != null;
        if (K10 && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC1457q0.S(null) != null) {
            if (K10 || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default Size A(Size size) {
        return (Size) f(f14679r, size);
    }

    default int B(int i10) {
        return ((Integer) f(f14677p, Integer.valueOf(i10))).intValue();
    }

    default boolean K() {
        return b(f14675n);
    }

    default int N() {
        return ((Integer) a(f14675n)).intValue();
    }

    default P.c S(P.c cVar) {
        return (P.c) f(f14683v, cVar);
    }

    default int V(int i10) {
        return ((Integer) f(f14676o, Integer.valueOf(i10))).intValue();
    }

    default int W(int i10) {
        return ((Integer) f(f14678q, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) f(f14681t, size);
    }

    default List l(List list) {
        return (List) f(f14682u, list);
    }

    default P.c m() {
        return (P.c) a(f14683v);
    }

    default List o(List list) {
        List list2 = (List) f(f14684w, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size u(Size size) {
        return (Size) f(f14680s, size);
    }
}
