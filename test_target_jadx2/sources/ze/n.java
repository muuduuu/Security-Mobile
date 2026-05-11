package ze;

/* loaded from: classes3.dex */
public enum n {
    block(true, false),
    inline(false, true),
    any(true, false),
    none(true, false);

    private boolean afterTagLineBreakNeeded;
    private boolean leadingAndEndWhitespacesAllowed;

    n(boolean z10, boolean z11) {
        this.afterTagLineBreakNeeded = z10;
        this.leadingAndEndWhitespacesAllowed = z11;
    }

    public boolean isAfterTagLineBreakNeeded() {
        return this.afterTagLineBreakNeeded;
    }

    public boolean isLeadingAndEndWhitespacesAllowed() {
        return this.leadingAndEndWhitespacesAllowed;
    }
}
