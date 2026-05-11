package com.webengage.sdk.android.utils.gifUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.exception.ImageLoadException;
import com.webengage.sdk.android.actions.render.g;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class WEGifHelper {

    /* renamed from: a, reason: collision with root package name */
    a f30909a = null;

    public a a() {
        return this.f30909a;
    }

    public Drawable loadGifFromByteArray(InputStream inputStream) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        try {
            createSource = ImageDecoder.createSource(a(inputStream, Integer.MAX_VALUE));
            decodeDrawable = ImageDecoder.decodeDrawable(createSource);
            return decodeDrawable;
        } catch (Exception e10) {
            Logger.e("WebEngage", e10.getMessage());
            return null;
        }
    }

    public Drawable loadGifFromFile(Context context, String str) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        try {
            File file = new File(WebEngageUtils.f(context).getAbsolutePath() + "/" + str);
            if (!file.exists()) {
                return null;
            }
            createSource = ImageDecoder.createSource(file);
            decodeDrawable = ImageDecoder.decodeDrawable(createSource);
            return decodeDrawable;
        } catch (Exception e10) {
            Logger.e("WebEngage", e10.getMessage());
            return null;
        }
    }

    public ArrayList<Bitmap> a(InputStream inputStream) {
        byte[] a10 = a(inputStream, Integer.MAX_VALUE);
        ArrayList<Bitmap> arrayList = new ArrayList<>();
        if (a10.length == 0) {
            return arrayList;
        }
        this.f30909a = a.a(a10);
        int i10 = 0;
        while (true) {
            a aVar = this.f30909a;
            if (i10 >= aVar.f30923N) {
                return arrayList;
            }
            arrayList.add(aVar.b(i10));
            i10++;
        }
    }

    public void a(RemoteViews remoteViews, List<Bitmap> list, Context context, int i10) {
        a a10 = a();
        g gVar = new g();
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Bitmap bitmap = list.get(i12);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.gif_item);
            i11 += a10.a(i12);
            gVar.a(bitmap, remoteViews2, R.id.gif_image);
            remoteViews.addView(i10, remoteViews2);
        }
        remoteViews.setInt(i10, "setFlipInterval", i11 / list.size());
    }

    public byte[] a(InputStream inputStream, int i10) {
        int read;
        try {
            if (i10 < 0) {
                throw new ImageLoadException("len < 0");
            }
            ArrayList<byte[]> arrayList = null;
            int i11 = 0;
            byte[] bArr = null;
            do {
                int min = Math.min(i10, 8192);
                byte[] bArr2 = new byte[min];
                int i12 = 0;
                while (true) {
                    read = inputStream.read(bArr2, i12, Math.min(min - i12, i10));
                    if (read <= 0) {
                        break;
                    }
                    i12 += read;
                    i10 -= read;
                }
                if (i12 > 0) {
                    if (2147483639 - i11 < i12) {
                        throw new ImageLoadException("Out of memory");
                    }
                    if (i12 < min) {
                        bArr2 = Arrays.copyOfRange(bArr2, 0, i12);
                    }
                    i11 += i12;
                    if (bArr == null) {
                        bArr = bArr2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            arrayList.add(bArr);
                        }
                        arrayList.add(bArr2);
                    }
                }
                if (read < 0) {
                    break;
                }
            } while (i10 > 0);
            if (arrayList == null) {
                if (bArr != null) {
                    return bArr.length == i11 ? bArr : Arrays.copyOf(bArr, i11);
                }
                throw new ImageLoadException("No byte to read");
            }
            byte[] bArr3 = new byte[i11];
            int i13 = 0;
            for (byte[] bArr4 : arrayList) {
                int min2 = Math.min(bArr4.length, i11);
                System.arraycopy(bArr4, 0, bArr3, i13, min2);
                i13 += min2;
                i11 -= min2;
            }
            return bArr3;
        } catch (Exception unused) {
            return new byte[0];
        }
    }
}
