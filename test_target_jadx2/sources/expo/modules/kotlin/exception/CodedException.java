package expo.modules.kotlin.exception;

import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\b\u0017\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", AppConstants.RETAKE_ERROR_CODE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "()V", C4870a.f43493a, "Ljava/lang/String;", "providedCode", "getCode", "()Ljava/lang/String;", "b", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class CodedException extends Exception {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32683c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String providedCode;

    /* renamed from: expo.modules.kotlin.exception.CodedException$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            String replace = new Regex("(.)([A-Z])").replace(new Regex("(Exception)$").replace(clazz.getSimpleName(), BuildConfig.FLAVOR), "$1_$2");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = replace.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return "ERR_" + upperCase;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CodedException(String str, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : th);
    }

    public final String getCode() {
        String str = this.providedCode;
        return str == null ? INSTANCE.a(getClass()) : str;
    }

    public CodedException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(String code, String str, Throwable th) {
        this(str, th);
        Intrinsics.checkNotNullParameter(code, "code");
        this.providedCode = code;
    }

    public CodedException() {
        this(null, null);
    }
}
