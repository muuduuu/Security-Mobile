package kc;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3560b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap a(Context context, Bitmap bitmap, int i10) {
        Allocation allocation;
        Allocation allocation2;
        Allocation allocation3;
        RenderScript create;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            create = RenderScript.create(context);
            try {
                create.setMessageHandler(new RenderScript.RSMessageHandler());
                allocation2 = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocation3 = Allocation.createTyped(create, allocation2.getType());
                } catch (Throwable th) {
                    th = th;
                    allocation3 = null;
                    scriptIntrinsicBlur = create;
                    allocation = allocation3;
                    if (scriptIntrinsicBlur != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (allocation3 != null) {
                        allocation3.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation2 = null;
                allocation3 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            allocation = null;
            allocation2 = null;
            allocation3 = null;
        }
        try {
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            scriptIntrinsicBlur.setInput(allocation2);
            scriptIntrinsicBlur.setRadius(i10);
            scriptIntrinsicBlur.forEach(allocation3);
            allocation3.copyTo(bitmap);
            RenderScript.releaseAllContexts();
            allocation2.destroy();
            allocation3.destroy();
            scriptIntrinsicBlur.destroy();
            return bitmap;
        } catch (Throwable th4) {
            th = th4;
            Allocation allocation4 = scriptIntrinsicBlur;
            scriptIntrinsicBlur = create;
            allocation = allocation4;
            if (scriptIntrinsicBlur != null) {
            }
            if (allocation2 != null) {
            }
            if (allocation3 != null) {
            }
            if (allocation != null) {
            }
            throw th;
        }
    }
}
