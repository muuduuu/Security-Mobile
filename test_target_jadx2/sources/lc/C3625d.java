package lc;

import java.io.Serializable;
import kotlin.Lazy;

/* renamed from: lc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3625d implements Lazy, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f37119a;

    public C3625d(Object obj) {
        this.f37119a = obj;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return true;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        return this.f37119a;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
