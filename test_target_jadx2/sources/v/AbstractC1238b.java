package V;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: V.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1238b {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f10596a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    AbstractC1238b() {
    }

    static AbstractC1238b d(int i10, Throwable th, double d10) {
        return new C1241d(i10, d10, th);
    }

    abstract double a();

    public abstract int b();

    public abstract Throwable c();
}
