package ze;

/* renamed from: ze.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5279d {
    HEAD_AND_BODY("all"),
    HEAD("head"),
    BODY("body");

    private final String dbCode;

    EnumC5279d(String str) {
        this.dbCode = str;
    }

    public static EnumC5279d toValue(Object obj) {
        if (obj instanceof EnumC5279d) {
            return (EnumC5279d) obj;
        }
        if (obj != null) {
            String trim = obj.toString().trim();
            for (EnumC5279d enumC5279d : values()) {
                if (enumC5279d.getDbCode().equalsIgnoreCase(trim) || enumC5279d.name().equalsIgnoreCase(trim)) {
                    return enumC5279d;
                }
            }
        }
        return null;
    }

    public String getDbCode() {
        return this.dbCode;
    }
}
