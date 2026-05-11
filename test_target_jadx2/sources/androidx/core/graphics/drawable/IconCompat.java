package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f15912k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f15913a;

    /* renamed from: b, reason: collision with root package name */
    Object f15914b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f15915c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f15916d;

    /* renamed from: e, reason: collision with root package name */
    public int f15917e;

    /* renamed from: f, reason: collision with root package name */
    public int f15918f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f15919g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f15920h;

    /* renamed from: i, reason: collision with root package name */
    public String f15921i;

    /* renamed from: j, reason: collision with root package name */
    public String f15922j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f15913a) {
                case -1:
                    return (Icon) iconCompat.f15914b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f15914b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.f(), iconCompat.f15917e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f15914b, iconCompat.f15917e, iconCompat.f15918f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f15914b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f15914b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f15914b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        InputStream i11 = iconCompat.i(context);
                        if (i11 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        if (i10 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i11), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(i11));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f15919g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f15920h;
            if (mode != IconCompat.f15912k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f15913a = -1;
        this.f15915c = null;
        this.f15916d = null;
        this.f15917e = 0;
        this.f15918f = 0;
        this.f15919g = null;
        this.f15920h = f15912k;
        this.f15921i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        y0.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f15914b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        y0.b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f15917e = i10;
        if (resources != null) {
            try {
                iconCompat.f15914b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f15914b = str;
        }
        iconCompat.f15922j = str;
        return iconCompat;
    }

    private static String n(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i10 = this.f15913a;
        if (i10 == -1) {
            Object obj = this.f15914b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f15914b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.f15914b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i10 = this.f15913a;
        if (i10 == -1) {
            return a.a(this.f15914b);
        }
        if (i10 == 2) {
            return this.f15917e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i10 = this.f15913a;
        if (i10 == -1) {
            return a.b(this.f15914b);
        }
        if (i10 == 2) {
            String str = this.f15922j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f15914b).split(":", -1)[0] : this.f15922j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i10 = this.f15913a;
        return i10 == -1 ? a.c(this.f15914b) : i10;
    }

    public Uri h() {
        int i10 = this.f15913a;
        if (i10 == -1) {
            return a.d(this.f15914b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f15914b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        Uri h10 = h();
        String scheme = h10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h10);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + h10, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f15914b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + h10, e11);
            return null;
        }
    }

    public void j() {
        this.f15920h = PorterDuff.Mode.valueOf(this.f15921i);
        switch (this.f15913a) {
            case -1:
                Parcelable parcelable = this.f15916d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f15914b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f15916d;
                if (parcelable2 != null) {
                    this.f15914b = parcelable2;
                    return;
                }
                byte[] bArr = this.f15915c;
                this.f15914b = bArr;
                this.f15913a = 3;
                this.f15917e = 0;
                this.f15918f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f15915c, Charset.forName("UTF-16"));
                this.f15914b = str;
                if (this.f15913a == 2 && this.f15922j == null) {
                    this.f15922j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f15914b = this.f15915c;
                return;
        }
    }

    public void k(boolean z10) {
        this.f15921i = this.f15920h.name();
        switch (this.f15913a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f15916d = (Parcelable) this.f15914b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f15916d = (Parcelable) this.f15914b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f15914b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f15915c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f15915c = ((String) this.f15914b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f15915c = (byte[]) this.f15914b;
                return;
            case 4:
            case 6:
                this.f15915c = this.f15914b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        return a.f(this, context);
    }

    public String toString() {
        if (this.f15913a == -1) {
            return String.valueOf(this.f15914b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(n(this.f15913a));
        switch (this.f15913a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f15914b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f15914b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f15922j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f15917e);
                if (this.f15918f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f15918f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f15914b);
                break;
        }
        if (this.f15919g != null) {
            sb2.append(" tint=");
            sb2.append(this.f15919g);
        }
        if (this.f15920h != f15912k) {
            sb2.append(" mode=");
            sb2.append(this.f15920h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f15915c = null;
        this.f15916d = null;
        this.f15917e = 0;
        this.f15918f = 0;
        this.f15919g = null;
        this.f15920h = f15912k;
        this.f15921i = null;
        this.f15913a = i10;
    }
}
