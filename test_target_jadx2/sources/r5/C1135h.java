package R5;

import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: R5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1135h extends AbstractC1139l {

    /* renamed from: f, reason: collision with root package name */
    public static final C1135h f8499f = new C1135h();

    public C1135h() {
        this(null, null);
    }

    @Override // R5.AbstractC1139l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C1135h x(Boolean bool, DateFormat dateFormat) {
        return new C1135h(bool, dateFormat);
    }

    protected long y(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // R5.H, D5.o
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(Calendar calendar, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        if (v(b10)) {
            fVar.Z0(y(calendar));
        } else {
            w(calendar.getTime(), fVar, b10);
        }
    }

    public C1135h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
