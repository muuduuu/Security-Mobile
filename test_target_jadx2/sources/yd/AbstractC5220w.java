package yd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yd.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5220w {

    /* renamed from: a, reason: collision with root package name */
    private final p0 f45568a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f45569b;

    /* renamed from: c, reason: collision with root package name */
    private final M f45570c;

    public AbstractC5220w(p0 howThisTypeIsUsed, Set set, M m10) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f45568a = howThisTypeIsUsed;
        this.f45569b = set;
        this.f45570c = m10;
    }

    public abstract M a();

    public abstract p0 b();

    public abstract Set c();

    public abstract AbstractC5220w d(Kc.f0 f0Var);

    public abstract int hashCode();
}
