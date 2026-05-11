package co.hyperverge.hypersnapsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import co.hyperverge.hypersnapsdk.R;
import co.hyperverge.hypersnapsdk.helpers.SDKInternalConfig;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class UIUtils {
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.UIUtils";
    public static final int TOP_MARGIN = 90;

    public static int alphaOf(int i10) {
        return (int) ((hasAlpha(i10) ? ((i10 >>> 24) & 255) / 255.0f : 1.0f) * 100.0f);
    }

    public static Bitmap cropImageFromView(Bitmap bitmap, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int width = rect.width();
        int height = rect.height();
        float width2 = bitmap.getWidth() / view.getRootView().getWidth();
        float height2 = bitmap.getHeight() / view.getRootView().getHeight();
        int i12 = (int) (i10 * width2);
        int i13 = (int) (i11 * height2);
        int min = Math.min((int) (width * width2), bitmap.getWidth() - i12);
        int min2 = Math.min((int) (height * height2), bitmap.getHeight() - i13);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than zero.");
        }
        return Bitmap.createBitmap(bitmap, i12, i13, min, min2);
    }

    public static int dpToPx(Context context, float f10) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static Point getAppUsableScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static Bitmap getCircularCroppedBitmap(Bitmap bitmap, Integer num) {
        try {
            Bitmap createBitmap = bitmap.getWidth() > bitmap.getHeight() ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getHeight(), Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            float height = bitmap.getWidth() > bitmap.getHeight() ? bitmap.getHeight() / 2 : bitmap.getWidth() / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle(height, height, height, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return createBitmap;
        } catch (OutOfMemoryError e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            return null;
        }
    }

    public static RotateAnimation getInfiniteRotationAnimation() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        return rotateAnimation;
    }

    public static int getPercentageMargin(Context context) {
        return (int) (Math.min(getScreenWidth(), getScreenHeight()) * 0.2f);
    }

    public static Point getRealScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static Bitmap getRoundedCornerBitmap(Context context, Bitmap bitmap, double d10, float f10, int i10, boolean z10) {
        if (f10 >= 1.0f || !z10) {
            d10 = 0.0d;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int color = context.getResources().getColor(R.color.hv_white);
            Paint paint = new Paint();
            int i11 = (int) d10;
            Rect rect = new Rect(0, i11, bitmap.getWidth(), bitmap.getHeight() - i11);
            RectF rectF = new RectF(rect);
            float f11 = i10;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(color);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return createBitmap;
        } catch (Exception | OutOfMemoryError e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            SDKInternalConfig.getInstance().getErrorMonitoringService(context).sendErrorMessage(e10);
            return null;
        }
    }

    public static int getScreenBrightness(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "screen_brightness", 0);
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getTopMargin(Context context) {
        return (int) context.getResources().getDimension(R.dimen.margin_face_circle_top);
    }

    public static boolean hasAlpha(int i10) {
        return (i10 >>> 24) != 255;
    }

    public static boolean hasNavBar(Context context) {
        return getAppUsableScreenSize(context).y < getRealScreenSize(context).y;
    }

    public static boolean isSmallScreenDevice(DisplayMetrics displayMetrics) {
        return ((float) displayMetrics.heightPixels) / displayMetrics.density < 640.0f;
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static float pxToEm(DisplayMetrics displayMetrics, float f10) {
        return f10 > 0.0f ? f10 / displayMetrics.densityDpi : f10;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        switch (i10) {
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e10) {
            Log.e(TAG, Utils.getErrorMessage(e10));
            if (SDKInternalConfig.getInstance().getErrorMonitoringService() == null) {
                return null;
            }
            SDKInternalConfig.getInstance().getErrorMonitoringService().sendErrorMessage(e10);
            return null;
        }
    }

    public static void setScreenBrightness(Activity activity, int i10) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = 0.8f;
        activity.getWindow().setAttributes(attributes);
    }

    public static String toARGB(String str) {
        if (StringUtils.isEmptyOrNull(str)) {
            return null;
        }
        if (str.length() != 9) {
            return str;
        }
        int length = str.length();
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = length - 1;
            str = str.charAt(i11) + str.substring(0, i11);
        }
        return "#" + str.replace("#", BuildConfig.FLAVOR);
    }
}
