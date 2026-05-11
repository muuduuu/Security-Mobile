package r7;

/* renamed from: r7.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4205r6 implements Q0 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);

    private final int zzo;

    EnumC4205r6(int i10) {
        this.zzo = i10;
    }

    @Override // r7.Q0
    public final int zza() {
        return this.zzo;
    }
}
