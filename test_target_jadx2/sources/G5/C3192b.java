package g5;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3192b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3192b f33557a = new C3192b();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f33558b = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private C3192b() {
    }

    public static final String a(String message, ReadableArray stack) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stack, "stack");
        StringBuilder sb2 = new StringBuilder(message);
        sb2.append(", stack:\n");
        int size = stack.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = stack.getMap(i10);
            sb2.append(map.getString("methodName"));
            sb2.append("@");
            sb2.append(f33557a.b(map));
            if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                sb2.append(map.getInt("lineNumber"));
            } else {
                sb2.append(-1);
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb2.append(":");
                sb2.append(map.getInt("column"));
            }
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private final String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return BuildConfig.FLAVOR;
        }
        Matcher matcher = f33558b.matcher(string);
        if (!matcher.find()) {
            return BuildConfig.FLAVOR;
        }
        return matcher.group(1) + ":";
    }
}
