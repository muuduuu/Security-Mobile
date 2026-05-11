package R5;

import java.text.DateFormat;
import java.util.Date;

/* renamed from: R5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1138k extends AbstractC1139l {

    /* renamed from: f, reason: collision with root package name */
    public static final C1138k f8500f = new C1138k();

    public C1138k() {
        this(null, null);
    }

    @Override // R5.AbstractC1139l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C1138k x(Boolean bool, DateFormat dateFormat) {
        return new C1138k(bool, dateFormat);
    }

    protected long y(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // R5.H, D5.o
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(Date date, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (v(b10)) {
            fVar.Z0(y(date));
        } else {
            w(date, fVar, b10);
        }
    }

    public C1138k(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
