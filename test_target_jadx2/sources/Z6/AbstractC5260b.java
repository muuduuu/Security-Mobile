package z6;

/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5260b {
    public static Object a(int i10, Object obj, InterfaceC5259a interfaceC5259a, InterfaceC5261c interfaceC5261c) {
        Object apply;
        if (i10 < 1) {
            return interfaceC5259a.apply(obj);
        }
        do {
            apply = interfaceC5259a.apply(obj);
            obj = interfaceC5261c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return apply;
    }
}
