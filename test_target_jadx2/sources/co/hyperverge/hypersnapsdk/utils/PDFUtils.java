package co.hyperverge.hypersnapsdk.utils;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PDFUtils {
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.PDFUtils";

    private PDFUtils() {
    }

    public static List<Bitmap> asBitmaps(File file) {
        HVLogUtils.d(TAG, "asBitmaps() called with: file = [" + file + "]");
        ArrayList arrayList = new ArrayList();
        try {
            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456));
            int pageCount = pdfRenderer.getPageCount();
            for (int i10 = 0; i10 < pageCount; i10++) {
                PdfRenderer.Page openPage = pdfRenderer.openPage(i10);
                Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                openPage.render(createBitmap, null, null, 1);
                arrayList.add(createBitmap);
                openPage.close();
            }
            pdfRenderer.close();
        } catch (Exception e10) {
            e = e10;
            String str = TAG;
            HVLogUtils.e(str, "asBitmaps() with: file = [" + file + "]: exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str, Utils.getErrorMessage(e));
            return arrayList;
        } catch (OutOfMemoryError e11) {
            e = e11;
            String str2 = TAG;
            HVLogUtils.e(str2, "asBitmaps() with: file = [" + file + "]: exception = [" + Utils.getErrorMessage(e) + "]", e);
            Log.e(str2, Utils.getErrorMessage(e));
            return arrayList;
        }
        return arrayList;
    }

    public static void checkIfPDFIsReadable(Uri uri, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            try {
                if (openFileDescriptor == null) {
                    throw new NullPointerException("parcelFileDescriptor is null");
                }
                new PdfRenderer(openFileDescriptor).close();
                openFileDescriptor.close();
            } finally {
            }
        } catch (Exception e10) {
            Log.e(TAG, "exception: " + e10.getMessage());
            throw e10;
        }
    }
}
