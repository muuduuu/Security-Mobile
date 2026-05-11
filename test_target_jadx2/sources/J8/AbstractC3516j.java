package j8;

import V6.AbstractC1287s;

/* renamed from: j8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3516j extends Exception {
    protected AbstractC3516j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3516j(String str) {
        super(str);
        AbstractC1287s.h(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3516j(String str, Throwable th) {
        super(str, th);
        AbstractC1287s.h(str, "Detail message must not be empty");
    }
}
