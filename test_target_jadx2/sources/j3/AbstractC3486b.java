package j3;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3486b {
    public static int a(int i10, int i11) {
        return ((i10 + 31) * 31) + i11;
    }

    public static int b(Object obj, Object obj2) {
        return a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
