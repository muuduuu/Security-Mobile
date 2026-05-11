package ze;

/* loaded from: classes3.dex */
public enum m {
    all("all"),
    none("none"),
    text("text");

    private final String dbCode;

    m(String str) {
        this.dbCode = str;
    }

    public static m toValue(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            String trim = obj.toString().trim();
            for (m mVar : values()) {
                if (mVar.getDbCode().equalsIgnoreCase(trim) || mVar.name().equalsIgnoreCase(trim)) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public String getDbCode() {
        return this.dbCode;
    }
}
