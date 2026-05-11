package ze;

/* loaded from: classes3.dex */
public enum j {
    required(false, true),
    optional(true, true),
    forbidden(true, false);

    private final boolean endTagPermitted;
    private final boolean minimizedTagPermitted;

    j(boolean z10, boolean z11) {
        this.minimizedTagPermitted = z10;
        this.endTagPermitted = z11;
    }

    public boolean isEndTagPermitted() {
        return this.endTagPermitted;
    }

    public boolean isMinimizedTagPermitted() {
        return this.minimizedTagPermitted;
    }
}
