package mb;

/* loaded from: classes2.dex */
public enum d {
    GRANTED("granted"),
    UNDETERMINED("undetermined"),
    DENIED("denied");

    private final String status;

    d(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }
}
