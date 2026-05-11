package va;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import expo.modules.camera.records.CameraType;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f44067a = new e();

    private e() {
    }

    public static final int b(int i10, CameraType facing) {
        Intrinsics.checkNotNullParameter(facing, "facing");
        return facing == CameraType.FRONT ? (i10 + 270) % 360 : ((-i10) + 450) % 360;
    }

    public final byte[] a(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        float f10 = i10;
        float f11 = i11;
        canvas.drawRect(0.0f, 0.0f, f10, f11, paint);
        Paint paint2 = new Paint();
        paint2.setColor(-256);
        paint2.setTextSize(35.0f);
        canvas.drawText(new SimpleDateFormat("dd.MM.yy HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()), f10 * 0.1f, f11 * 0.9f, paint2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
