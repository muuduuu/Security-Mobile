package i2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 i2.b, still in use, count: 1, list:
  (r0v0 i2.b) from 0x001a: SPUT (r0v0 i2.b) (LINE:27) i2.b.DEFAULT i2.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3314b {
    PREFER_ARGB_8888,
    PREFER_RGB_565;

    public static final EnumC3314b DEFAULT = new EnumC3314b();

    static {
    }

    private EnumC3314b() {
    }

    public static EnumC3314b valueOf(String str) {
        return (EnumC3314b) Enum.valueOf(EnumC3314b.class, str);
    }

    public static EnumC3314b[] values() {
        return (EnumC3314b[]) $VALUES.clone();
    }
}
