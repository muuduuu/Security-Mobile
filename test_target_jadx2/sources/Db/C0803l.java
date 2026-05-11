package Db;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Db.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0803l extends AbstractC0810t {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803l(Object convertedValue) {
        super(null);
        Intrinsics.checkNotNullParameter(convertedValue, "convertedValue");
        this.f1465a = convertedValue;
    }

    public final Object a() {
        return this.f1465a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0803l) && Intrinsics.b(this.f1465a, ((C0803l) obj).f1465a);
    }

    public int hashCode() {
        return this.f1465a.hashCode();
    }

    public String toString() {
        return "ConvertedValue(convertedValue=" + this.f1465a + ")";
    }
}
