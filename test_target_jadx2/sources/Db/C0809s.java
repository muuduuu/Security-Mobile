package Db;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import xc.C5142C;

/* renamed from: Db.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0809s extends AbstractC0812v {

    /* renamed from: Db.s$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1466a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1466a = iArr;
        }
    }

    public C0809s(boolean z10) {
        super(z10);
    }

    private final LocalDate i(long j10) {
        Instant ofEpochMilli;
        ZoneId systemDefault;
        ZonedDateTime atZone;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(j10);
        systemDefault = ZoneId.systemDefault();
        atZone = ofEpochMilli.atZone(systemDefault);
        localDate = atZone.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    @Override // Db.W
    public ExpectedType b() {
        return new ExpectedType(new SingleType(expo.modules.kotlin.jni.a.INT, null, 2, null), new SingleType(expo.modules.kotlin.jni.a.STRING, null, 2, null));
    }

    @Override // Db.W
    public boolean c() {
        return false;
    }

    @Override // Db.AbstractC0812v
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LocalDate e(Object value, C3862a c3862a) {
        DateTimeFormatter dateTimeFormatter;
        LocalDate parse;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            parse = LocalDate.parse((CharSequence) value, dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }
        if (value instanceof Long) {
            return i(((Number) value).longValue());
        }
        throw new UnexpectedException("Unknown argument type: " + C5142C.b(value.getClass()));
    }

    @Override // Db.AbstractC0812v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LocalDate f(Dynamic value, C3862a c3862a) {
        DateTimeFormatter dateTimeFormatter;
        LocalDate parse;
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = a.f1466a[value.getType().ordinal()];
        if (i10 == 1) {
            String asString = value.asString();
            dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            parse = LocalDate.parse(asString, dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return parse;
        }
        if (i10 == 2) {
            return i((long) value.asDouble());
        }
        throw new UnexpectedException("Unknown argument type: " + value.getType());
    }
}
