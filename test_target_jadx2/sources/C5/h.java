package C5;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    protected int f911a;

    protected h(int i10) {
        this.f911a = i10;
    }

    public static h a(g[] gVarArr) {
        if (gVarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", gVarArr[0].getClass().getName(), Integer.valueOf(gVarArr.length)));
        }
        int i10 = 0;
        for (g gVar : gVarArr) {
            if (gVar.enabledByDefault()) {
                i10 |= gVar.getMask();
            }
        }
        return new h(i10);
    }

    public h b(g gVar) {
        int mask = gVar.getMask() | this.f911a;
        return mask == this.f911a ? this : new h(mask);
    }
}
