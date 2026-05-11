package g5;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3191a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3191a f33556a = new C3191a();

    private C3191a() {
    }

    public static final String a(ReadableMap readableMap) {
        if (readableMap != null && readableMap.getType("extraData") != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
